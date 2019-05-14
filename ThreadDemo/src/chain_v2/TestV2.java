package chain_v2;

public class TestV2 {

    public static void main(String[] args) {
        PrintProcess print = new PrintProcess();
        print.start();
        SaveProcess save = new SaveProcess(print);
        save.start();
        PreProcess pre = new PreProcess(save);
        pre.start();
        for (int i=0;i<100;i++){
            Request request = new Request();
            request.setName("来自曹进泉的请求"+i);
            pre.process(request);
        }
    }
}
