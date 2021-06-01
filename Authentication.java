public interface Authentication {
    void login(String username, String password);
    void logout();
}
