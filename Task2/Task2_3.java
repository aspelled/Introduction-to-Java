import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);

    private static void methodOne(char symbol) {
        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
            System.out.println("Symbol " + symbol + " is vowel");
        } else {
            System.out.println("Symbol isn't vowel");
        }

    }
    private static void methodTwo(char symbol){
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        int checker = 0;
        for (int i = 0; i <vowels.length ; i++) {
            if (symbol == vowels[i]){
                System.out.println("Symbol is vowel");
                checker++;
            }
        }
        if(checker == 0) {
            System.out.println("Symbol isn't vowel");
        }
    }

    private static String methodThree (char symbol){
        switch (symbol){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "Symbol is vowel";
        }return "Symbol isn't vowel";
    }

    private static String methodFour(int symbolASCII) {
        int[] vowelsASCII = {97, 101, 105, 11, 117};
        for (int i = 0; i < vowelsASCII.length; i++) {
            if (symbolASCII == vowelsASCII[i]) {
                return "Symbol is vowel";
            }
        }
        return "Symbol isn't vowel";
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol");
        String input = sc.nextLine().toLowerCase();
        char symbol = input.charAt(0);
        
        methodOne(symbol);
        methodTwo(symbol);
        System.out.println(methodThree(symbol));
        int codeASCII = (int) symbol;
        System.out.println(methodFour(codeASCII));
    }
}
