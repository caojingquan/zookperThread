package chain_v1;

public class PrintProcess implements IRequestProcess{

    @Override
    public void process(Request request) {
        System.out.println("打印完成");
    }

}
