package proxy;

public class Main {
    public static void main(String[] args) {
        // Create the real API service
        RealAPIService realService = new RealAPIService();

        // Create a proxy with a rate limit of 2 requests per user
        APIService apiService = new ProxyAPIService(realService, 2);

        System.out.println("\n--- User1 makes requests ---");
        apiService.requestData("User1");
        apiService.requestData("User1");
        apiService.requestData("User1"); // This request should be blocked

        System.out.println("\n--- User2 makes requests ---");
        apiService.requestData("User2");
        apiService.requestData("User2");
        apiService.requestData("User2"); // This request should be blocked
    }
}
