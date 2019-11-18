package kb_1024_exercises.null_pointer_defender_default_object;

import kb_1024_exercises.null_pointer_defender_if.*;


import java.util.Arrays;

/**
 * @author n2god on 18/11/2019
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
            User secondPablo = userService.getUserByLoginReturnsDefaultObject("pablo-2");
            System.out.println("Second pablo: " + secondPablo.getPassword());
    }
}
