package iterator.studyGroup;

import java.util.List;

public class UserIterator implements Iterator {

    private List<User> userList;

    int currentPosition = 0;

    public UserIterator(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < userList.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return userList.get(currentPosition ++);
        }

        return null;
    }
}
