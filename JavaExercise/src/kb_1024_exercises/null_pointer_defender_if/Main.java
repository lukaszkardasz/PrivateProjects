package kb_1024_exercises.null_pointer_defender_if;

import kb_1024_exercises.null_pointer_defender_if.my_exceptions.UserNotFoundException;

import java.util.Arrays;

/**
 * @author n2god on 17/11/2019
 * @project PrivateProjects
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(Arrays.asList(
                new User("admin", "admin"),
                new User("pablo", "escabo"),
                new User("kasia", "zyt"),
                new User("ufo", "porno")
        ));


        try {
            User pablo = userService.getuserByLoginReturnsNull("pablo");
            System.out.println("Pablo: " + pablo.getLogin());
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        User notFoundAdmin = null;
        try {
            User notFoundPablo = userService.getuserByLoginReturnsNull("notFoundPablo");
            System.out.println("NotFoundAdmin: " + notFoundPablo.getLogin());
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }

}
