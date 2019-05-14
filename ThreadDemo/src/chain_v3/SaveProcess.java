package chain_v3;

public class SaveProcess extends BaseRequestProcess {
    public SaveProcess(IRequestProcess process) {
        super(process);
    }

    @Override
    protected void doSomethingYourself() {
        System.out.println("保存数据成功");
    }
}
