package javacalismalarim.projelerimiz.filmtahminoyunu.filmbenimyaptigim;

public class UserLogin implements UserActions {
    @Override
    public boolean login(String username, String password) {
        return true;
    }

    @Override
    public void logout(String username) {

    }

    public int register(){

        return 0;
    }

    public User loginOrRegister() {
        return null;
    }
}
