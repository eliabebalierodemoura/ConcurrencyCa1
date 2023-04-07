/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Progect1.Matrices;

/**
 *
 * @Eliabe 2022474
 */
    public class matrixMultply{
    
  
    public matrixMultply(){}
    
     static int N = 10;
// This method will receive values to do the multiplication
   static void multiply(int mat1[][],
                         int mat2[][], int res[][])
    {
        int i, j, k;
        for (i = 0; i < N; i++) { 
            for (j = 0; j < N; j++) {
                res[i][j] = 0;
                for (k = 0; k < N; k++)
                    res[i][j] += mat1[i][k]
                                 * mat2[k][j];
            }
        
        }
        }
    
    
       
    
    int mat1[][];
    int mat2[][];

            int i, j;
            
            // This constructor is receiving data from split file witch are two arrays
      public matrixMultply( int mat1[][], int mat2[][]){
    
      
          this.mat1 = mat1;
          this.mat2 = mat2;
      
     
        int res[][] = new int[N][N];
           
        // input values into method multiplay
        multiply(mat1, mat2, res);
         System.out.println(" ");
        System.out.println("Result matrix is ");
        
        // Here you have a for loop to display the result
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
             System.out.print(res[i][j] + " ");
           System.out.println("");
            
          
      }
      
  
        }
    }
        
        
        
    

    


