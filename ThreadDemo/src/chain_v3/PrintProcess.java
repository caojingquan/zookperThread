package chain_v3;

public class PrintProcess extends BaseRequestProcess {
    public PrintProcess() { super(null); }

    @Override
    protected void doSomethingYourself() {
        System.out.println("打印完成");
    }
}
