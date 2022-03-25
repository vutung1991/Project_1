package repositories;

import models.User;

import java.sql.*;

/*
* Connect to our postgresql on AWS using JDBC
*   - url
*       - syntax: jdbc:postgresql://[ENDPOINT]/[DATABASE_NAME]
*   - username
*   - password
*   - driver
*
*   Interfaces and classes of JDBC:
*   - Connection (interface) : active connection with the database
*   - DriverManager: retrieves the connection from our database
*   - Statement: Object Representation of the sql statement (does NOT prevent SQL injection)
*       - PreparedStatement : object representation of the sql statement (prevents SQL injection)
*   - ResultSet : object representation of the result
*
* */

public class UserDAOImpl implements UserDAO{
    String url = "jdbc:postgresql://kc-fsj-db.c98sqxlhzbxo.us-east-1.rds.amazonaws.com/ERS-project";
    String username = "postgres";
    String password = "p4ssw0rd";

    @Override
    public User getUserGivenUsername(String ers_username) {
        User user = null;

        //showing error for sql
        try {
            //retrieve active connection from our database
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);

            //Lệnh chạy trong DBeaver
            String sql = "SELECT * FROM ers_users WHERE ers_username = ?;";

            //preparing our sql statement
            PreparedStatement ps = conn.prepareStatement(sql); //add dong lệnh dong 36
            //adding the username into the question mark ?
            ps.setString(1, ers_username); //pass line 30 la String => setString.
                                                    // 1: vị trí của ? line 36 và thêm nhiều line 41
                                                    //chỉ cần khi có ?

            //DQL executing statement, ra kết quả từ ResultSet
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                user = new User(
                        rs.getInt(1),       // ID
                        rs.getString(2),    // Username
                        rs.getString(3),    // Password
                        rs.getString(4),    // Firstname
                        rs.getString(5),    // Lastname
                        rs.getString(6),    // Email
                        rs.getInt(7)        // Role ID

                );
            }


        } catch (SQLException sqle){
            sqle.printStackTrace(); //method to handle exceptions and errors
        }
        return user;
    }}

//    @Override
//    public void createUser(User ers_users) { //DML
//        try{
//            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
//
//            String sql = "INSERT INTO ers_users(ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) \n" +
//                    "VALUES (?, ?, ?, ?, ?, ?);";
//
//            PreparedStatement ps = conn.prepareStatement(sql);
//
//            ps.setString(1, ers_users.getUsername());
//            ps.setString(2, ers_users.getPassword());
//            ps.setString(3, ers_users.getFirstname());
//            ps.setString(4, ers_users.getLastname());
//            ps.setString(5, ers_users.getEmail());
//            ps.setInt(6, ers_users.getRole_id());
//
//            ps.executeUpdate(); //DML statement
//
//        }catch (SQLException sqle){
//            sqle.printStackTrace();
//        }
//
//    }
//}
