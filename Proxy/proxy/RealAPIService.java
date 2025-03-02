package proxy;

public class RealAPIService implements APIService{
    @Override
    public void requestData(String userId) {
        System.out.println("Processing the Request for user: " + userId);
    }
}
