package init.login;

public class Login {

    static String name = "Bohdan";  // STORAGE
    static String pass = "pass";    // STORAGE

    public static int loginTo(String logName, String logPass) {

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
