package kb_1024_exercises.null_pointer_defender;

import kb_1024_exercises.null_pointer_defender.my_exceptions.UserNotFoundException;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author n2god on 17/11/2019
 * @project PrivateProjects
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(Arrays.asList(
                new User("admin", "admin"),
                new User("pablo", "escabo"),
                new User("kasia", "haslo kasi"),
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

        //return default object

        User secondPablo = userService.getUserByLoginReturnsDefaultObject("pablo-2");
        System.out.println("Second pablo: " + secondPablo.getPassword());

        Optional<User> foundKasia = userService.getUserByLoginReturnsOptional("kasia");
        if (foundKasia.isPresent()) {
            System.out.println("Found kasia: " + foundKasia.get());
        }


        User notFoundKasia = userService.getUserByLoginReturnsOptional("notFoundKasia").orElse(User.DEFAULT_USER);
        System.out.println("notFoundKasia: " + notFoundKasia.getPassword());

        //throw exception not default object when null
        try {
            User kasia = userService.getUserByLoginReturnsOptional("kasia")
                    .orElseThrow(() -> new UserNotFoundException("User with login Kasia not found."));
            System.out.println("kasia: " + kasia.getPassword());
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }



    }
}

