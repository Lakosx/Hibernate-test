import models.Auto;
import models.User;
import services.UserService;
import java.util.List;
import java.awt.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[]args) throws SQLException {
        UserService userService = new UserService();
        List<User> users= userService.findAllUsers();
        System.out.println(users.stream().findAny().toString());
    }
}
