import util.LoginUtil;

public class main {
    public static void main(String[] args) {

        String login = "vladвлад";
        String password = "123qwe";
        String confirmPassword = "123qwe";

        System.out.println(LoginUtil.checkSinIn(login, password, confirmPassword));

    }
}
