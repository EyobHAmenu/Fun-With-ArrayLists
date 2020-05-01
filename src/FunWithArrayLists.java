import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args) {
        /*
        Output sample:
            Black
            Enter your favorite color: silver
            Enter your favorite color: Brown
            Enter your favorite color: Gold
            Enter your favorite color: q
            [Rad, Black, Yellow, Green, Blue, silver, Brown, Gold]

         */

        String userColor = " ";

        Scanner in = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Rad");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors.get(1));

        System.out.print("Enter your favorite color: ");
        userColor = in.nextLine();
        while (!(userColor.equalsIgnoreCase("Q"))) {
            colors.add(userColor);
            System.out.print("Enter your favorite color: ");
            userColor = in.nextLine();
        }
        System.out.println(colors);


    }
}
