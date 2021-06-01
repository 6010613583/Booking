public class GoogleLogin implements Authentication {

    public void login(String username, String password){
        System.out.println("Login with Faebook");
    }

    @Override
    public void logout() {
        System.out.println("Logout with Facebook");
    }
    
}
