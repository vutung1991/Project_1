import models.User;
import repositories.ReimbDAO;
import repositories.ReimbDAOImpl;
import repositories.UserDAO;
import repositories.UserDAOImpl;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        ReimbDAO reimbDAO = new ReimbDAOImpl();
//        userDAO.createUser(new User("kev123","pass123","Kev","Chi","kev@gmail.com",1));
//        System.out.println(userDAO.getUserGivenUsername("andy123"));
    }
}
