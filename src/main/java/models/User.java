package models;

/*Passing users_id, username, password, first_name,
 * last_name, dateCreated, email, role_id*/

public class User {

    private Integer id;             //ers_users_id
    private String username;        //ers_username
    private String password;        //ers_password
    private String firstname;       //user_first_name
    private String lastname;        //user_last_name
    private String email;           //user_email
    private Integer role_id;        //user_role_id
    private String role;            //user_role from ers_user_roles table

    public User() {
    }

    public User(Integer id, String username, String password, String firstname, String lastname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User(String username, String password, String firstname, String lastname, String email, Integer role_id) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role_id = role_id;
    }

//    public User(Integer id, String username, String password, String firstname, String lastname, String email, Integer role_id, String role) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.email = email;
//        this.role_id = role_id;
//        this.role = role;
//    }

    public User(Integer id, String username, String password, String firstname, String lastname, String email, Integer role_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role_id = role_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", role_id=" + role_id +
                ", role='" + role + '\'' +
                '}';
    }
}

