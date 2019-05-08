import java.util.Scanner;
public class Main {
    public static void Checker(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal");
            }
        } else {
            System.out.println("Numbers are not equal");
        }
    }

    public static void Dinosaur_Weight(double weight_kg) {
        double weight_mg = weight_kg * Math.pow(10, 6);
        double weight_g = weight_kg * Math.pow(10, 3);
        double weight_t = weight_kg / Math.pow(10,3);
        System.out.println("Dinosaur's weight: " + weight_kg + "kg " + weight_mg + "mg " + weight_g + "g " + weight_t + "t");
    }

    public static void RingsSquare(int R, int r) {
        double square = Math.PI * (R * R - r * r);
        System.out.println("Ring's area: " + square);
    }

    public static void Sequence(int number) {
        int temp;
        boolean inc = true;
        boolean dec = true;
        if (number < 10) {
            inc = false;
            dec = false;
        } else {
            while (number >= 10) {
                temp = number % 10;
                number = number / 10;
                if (number % 10 == temp) {
                    inc = false;
                    dec = false;
                }
                if (number % 10 > temp) {
                    inc = false;
                }
                if (number % 10 < temp) {
                    dec = false;
                }
            }
        }
        if (dec) {
            System.out.println("Decreasing sequence");
        } else {
                if (inc) {
                    System.out.println("Increasing sequence");
                } else {
                    System.out.println("Not an increasing or decreasing sequence");
                }
        }
    }

    public static void AverageAndGeometricMean(int number) {
        int temp;
        double sum = 0;
        double sum2 = 1;
        int decCounter = 0;
        while (number > 0) {
            temp = number % 10;
            number = number / 10;
            sum += temp;
            sum2 *= temp;
            decCounter++;
        }
        System.out.println("Average mean: " + sum / decCounter);
        System.out.println("Geometric mean: " + Math.pow(sum2, 1.0 / decCounter));
    }

    public static void Reverse(int number) {
        System.out.println("Before reverse: " + number);
        int newNumber = 0;
        while (number != 0) {
            newNumber = newNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("After reverse:" + newNumber);

    }

    public static void Swap(int a, int b) {
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: " + a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the task you want to test(1-7, 8 to exit):");
        int taskNumber = sc.nextInt();
        switch (taskNumber) {
            case 1:
                System.out.println("Enter three numbers to test for equality: ");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();
                int number3 = sc.nextInt();
                Checker(number1, number2, number3);
                break;
            case 2:
                System.out.print("Enter dinosaur mass in kilograms:");
                double weight = sc.nextInt();
                Dinosaur_Weight(weight);
                break;
            case 3:
                System.out.println("Enter the radius of the large and small circles:");
                int R = sc.nextInt();
                int r = sc.nextInt();
                if (R <= r) {
                    System.out.println("Wrong values(R should be greater then r)");
                    break;
                }
                RingsSquare(R, r);
                break;
            case 4:
                System.out.print("Enter the sequence: ");
                int sequence = sc.nextInt();
                Sequence(sequence);
                break;
            case 5:
                System.out.print("Enter the number: ");
                int number = sc.nextInt();
                AverageAndGeometricMean(number);
                break;
            case 6:
                System.out.print("Enter the number you want to reverse: ");
                int numberToReverse = sc.nextInt();
                Reverse(numberToReverse);
                break;
            case 7:
                System.out.println("Enter 2 numbers you want to swap:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                Swap(a, b);
                break;
            case 8:
                return;
        }
    }
}
