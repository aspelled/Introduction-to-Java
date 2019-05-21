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

    public static void localMin(double array[][]){
        double localmin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){
                localmin = array[i][j];
                if((i+1<array.length && localmin < array[i+1][j] && i-1>=0 && localmin < array[i-1][j])||
                        (j+1 < array[0].length && localmin < array[i][j+1] && j-1>=0 && localmin < array[i][j-1])){
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
    public static  void  localMax(double array[][]){
        double localmax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                localmax = array[i][j];
                if((i+1<array.length && localmax>array[i+1][j] && i-1>=0 && localmax > array[i-1][j])||
                        (j+1 < array[0].length && localmax >array[i][j+1] && j-1>=0 && localmax > array[i][j+1])){
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
    public static void transpose(double array[][]){
        if(array.length == array[0].length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array[0].length; j++) {
                    double temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
            System.out.println("Transposed matrix: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            double[][] transposedMatrix = new double[array[0].length][array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    transposedMatrix[j][i] = array[i][j];
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
