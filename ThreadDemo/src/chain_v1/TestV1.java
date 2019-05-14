package chain_v1;

public class TestV1 {

    public static void main(String[] args) {
        Request request = new Request();
        request.setName("来自曹进泉的请求");
        PrintProcess print = new PrintProcess();
        SaveProcess save = new SaveProcess(print);
        PreProcess pre = new PreProcess(save);
        pre.process(request);
    }
}
