package seminars.seminar12v2;

public class AccessRepo {
    private User user;
    private Group group;

    public AccessRepo(User user, Group group) {
        this.user = user;
        this.group = group;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    public User findUser(){
        return null;
    }
}
