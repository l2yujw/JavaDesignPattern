package iterator.studyGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository(getTestUserList());

        for (Iterator it = userRepository.getIterator(); it.hasNext();) {
            System.out.println("===========================================");
            User user = (User) it.next();
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println(user.getLoginId());
            System.out.println("===========================================");
        }
    }

    private static List<User> getTestUserList() {
        return new ArrayList<>(
                Arrays.asList(
                        new User("홍길동", 20, "gildong"),
                        new User("이순신", 50, "sunshin"),
                        new User("김첨지", 43, "chumji"),
                        new User("신사임당", 20, "imgentleman")
                )
        );
    }
}
