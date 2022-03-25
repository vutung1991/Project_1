import controllers.ReimbController;
import controllers.SessionController;
import controllers.UserController;
import io.javalin.http.staticfiles.Location;
import models.JsonResponse;
import models.User;
import repositories.UserDAO;
import repositories.UserDAOImpl;
import io.javalin.Javalin;

public class MainDriver {
    public static void main(String[] args) {


        //Landing.view()
        Javalin app = Javalin.create(Config -> {Config.addStaticFiles("/", Location.CLASSPATH);}).start(9000); //run frontend
//        app.get("/", ctx -> ctx.result("Hello World"));

        UserController userController = new UserController();
        ReimbController reimbController = new ReimbController();
        SessionController sessionController = new SessionController();

//        app.post("/user", userController::createUser);
        app.post("/", userController::getUserGivenUsername);
//        app.delete("/logout", userController::logout);
//        app.get("/check", userController::checkSession);
//
        app.get("/reimb/all/{userId}",reimbController::getAllListsGivenUserID);
//        app.get("/list", reimbController::displayAllList);
//        app.post("/list", reimbController::createList);
//        app.delete("/list/{listId}", reimbController::deleteList);
//        app.patch("/approve/{id}", reimbController::approveReimbursement);
//        app.patch("/deny/{id}", reimbController::denyReimbursement);
//                app.post("/reimbs/create", reimbController::createReimb);

        app.post("/login", ctx -> {
            User credentials = ctx.bodyAsClass(User.class);

            User userFromDb = new User(1, credentials.getUsername(), credentials.getPassword(), "Andd", "Tall");

            ctx.sessionAttribute("user", userFromDb);

            ctx.json(new JsonResponse(true, "credentials valid"));
        });

        app.post("/session", sessionController::login);
        app.get("/session", sessionController::checkSession);

//        app.routes(() ->{
//            path("reimbursement",() ->{
//                get(reimbController::displayAllListForUser);
//                post(reimbController::createReimb);
//                path("{reimbId"},() -> {
//                    path(reimbController::processReimbursement);
//                    delete(reimbController::deleteReimbursement);
//            });
//        });
//            path("session",() ->{
//                post(sessionController::login);
//                get(sessionController::checkSession);
//                delete(sessionController::logout);
//            });
//
//            post("/user", userController::createUser);








    }

}
   




        


