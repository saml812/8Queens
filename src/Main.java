public class Main {
    public static void main(String[] args) {
        //eightQueens(4);
        int[][] test = {{0,1,0,0},
                        {0,1,0,0},
                        {0,2,0,0},
                        {0,1,0,0}};
        System.out.println(isValid(test, 1, 2));
    }
    public static int[][] eightQueens(int n)
    {
        int[][] arr = new int[n][n];
        int count = 0;

        while (count != n)
        {
            int row = (int) (Math.random()*n);
            int col = (int) (Math.random()*n);
            arr[row][col] = 1;
            count++;
        }

        for (int[] r : arr)
        {
            for (int c : r)
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static boolean isValid(int[][] arr, int row, int col)
    {
        boolean isValid = true;
        for (int r = 0; r < arr.length; r++)
        {
            if (arr[r][col] == 1)
            {
                isValid = false;
            }
        }
        for (int c = 0; c < arr[0].length; c++)
        {
            if (arr[row][c] == 1)
            {
                isValid = false;
            }
        }
        for (int r = row; r > 0; r--)
        {
            for (int c = col; c < arr[0].length; c++)
            {
                if (arr[r][c] == 1)
                {
                    isValid = false;
                }
            }
        }
        for (int r = row; r < arr.length; r++)
        {
            for (int c = col; c > 0; c--)
            {
                System.out.println(arr[r][c]);
                if (arr[r][c] == 1)
                {
                    isValid = false;
                }
            }
        }

        return isValid;
    }
}
