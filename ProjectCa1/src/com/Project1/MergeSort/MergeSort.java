/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Project1.MergeSort;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
/**
 *
 * @Eliabe 2022474
 */
public class MergeSort {
int [][]arr2D;
int[] arr1D ;
     

     
     
   public MergeSort (){}
    
   public MergeSort( int[][] arr2D){
   this.arr2D = arr2D;
    

int rows = arr2D.length;
int cols = arr2D[0].length;
arr1D = new int[rows * cols];
       

int index = 0;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        arr1D[index++] = arr2D[i][j];
    }
}

// print the arrays
//System.out.println("2D array:");
//for (int i = 0; i < rows; i++) {
    //for (int j = 0; j < cols; j++) {
       // System.out.print(arr2D[i][j] + " ");
   // }
    //System.out.println();

System.out.println("\nNUmbers from smallest to largest");
for (int i = 0; i < arr1D.length; i++) {
   // System.out.print(arr1D[i] + " ");
}
        
        

      
        //mergeSortParallel(arr1D);
        //System.out.println(Arrays.toString(arr1D));
    }
        private static final ForkJoinPool forkJoinPool = new ForkJoinPool();

    private static class MergeSortTask extends RecursiveAction {
        
        private final int[] array;
        private final int start;
        private final int end;
        private final int[] tempArray;

        public MergeSortTask(int[] array, int start, int end, int[] tempArray) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.tempArray = tempArray;
        }

        @Override
        protected void compute() {
            if (end - start <= 1) {
                return;
            }

            int middle = (start + end) / 2;

            MergeSortTask leftTask = new MergeSortTask(array, start, middle, tempArray);
            MergeSortTask rightTask = new MergeSortTask(array, middle, end, tempArray);

            leftTask.fork();
            rightTask.compute();
            leftTask.join();

            merge(array, start, middle, end, tempArray);
        }

        private void merge(int[] array, int start, int middle, int end, int[] tempArray) {
            int i = start;
            int j = middle;
            int k = 0;

            while (i < middle && j < end) {
                if (array[i] < array[j]) {
                    tempArray[k++] = array[i++];
                } else {
                    tempArray[k++] = array[j++];
                }
            }

            while (i < middle) {
                tempArray[k++] = array[i++];
            }

            while (j < end) {
                tempArray[k++] = array[j++];
            }

            System.arraycopy(tempArray, 0, array, start, k);
        }
    }

    public static void mergeSortParallel(int[] array) {
        int[] tempArray = new int[array.length];
        MergeSortTask task = new MergeSortTask(array, 0, array.length, tempArray);
        forkJoinPool.invoke(task);
    
 
  
}

    public void printArr2D(){
        
        

mergeSortParallel(arr1D);
        System.out.println(Arrays.toString(arr1D));
}
}
        
    
    
