import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to count words: ");
        String S = sc.nextLine();
        if (S.length() == 0) {
            System.out.println("Please enter any text...");
        }

        else {
            // System.out.println("String is:  " + S);
            System.out.println();
            String[] array = S.split("[,\\s]+");
            System.out.println("NO of words in entered string is:" + array.length);
            System.out.println("Words are:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

    }

}

