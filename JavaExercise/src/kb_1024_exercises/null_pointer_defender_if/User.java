package kb_1024_exercises.null_pointer_defender_if;

/**
 * @author n2god on 18/11/2019
 * @project PrivateProjects
 */
public class User {
    private String login;
    private String password;
    public final static User DEFAULT_USER = new User("annonymous", "password");

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
