class RotateMatrix
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
  
  public static void solve(int[][] matrix, int n)
  {
    for (int layer = 0; layer < n / 2; layer++)
    {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++)
      {
        int offset = i - first;
        //save top
        int top = matrix[first][i];
        
        //left -> top
        matrix[first][i] = matrix[last-offset][first];
        
        // bottom -> left
        matrix[last-offset][first] = matrix[last][last - offset];
        
        // right -> bottom
        matrix[last[[last - offset] = matrix[i][last];
        
        // top -> right
        matrix[i][last] = top;
      }
    }
  }
}
