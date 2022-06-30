package homeTasks;

import java.util.Locale;
import java.util.Arrays;

public class TaskReplace {
//    ЗАДАЧИ:
//    Напишите Java-программу для удаления всех пробелов из строки с помощью replace().
//    Напишите программу на Java, чтобы найти повторяющиеся символы в строке.
//    Напишите программу на Java для подсчета количества слов в строке.
//    Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse().
//    Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций (с помощью массивов символов).

    public static void main(String[] args) {
        String changeString = "We are , playing with java !";
//        String changeString = "Wwm rm et g";
        System.out.println("Before replace: "+ changeString);

//        dellSpaces(changeString);

//        repeatLetter(changeString);

//        multWords(changeString);

        reverseString(changeString);
    }

    static void reverseString (String stringWords){
        String[] arrWords = stringWords.split("");
        int iterator = arrWords.length - 1;
        String revString = "";

         for (int i  = 0; i< arrWords.length; i++) {
            if(i < arrWords.length / 2 - 1) {
                String buffer = "";
                buffer = arrWords[i];
                arrWords[i] = arrWords[iterator];
                arrWords[iterator] = buffer;
                iterator--;
            }
            revString += arrWords[i];
        }
        System.out.println(revString);

    }

    static void multWords (String stringWords){
        String[] arrWords = stringWords.split("\\s*(\\s|,|!|\\.)\\s*");
        System.out.println("Number of words per line - "
                + arrWords.length);
    }

    static void repeatLetter(String replString) {
        replString = replString.toLowerCase(Locale.ROOT);
        char[] chArr = replString.toCharArray();
        Arrays.sort(chArr);
        String letters = new String(chArr);

        StringBuffer sBLetters = new StringBuffer(letters);
        StringBuffer repetedBuffer = new StringBuffer();


        for (int i = 0; i < sBLetters.length(); i++) {
            if (!(i == sBLetters.length() - 1)) {
                for (int j = i + 1; j < sBLetters.length(); j++) {

                    if (sBLetters.charAt(i) == sBLetters.charAt(j)
                            && repetedBuffer.indexOf(Character.toString(sBLetters.charAt(j))) == -1) {
                        System.out.println(sBLetters.charAt(i) + " repeated;");
                        repetedBuffer.append(sBLetters.charAt(j));
                        break;
                    }
                }
            }
        }
    }
    static void dellSpaces (String dellSpString){
        dellSpString = dellSpString.replace(" ", "");

        System.out.println("After replace spaces: " + dellSpString);
    }

}
