import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dragon age: ");
        int age = sc.nextInt();
        int head;
        if (age > 300) {
            head = 600 + 200 + (age - 300);
        } else
            if (age >= 200 && age < 300) {
            head = 600 + (age - 200) * 2;
        } else {
            head = age * 3;
        }
        int eyes = head * 2;
        System.out.println("Dragon is " + age + " years old, has " + head +" heads and " + eyes + " eyes");
    }
}
