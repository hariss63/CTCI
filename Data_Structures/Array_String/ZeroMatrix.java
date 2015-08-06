class ZeroMatrix
{
  public static void main(String[] args)
  {
    int[][] input = { {3, 5, 0, 4},
      {2, 1, 9, 7},
      {3, 2, 1, 0},
    {8, 5, 0, 4} };
    solve(input);
  }
  static void printMatrix(int[][] matrix)
  {
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[0].length; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  static void solve(int[][] matrix)
  {
    boolean rowHasZero = false;
    boolean colHasZero = false;
    for (int i = 0; i < matrix[0].length; i++)
    {
      if (matrix[0][i] == 0)
      {
        rowHasZero = true;
        break;
      }
    }
    for (int i = 0; i < matrix.length; i++)
    {
      if (matrix[i][0] == 0)
      {
        colHasZero = true;
        break;
      }
    }
    
    for (int i = 1; i < matrix.length; i++)
    {
      for (int j = 1; j < matrix[0].length; j++)
      {
        if (matrix[i][j] == 0)
        {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    
    for (int i = 1; i < matrix.length; i++)
    {
      if (matrix[i][0] == 0)
      {
        nullifyRow(matrix, i);
      }
    }
    
    for (int i = 1; i < matrix[0].length; i++)
    {
      if (matrix[0][i] == 0)
      {
        nullifyColumn(matrix, i);
      }
    }
    if (rowHasZero) {
      nullifyRow(matrix, 0);
    }
    
    if (colHasZero) {
      nullifyRow(matrix, 0);
    }
    printMatrix(matrix);
  }
  
  static void nullifyRow(int[][] matrix, int row)
  {
    for (int j = 0; j < matrix[0].length; j++)
    {
      matrix[row][j] = 0;
    }
  }
  
  static void nullifyColumn(int[][] matrix, int col)
  {
    for (int i = 0; i < matrix.length; i++)
    {
      matrix[i][col] = 0;
    }
  }
  
  
}
