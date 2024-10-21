package webclient;

public class HttpClientServiceStrategy {
    private HttpClientService httpClientService;

    public HttpClientServiceStrategy(HttpClientService httpClientService) {
        this.httpClientService = httpClientService;
    }

    public void executeStrategy() {
        httpClientService.apiCall();
    }
}
