package EPAM_Task2;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args)  {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(sum(number)) {
            System.out.println("Число является совершенным");
        } else {
            System.out.println("Число не является совершенным");
        }
    }
    private static boolean sum(int n) {
        int summa =0;
        for(int i=1;i<n;i++) {
            if(n%i==0) summa+=i;
        }
        return summa==n;
    }


}
