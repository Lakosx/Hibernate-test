import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[]args) throws SQLException {
        UserService userService = new UserService();
        User user = new User("Dima",20);
        userService.saveUser(user);
        Auto labma = new Auto("Labma", "black");
        labma.setUser(user);
        user.addAuto(labma);
        Auto lada = new Auto("lada", "blue");
        labma.setUser(user);
        user.addAuto(labma);
        userService.updateUser(user);
    }
}
