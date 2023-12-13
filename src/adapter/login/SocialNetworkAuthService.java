package adapter.login;

public interface SocialNetworkAuthService {
    static void socialLogin(SocialNetworkAuthTarget socialNetworkAuthTarget) {
        System.out.println("소셜 로그인을 시작합니다.");
        System.out.println("이용하는 서비스: " + socialNetworkAuthTarget.getServiceName());
        System.out.println("이름: " + socialNetworkAuthTarget.getUserName());
        System.out.println("토큰: " + socialNetworkAuthTarget.getToken());
    }
}
