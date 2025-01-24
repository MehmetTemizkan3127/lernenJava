package calismalarimiz.proje01;

import j100projects.project04.film01.UserType;

public class User {


    String userName;
    String password;
    String mailAdress;
    final int maxLoginAttempt = 3;
    int loginAttempts;
    int userType;

    public User(String userName, String password, UserType userType) {

    }
}
    /*
    public static class User {


        String userName;
        String password;
        String mailAdress;
        final int maxLoginAttempt=3;
        int loginAttempts;
        int userType;




    }
}
*/