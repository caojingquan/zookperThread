package chain_v2;

import java.util.concurrent.LinkedBlockingQueue;

public class PrintProcess extends Thread implements IRequestProcess {
    private LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();
    /**这边变量可以存储跳转其他区域的分支，可以不是这种类型*/
//    private IRequestProcess process;

    private volatile Boolean isFinish = false;

    public void shutdown(){
        isFinish = true;
    }

    public PrintProcess() {

    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Request request = requests.take();
                System.out.println("打印处理成功");

//                process.process(request);
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
