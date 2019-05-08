import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates((x1, y1), (x2, y2), (x3,y3):");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        if((x1 == x2) || (x2 == x3) || (x1 == x3) || (y1 == y2) || (y2 == y3) || (y1 == y3)) {
            System.out.println("This is not a triangle");
        }
        else {
            double ab, ac, bc;
            ab = Math.pow(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)), 1.0 / 2);
            bc = Math.pow(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)), 1.0 / 2);
            ac = Math.pow(((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1)), 1.0 / 2);

            double Square12 = ab * ab;
            double Square23 = bc * bc;
            double Square13 = ac * ac;

            if (((Square13 + Square23) == Square12) || ((Square12 + Square13) == Square23) ||
                    ((Square12 + Square23) == Square13)) {
                System.out.println("Triangle is rectangular");
            } else {
                System.out.print("Triangle isn't rectangular");
            }
        }
    }
}
