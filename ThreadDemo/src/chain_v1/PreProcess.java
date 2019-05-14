package chain_v1;

public class PreProcess implements IRequestProcess{

    private IRequestProcess process;

    public PreProcess(IRequestProcess process) {
        this.process = process;
    }

    @Override
    public void process(Request request) {
        System.out.println("预处理进行成功");
       process.process(request);
    }
}
