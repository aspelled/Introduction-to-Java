import java.util.Random;
import java.util.Scanner;

public class Main {

    private static void localExtremum(double[][] matrix) {
        double maxElement = matrix[0][0];
        double minElement = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
                if(matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        System.out.println("Max element: " + maxElement + ", min element: " + minElement);
    }

    private static void averageMean(double[][] matrix) {
        double averageCounter = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                averageCounter += matrix[i][j];
            }
        }
        averageCounter = averageCounter/(matrix.length*matrix[0].length);
        System.out.println("Average: " + averageCounter);
    }

    private static void geometricMean(double[][] matrix) {
        double geometricCounter = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                geometricCounter *= matrix[i][j];
            }
        }
        int deg = matrix.length*matrix[0].length;
        System.out.println("Geometric: " + Math.pow(geometricCounter, 1.0 / deg));
    }

    private static void localMin(double matrix[][]){
        double localmin = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++){
                localmin = matrix[i][j];
                if((i+1<matrix.length && localmin < matrix[i+1][j] && i-1>=0 && localmin < matrix[i-1][j])||
                        (j+1 < matrix[0].length && localmin < matrix[i][j+1] && j-1>=0 && localmin < matrix[i][j-1])){
                    System.out.println("Local minimum row " + i + " column " + j);
                    System.out.println();
                    return ;
                }else {
                    localmin = -1;
                }

            }
        }
        System.out.println("Local minimum: " + localmin);
    }
    private static  void  localMax(double matrix[][]){
        double localmax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                localmax = matrix[i][j];
                if((i+1<matrix.length && localmax>matrix[i+1][j] && i-1>=0 && localmax > matrix[i-1][j])||
                        (j+1 < matrix[0].length && localmax >matrix[i][j+1] && j-1>=0 && localmax > matrix[i][j+1])){
                    System.out.println("Local maximum row " + i + " column " + j);
                    System.out.println();
                    return;
                }else {
                    localmax = -1;
                }
            }
        }
        System.out.println("Local maximum: " + localmax);
    }
    private static void transpose(double matrix[][]){
        if(matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix[0].length; j++) {
                    double temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            System.out.println("Transposed matrix: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            double[][] transposedMatrix = new double[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }
            System.out.println("Transposed matrix: ");
            for (int i = 0; i < transposedMatrix.length; i++) {
                for (int j = 0; j < transposedMatrix[0].length; j++) {
                    System.out.print(transposedMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of task you want to do: ");
        int number = sc.nextInt();
        int rows = 0;
        int columns = 0;
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        columns = sc.nextInt();
        Random random = new Random();
        double[][] matrix = new double[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        switch(number) {
            case 1:
                localExtremum(matrix);
                break;
            case 2:
                averageMean(matrix);
                geometricMean(matrix);
                break;
            case 3:
                localMin(matrix);
                localMax(matrix);
                break;
            case 4:
                transpose(matrix);
                break;
        }
    }
}
