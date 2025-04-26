public class User {
    String userId;
    String password;
    String email;
    String userType;

    public User(String userId, String password, String email, String userType) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void createUser() {
        System.out.println("email " + email + "by" + userId);
    }

    public void resetPassword() {
        System.out.println("password reseted " + userId);
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }
}