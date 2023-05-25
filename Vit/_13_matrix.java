import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _13_matrix {
    public static void matrix(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transpose = transposematrix(matrix);

        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposematrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public void word1(){
        String file = "DS.txt";
        try{
            int count = countword(file);
            System.out.println("The number of words in the text file is: " + count);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }

    }

    public int countword(String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner sc = new Scanner(file);

        int wordcount = 0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            String word[] = line.split(" ");
            wordcount += word.length;
        }

        return wordcount;
    }
    public static void main(String[] args) {
        matrix();
    }
}
