package webclient;

public class MainCOP {

    public static void main(String[] args) {
        HttpClientServiceStrategy httpClientServiceStrategy = new HttpClientServiceStrategy(new HttpClientServiceDelete());
        httpClientServiceStrategy.executeStrategy();
        System.out.println("Delete");

        httpClientServiceStrategy = new HttpClientServiceStrategy(new HttpClientServicePost());
        httpClientServiceStrategy.executeStrategy();
        System.out.println("Post");


        httpClientServiceStrategy = new HttpClientServiceStrategy(new HttpClientServiceGet());
        httpClientServiceStrategy.executeStrategy();
        System.out.println("Get");

    }
}
