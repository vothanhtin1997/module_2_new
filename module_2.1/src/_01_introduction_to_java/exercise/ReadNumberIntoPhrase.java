package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumberIntoPhrase {
    public static String read1To10(int number){
        String str = "";
        switch (number){
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
        }
        return str;
    }
    public static String read11To19(int number){
        String str = null;
        switch (number){
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 14:
                str = "forteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                int hangDonVi = number % 10;
                str = read1To10(hangDonVi) +" teen";
                break;
        }
        return str;
    }
    public static String readNumberTy(int number){
        String str = null;
        switch (number){
            case 20:
                str = "Twenty";
                break;
            case 30:
                str = "Thirty";
                break;
            case 40:
                str = "Forty";
                break;
            case 50:
                    str = "fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int hangchuc = number / 10;
                str = read1To10(hangchuc) + "ty";
                break;

        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number need read :");
            number = scanner.nextInt();
            if(number <= 0 || number > 99){
                System.out.println("Limit !");
            }
        }while (number <= 0 || number > 99);
      String result = readNumberTy((number / 10)*10) + " "+ read1To10(number % 10);
        System.out.println(result);
    }
}
