package adapter.login;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InflearnSocialNetworkAuthAdapter implements SocialNetworkAuthTarget {
    private final InflearnAccount inflearnAccount;

    @Override
    public String getServiceName() {
        return "INFLEARN";
    }

    @Override
    public String getUserName() {
        return inflearnAccount.getUsername();
    }

    @Override
    public String getSecret() {
        return InflearnAccount.INFLEARN_SECRET;
    }

    @Override
    public String getToken() {
        return inflearnAccount.login();
    }
}