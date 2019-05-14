package chain_v3;

public class PreProcess extends BaseRequestProcess {
    public PreProcess(IRequestProcess process) {
        super(process);
    }

    @Override
    protected void doSomethingYourself() {
        System.out.println("预处理完成");
    }
}
