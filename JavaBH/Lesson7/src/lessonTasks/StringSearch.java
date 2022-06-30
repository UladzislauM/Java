package lessonTasks;

public class StringSearch {
    public static void main(String[] args) {
        String str1 = "I am going to market";
        String str2 = "I am going to market";


        if(eqEqEndsWidh(str1, str2)){
            System.out.println("The last 5 characters match");
        }
        else {
            System.out.println("The last 5 characters do not match");
        }

        StringBuffer changeEquals = new StringBuffer("25 + 40 = 65");
//        ChangeEQInsertReplase(changeEquals);
        ChangeEQReplace(changeEquals);



    }
    static void ChangeEQReplace (StringBuffer strChange){
        if(!strChange.isEmpty()){
            System.out.println(strChange.replace(8, 9, "equals"));
        }
    }

    static void ChangeEQInsertReplase (StringBuffer strChange){
        if(!strChange.isEmpty()){
            strChange.insert(9, "equals");
            System.out.println(strChange.deleteCharAt(8));
        }
    }

    static boolean eqEqEndsWidh(String str1, String str2){
        if (str1.length() > 5 && str2.length() > 5
        && str1.substring(str1.length() - 5).endsWith(str2.substring(str2.length() -5))){
            return str1.endsWith(str2);
        }
        return false;
    }
}
