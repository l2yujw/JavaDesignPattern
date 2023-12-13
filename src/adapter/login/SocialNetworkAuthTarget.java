package adapter.login;

public interface SocialNetworkAuthTarget {
    String getServiceName();
    String getUserName();
    String getSecret();
    String getToken();
}
