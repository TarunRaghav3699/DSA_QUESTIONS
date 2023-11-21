public class AddingTwoMatrices{
   public static void main(String args[]){
      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
      int b[][]={{1,1,1},{1,1,1},{1,1,1}};
      int c[][]=new int[3][3];

      for(int i = 0;i<3;i++){
         for(int j = 0;j<3;j++){
            c[i][j] = a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
         }
         System.out.println();
      }
   }
}

// output:-

// AddingTwoMatrices 
// 2 3 4 
// 5 6 7 
// 8 9 10 
ublic class AddingTwoMatrices{
   public static void main(String args[]){
      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
      int b[][]={{1,1,1},{1,1,1},{1,1,1}};
      int c[][]=new int[3][3];

      for(int i = 0;i<3;i++){
         for(int j = 0;j<3;j++){
            c[i][j] = a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
         }
         System.out.println();
      }
   }
}

// output:-

// AddingTwoMatrices 
// 2 3 4 
// 5 6 7 
// 8 9 10 

// The algorithm for the matrix addition code in Java can be broken down into these steps:

// Two 3x3 matrices a and b are declared and initialized.
// Another 3x3 matrix c is created to store the sum of matrices a and b.
// Using nested loops, iterate through each element of matrices a and b.
// Add the corresponding elements of matrices a and b and store the result in the corresponding cell of matrix c.
// Print the elements of matrix c to display the resultant matrix.
// The nested loops are used to traverse through rows and columns of the matrices, adding the corresponding elements and printing the resultant matrix.














