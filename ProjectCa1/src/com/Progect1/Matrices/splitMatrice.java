/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Progect1.Matrices;

/**
 *
 * @Eliabe 2022474
 */
public class splitMatrice extends Thread  {
    
    //Constructor for 2 arrays 2D
    private int[][] intArray;
    int  i;
    int[][] firstArray;
    int[][] secondArray;
    
   // public splitMatrice (int i){this.i = i;}
    
     
 public splitMatrice (){}

public splitMatrice (int[][] intArray){
    
   this.intArray = intArray;


int numRows = intArray.length;
int numCols = intArray[0].length;

firstArray = new int[numRows/2][numCols];
secondArray = new int[numRows - numRows/2][numCols];
//The nested loops iterate over each element in the original array and
//copy it to the appropriate subarray
  for(int i = 0; i < numRows/2; i++) {
    for(int j = 0; j < numCols; j++) {
        firstArray[i][j] = intArray[i][j];
    }
}

for(int i = numRows/2; i < numRows; i++) {
    for(int j = 0; j < numCols; j++) {
        secondArray[i - numRows/2][j] = intArray[i][j];
    }
}

matrixMultply m = new matrixMultply(firstArray, secondArray);


}
// Method printArr is being calling from readMatrice and then calling agan in the main class
public void printArr(){
    System.out.println("");
    System.out.println("First array:");
     for(int i = 0; i < firstArray.length; i++) {
     for(int j = 0; j < firstArray[0].length; j++) {
        System.out.print(firstArray[i][j] + " ");
    }
    System.out.println();
    
     }
    System.out.println(" ");
    System.out.println("Second array:");
    for(int i = 0; i < secondArray.length; i++) {
    for(int j = 0; j < secondArray[0].length; j++) {
        System.out.print(secondArray[i][j] + " ");
    }
    System.out.println();
    
    
    }
 

}
}

    
    
    


      
      
