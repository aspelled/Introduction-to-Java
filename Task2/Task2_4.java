import java.util.Scanner;

public class Main {

    private static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] monthLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        System.out.println("Enter day, month and year:");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        day++;
        if(leapYear(year)) {
            if (day > monthLeapYear[month - 1]) {
                month++;
                day = 1;
                if (month > 12) {
                    year++;
                    month = 1;
                }

            }
        }
        else if (day > months[month - 1]) {
            month++;
            day = 1;
            if (month > 12) {
                year++;
                month = 1;
            }
        }

        System.out.println("Next date: " + day + " " + month + " " + year);
    }
}
