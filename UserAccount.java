public class UserAccount {

    private String username;
    private String password;
    private int status;

    public UserAccount(String username, String password, int status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean equals(UserAccount userAccount){
        if(status == userAccount.getStatus() && username.equals(userAccount.getUsername()) && password.equals(userAccount.getPassword())){
            return true;
        }else{
            return false;
        }
    }


}
