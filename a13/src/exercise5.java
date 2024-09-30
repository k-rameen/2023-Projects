import java.util.Scanner;

public class exercise5 {

    public static int pascalTri(int row, int col) {
        //to avoid overflow
        if (row == 0) {
            return 0;
        }
        //if row equal to col or col equal to 0 return 1
        else if (row == col || col == 0) {
            return 1;
        }
        //else pascal's triangle formula
        else {
            return pascalTri(row - 1, col - 1) + pascalTri(row - 1, col);
        }
    }
    //row's and column's formulation
    public static void tri(int N) {
        for(int row = 0; row < N; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(pascalTri(row,col) + " ");
            }
            System.out.println();
        }
    }
    //pascal's triangle centered
    public static void center(int N) {
        //calculates the value of the entry at the last row
        int max = String.valueOf(pascalTri(N - 1, N / 2)).length();

        //for each row of pascal's triangle
        for(int row = 0; row < N; row++) {
            //for each column of pascal's triangle
            for(int col = 0; col <= row; col++) {
                int entry = pascalTri(row,col);
                int entryLength = String.valueOf(entry).length();
                //in order to get space and formulate triangle
                int padding = (max - entryLength) / 2;

                for(int i = 0; i < padding; i++) {
                    System.out.print(" ");
                }
                System.out.print(entry);
                //conditions for a space
                for(int i = 0; i < padding + entryLength % 2; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter R: ");
        int row = scan.nextInt();

        System.out.print("Enter C: ");
        int col = scan.nextInt();

        int entry = pascalTri(row, col);
        System.out.println("tri(" + row + ", "+ col + ") = " + entry);

        System.out.println("Pascal's Triangle: ");
        tri(row + 1);

        System.out.println("Centered Pascal's Triangle: ");
        center(row + 1);
    }
}