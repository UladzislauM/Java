import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        Date date = new Date();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        addArrList(arrayList);
        addLinkedList(linkedList);

        long start = System.currentTimeMillis();//получение стартового значения в миллисекундах
        System.out.println("Data Start ArrayList: " + date.toString());

        randSerch(arrayList);

        long end = System.currentTimeMillis();//получение конечного значения в миллисекундах
        long diff = end - start;
        System.out.println("\nData End ArrayList: " + date.toString()
                + "\nTime run program ArrayList: " + diff + "\n");

        long start2 = System.currentTimeMillis();
        System.out.println("Data Start linkedList: " + date.toString());

        randSerch(linkedList);

        long end2 = System.currentTimeMillis();
        long diff2 = end2 - start2;
        System.out.println("\nData End linkedList: " + date.toString()
                + "\nTime run program linkedList: " + diff2);

    }
    static void randSerch (List<Integer> list){
        Random rand = new Random();//создаем экземпляр генератора случайных чисел

        int numbs = 0;

        for (int iCount = 0; iCount < 1000; iCount++) {
           numbs += list.get(rand.nextInt(999_999));
        }

        System.out.println(numbs);
    }

    static ArrayList<Integer> addArrList (ArrayList<Integer> listInt){
        Random rand = new Random();

        for (int iCount = 0; iCount < 999_999; iCount++) {
            listInt.add(rand.nextInt(100));
        }
        return listInt;
    }
    static LinkedList<Integer> addLinkedList(LinkedList<Integer> listInt){
        Random rand = new Random();//создаем экземпляр генератора случайных чисел

        for (int iCount = 0; iCount < 999_999; iCount++) {
            listInt.add(rand.nextInt(100));
        }
        return listInt;
    }
}
