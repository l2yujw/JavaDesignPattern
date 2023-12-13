package adapter.login;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class KakaoAccount {
    private final String id;
    private final String password;
    private final String name;
    private final String email;
    public static final String KAKAO_SECRET = "KA_SECRET";

    public String getAuthToken() {
        // 인증 절차 생략
        System.out.println("카카오 로그인 성공");
        return id + KAKAO_SECRET + password;
    }
}
