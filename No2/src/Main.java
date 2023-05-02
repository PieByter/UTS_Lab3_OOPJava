import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan Reverse : ");
        System.out.println("1. Reverse Per Huruf (Reverse By Char)");
        System.out.println("2. Reverse Per Kata (Reverse By Word)");
        System.out.println();

        System.out.print("Masukkan Pilihan : ");
        char pilihan = input.next().charAt(0);
        input.nextLine();

        if (pilihan == '1') {
            System.out.println("Masukkan string kata yang ingin di-reverse:");
            String string = input.nextLine();

            // Reverse perhuruf
            String reverseByChar = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                reverseByChar += string.charAt(i);
            }
            System.out.println("Reverse perhuruf: " + reverseByChar);
        } else if (pilihan == '2') {
            System.out.println("Masukkan string kalimat yang ingin di-reverse:");
            String string = input.nextLine();

            // Reverse per kata
            String[] words = string.split(" ");
            String reverseByWord = "";
            for (int i = words.length - 1; i >= 0; i--) {
                reverseByWord += words[i] + " ";
            }
            System.out.println("Reverse per kata: " + reverseByWord.trim());
        }
        else{
            System.out.println("Pilihan tidak tersedia...");
        }

    }

}