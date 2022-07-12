package util;

import Exeption.WrongLoginException;
import Exeption.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginUtil {
    public static boolean checkSinIn(String login, String password, String confirmPassword) {
        try {

            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static boolean checkLogin(String login) throws WrongLoginException {
//        Pattern patternLogin = Pattern.compile("[a-zA-Z]");
//        Matcher machLogin = patternLogin.matcher(login);

        if (login.matches("^[a-zA-Z0-9._]+$")
                && !login.matches(" ") && login.length() < 20) {
            return true;
        }else {
            throw new WrongLoginException();
        }
    }

        private static boolean checkPassword(String password, String confirmPassword)
                throws WrongPasswordException {
//            Pattern patternLogin = Pattern.compile("a-zA-Z._\\d\\S");
//            Matcher machLogin = patternLogin.matcher(password);

            if (password.matches("^[a-zA-Z0-9._]+$")
                    && !password.matches(" ") && password.length() < 20
                    && password.equals(confirmPassword)){
                return true;
            }
            throw new WrongPasswordException();
        }
    }

//    editText.setFilters(new InputFilter[]{new InputFilter() {
//        @Override
//        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
//            Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
//            Matcher matcher = pattern.matcher(source);
//            if (!matcher.matches()) {
//                return "";
//            }
//            return null;
//        }
//    }});



