package chain_v1;

public class SaveProcess implements IRequestProcess{

    private IRequestProcess process;

    public SaveProcess(IRequestProcess process) {
        this.process = process;
    }

    @Override
    public void process(Request request) {
        System.out.println("保存数据成功");
        process.process(request);
    }
}
