package init.login;

public class Login {
    public static int loginTo(String logName, String logPass) {

        String name = "Bohdan";  //
        String pass = "pass";    //  Storage

        int validationPass = pass.length(); //

        if (logName.equals(name) && validationPass == logPass.length()) {
            System.out.println("Hello, Bohdan");
            return 1;
        } else {
            System.out.println("error: Your credential is incorrect");
            return 0;
        }
    }
}

//        if (logName.equals(name) && validationPass == logPass.length()){
//                System.out.println("Hello, Bohdan");
//                } else if (logName.equals(name) ^ validationPass != logPass.length()) {
//                System.out.println("error: Your credential is incorrect");
//                } else if (validationPass != logPass.length()){
//                System.out.println("error: Your input Password is incorrect");
//                } else {
//                System.out.println("error: Your Name is incorrect");
//                }
