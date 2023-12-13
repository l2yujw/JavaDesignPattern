package adapter.login;

public class Client {
    public static SocialNetworkAuthTarget getKakaoTarget() {
        KakaoAccount kakaoAccount = KakaoAccount
                .builder()
                .id("kakaoman")
                .password("kakaopassword")
                .email("kakaoman@kakao.com")
                .name("카카오제이크서")
                .build();

        return new KakaoSocialNetworkAuthAdapter(kakaoAccount);
    }

    public static SocialNetworkAuthTarget getInflearnTarget() {
        InflearnAccount inflearnAccount = InflearnAccount
                .builder()
                .email("me@naver.com")
                .password("mypassword")
                .username("인프런제이크서")
                .build();

        return new InflearnSocialNetworkAuthAdapter(inflearnAccount);
    }

    public static void main(String[] args) {
        SocialNetworkAuthService.socialLogin(getKakaoTarget());
        SocialNetworkAuthService.socialLogin(getInflearnTarget());
    }
}