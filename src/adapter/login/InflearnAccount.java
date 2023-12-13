package adapter.login;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class InflearnAccount {
    private final String email;
    private final String password;
    private final String username;
    public static final String INFLEARN_SECRET = "INF_SECRET";

    public String login() {
        // 인증 절차 생략
        System.out.println("인프런 로그인 성공");
        return email + INFLEARN_SECRET + password;
    }
}
