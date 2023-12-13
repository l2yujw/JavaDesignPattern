package iterator.studyGroup;

import java.util.List;

public class UserRepository implements Container {

    private List<User> userList;

    public UserRepository(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public Iterator getIterator() {
        return  new UserIterator(this.userList);
    }
}
