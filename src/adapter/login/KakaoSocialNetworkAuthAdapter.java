//package adapter.login;
//
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor
//public class KakaoSocialNetworkAuthAdapter implements SocialNetworkAuthTarget {
//    private final KakaoAccount kakaoAccount;
//
//    @Override
//    public String getServiceName() {
//        return "KAKAO";
//    }
//
//    @Override
//    public String getUserName() {
//        return kakaoAccount.getName();
//    }
//
//    @Override
//    public String getSecret() {
//        return KakaoAccount.KAKAO_SECRET;
//    }
//
//    @Override
//    public String getToken() {
//        return kakaoAccount.getAuthToken();
//    }
//}