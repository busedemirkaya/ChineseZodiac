import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year, zodiac = 0;
        String result = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("Birth Year: ");
        year = inp.nextInt();
        zodiac = year % 12;
        if ((year <= 2022) && (year >= 1900)) {
            switch (zodiac) {
                case 0:
                    result = " Monkey";
                    break;
                case 1:
                    result = " Cockerel";
                    break;
                case 2:
                    result = " Dog";
                    break;
                case 3:
                    result = " Pig";
                    break;
                case 4:
                    result = " Mouse";
                    break;
                case 5:
                    result = " Bull";
                    break;
                case 6:
                    result = " Tiger";
                    break;
                case 7:
                    result = " Rabbit";
                    break;
                case 8:
                    result = " Dragon";
                    break;
                case 9:
                    result = " Snake";
                    break;
                case 10:
                    result = " Horse";
                    break;
                case 11:
                    result = " Sheep";
                    break;
            }
                System.out.print("Your zodiac: " + result);
            } else {
            System.out.print("Please, enter the year between 1900 and 2022. ");
        }
        }
        /* with if
        if (year == 0) {
            result = " Monkey";

        }
        if (year == 1) {
            result = " Cockerel";

        }
        if (year == 2) {
            System.out.print(result + " Dog");

        }
        if (year == 3) {
            System.out.print(result + " Pig");

        }
        if (year == 4) {
            System.out.print(result + " Mouse");

        }
        if (year == 5) {
            System.out.print(result + " Bull");

        }
        if (year == 6) {
            System.out.print(result + " Tiger");

        }
        if (year == 7) {
            System.out.print(result + " Rabbit");

        }
        if (year == 8) {
            System.out.print(result + " Dragon");

        }
        if (year == 9) {
            System.out.print(result + " Snake");

        }
        if (year == 10) {
            System.out.print(result + " Horse");

        }
        if (year == 11) {
            System.out.print(result + " Sheep");

        }
        System.out.print("Your Zodiac: " + zodiac);
    }
        else {

        }
    } */


}