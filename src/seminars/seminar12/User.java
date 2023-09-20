package seminars.seminar12;

public class User {
    private int userId;
    private int hashPass;
    private String email;
    private String login;
    private String question;

    public User(int userId, int hash, String email, String login, String question) {
        this.userId = userId;
        this.hashPass = hash;
        this.email = email;
        this.login = login;
        this.question = question;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHash() {
        return hashPass;
    }

    public void setHash(int hash) {
        this.hashPass = hash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (this.login.isEmpty()) {
            this.login = login;
        }
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
