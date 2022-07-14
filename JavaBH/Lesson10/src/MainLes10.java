import java.util.ArrayList;
import java.util.List;

public class MainLes10 {
    public static void main(String[] args) {
        String lastName1  = "Marshal";
        String lastName2  = "Djugashvily";
        String lastName3  = "Janag";
        String lastName4  = "Jercham";
        String lastName5  = "Lybin";
        String lastName6  = "Lastovich";
        String lastName7  = "Sidorik";

        List<String> lastNames = new ArrayList<String>(){{
            add(lastName1);
            add(lastName2);
            add(lastName3);
            add(lastName4);
            add(lastName5);
            add(lastName6);
            add(lastName7);
            }};

        lastNames.stream()
                .filter(x->x.charAt(0) == 'J')
                .forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();

        for(int i = 50; i > 0; i--){
            numbers.add(i);
        }

        System.out.println("\n" + "Before sorted: ");

        numbers.stream()
                        .forEach(System.out::println);

        System.out.println("\n" + "After sorted: ");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);



    }
}
