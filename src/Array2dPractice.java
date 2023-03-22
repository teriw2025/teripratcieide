public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int arr[][]){
        int sum = 0;

        for(int row = 0; row < arr.length; row ++){
            for(int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN(int arr[][], int n){
        int sum = 0;

        for(int col: arr[n]){
            sum += col;
        }
        return sum;
    }

    // 3. sumColN
    public static int sumColN(int arr[][], int n){
        int sum = 0;

        for(int row = 0; row < arr.length; row++){
            sum += arr[row][n];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    int[][] aerr = {{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20}};
    public static int sumAllCellsBetween(int arr[][], int row1, int col1, int row2, int col2){
        int sum = 0;

        for(int row = row1; row <= row2; row++){
            if(row == row2){
                for(int col = 0; col <= col2; col++){
                    sum += arr[row2][col];
                }
            }
            else if(row != row2){
                while(col1 < arr[row].length){
                    sum += arr[row][col1];
                    col1++;
                }
            }
            col1 = 0;
        }
        return sum;
    }

}
