package chain_v3;

import java.util.concurrent.LinkedBlockingQueue;

public abstract class BaseRequestProcess extends Thread implements IRequestProcess {
    private LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();

    private IRequestProcess process;

    private volatile Boolean isFinish = false;

    public void shutdown(){
        isFinish = true;
    }

    public BaseRequestProcess(IRequestProcess process) {
        this.process = process;
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Request request = requests.take();
                doSomethingYourself();
                if( null != process)process.process(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract void doSomethingYourself();


    @Override
    public void process(Request request) {
        requests.add(request);
    }
}
