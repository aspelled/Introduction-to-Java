package EPAM_Task2;

import java.util.Scanner;

public class Task4 {
    private static int sumOfDividers(int n)
    {
        int sum = 0;
        if (n % 2 == 0) {
            for(int i = 1;i <= n/2; ++i)
                if (n % i == 0) {
                    sum += i;
                }
        } else {
            for(int i = 1;i <= n/2; i+=2)
                if (n%i ==0) {
                    sum += i;
                }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i=a;i<=b;++i) {
            for (int j = i + 1; j <= b; ++j) {
                if (sumOfDividers(i) == j && sumOfDividers(j) == i) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        if (count ==0) {
            System.out.println("Absent");
        }
    }
}
