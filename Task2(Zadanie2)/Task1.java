package EPAM_Task2;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите сколько раз вы хотите подбросить монету: ");
        n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Ошибка. Количество бросков должно быть положительным");
        }
        else {
            int head = 0;
            int tail = 0;
            Random random = new Random();
            int flip;
            for(int i = 0; i < n; i++) {
                flip = random.nextInt(2);
                if(flip == 1) {
                    head++;
                }
                else {
                    tail++;
                }
            }
            System.out.println("Орёл выпал " + head + " раз, " + "решка выпала " + tail + " раз.");
        }
    }
}
