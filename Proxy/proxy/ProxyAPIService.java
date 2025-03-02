package proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyAPIService implements APIService{
    private RealAPIService apiService;
    private Map<String, Integer> requestCounts;
    private final int requestLimit;

    public ProxyAPIService(RealAPIService apiService, int requestLimit) {
        this.apiService = apiService;
        this.requestCounts = new HashMap<>();
        this.requestLimit = requestLimit;
    }

    @Override
    public void requestData(String userId) {
        int currentCount = requestCounts.getOrDefault(userId, 0);

        if (currentCount >= requestLimit) {
            System.out.println("⛔ User " + userId + " exceeded the request limit.");
            return;
        }
        requestCounts.put(userId, currentCount + 1);
        apiService.requestData(userId);
    }
}
