package chain_v2;

import java.util.concurrent.LinkedBlockingQueue;

public class SaveProcess extends Thread implements IRequestProcess{
    private LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();

    private IRequestProcess process;

    private volatile Boolean isFinish = false;

    public void shutdown(){
        isFinish = true;
    }

    public SaveProcess(IRequestProcess process) {
        this.process = process;
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Request request = requests.take();
                System.out.println("保存数据成功");
                process.process(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void process(Request request) {
        requests.add(request);
    }
}
