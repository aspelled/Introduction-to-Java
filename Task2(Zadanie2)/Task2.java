package EPAM_Task2;

import java.util.Scanner;

public class Task2 {
    private static void highestDigit(int value) {
        int digit;
        int max = 0;
        do {
            digit = value%10;
            if ( digit > max ) max=digit;

            value = (value - digit)/10;

        } while (value > 0);
        System.out.println(max);
    }
    private static void isPalindrome(int number) {
        int reverse = 0;
        int n = number;
        for (int i = 0; i <= number; i++) {
            int remain = number%10;
            number = number/10;
            reverse = reverse*10+remain;
        }
        if (reverse == n) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }

}
    private static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }
    private static void divisors(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Number of divisors: " + count);
    }
    private static int nod(int a, int b)
    {
        int tmp;
        while(a!=0 && b!=0)
        {
            a%=b;
            tmp=a;
            a=b;
            b=tmp;
        }
        return a+b;
    }
    private static int nok(int a, int b)
    {
        return a/nod(a,b)*b;
    }
    private static int differentNumbers(int n) {
        String number = String.valueOf(n);
        int diff = 0;
        for (int i = 0; i < number.length(); i++) {
            int same = 0;
            String now = String.valueOf(number.charAt(i));
            for (int j = 0; j < i; j++) {
                if (now.equals(String.valueOf(number.charAt(j)))) {
                    same += 1;
                }
            }
            if (same == 0) {
                diff += 1;
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int min = 100;
        final int max = 999;
        System.out.println("Enter the number of task you want to do: ");
        int taskNumber = sc.nextInt();
        int value;
        switch(taskNumber) {
            case 1:
                value = (int) (min + Math.random() * (max - min));
                System.out.println("Random-generated value: ");
                System.out.println(value);
                highestDigit(value);
                break;
            case 2:
                System.out.println("Enter number: ");
                value = sc.nextInt();
                System.out.println(value);
                isPalindrome(value);
                break;
            case 3:
                value = (int) (min + Math.random() * (max - min));
                System.out.println(value);
                if(isPrime(value)) {
                    System.out.println("Simple");
                }
                else {
                    System.out.println("Isn't simple");
                }
                break;
            case 4:
                value = (int) (min + Math.random() * (max - min));
                System.out.println(value);
                divisors(value);
                break;
            case 5:
                System.out.println("Input 2 values: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("НОД: " + nod(a, b));
                System.out.println("НОК: " + nok(a, b));
                break;
            case 6:
                System.out.println("Enter number: ");
                value = sc.nextInt();
                System.out.println("Number of different: " + differentNumbers(value));
                break;
        }
    }
}
