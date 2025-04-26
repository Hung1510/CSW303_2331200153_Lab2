public class User {
    private String userId;
    private String password;
    private String email;
    private String userType;

    public User(String userId, String password, String email, String userType) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void createUser() {
        System.out.println(userId+email);
    }

    public void resetPassword() {
        System.out.println(userId);
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