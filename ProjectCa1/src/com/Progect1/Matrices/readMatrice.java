/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Progect1.Matrices;

import com.Project1.MergeSort.MergeSort;
import com.ProjectCa1.projecta1.ProjectCa1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @Eliabe 2022474
 */
    public class readMatrice  {

    /**
     * @Eliabe 2022474
     */
        
    int[][] intArray ;
   public readMatrice(){}
    // In this part it will just read the file and put into an array list 2d


  //  @Override
       // public void run() {
   {
            
                   

        String csvFile = "data.csv";
        String line = "";
        String csvDelimiter = ",";

        ArrayList<String[]> rows = new ArrayList<String[]>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] row = line.split(csvDelimiter);
                rows.add(row);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] data = new String[rows.size()][];
        data = rows.toArray(data);

        // print out the 2D array
        
      
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
              System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
       
        
        
 
        // In this secction it will convert String array int an Integer

       intArray = new int[data.length][data[0].length];

for (int i = 0; i < data.length; i++) {
    for (int j = 0; j < data[i].length; j++) {
        intArray[i][j] = Integer.parseInt(data[i][j]);
    

             // System.out.println(intArray[i][j]);
    }
             

    
}
    }// System.out.println();

// Using a thread to call the method printArr
   public void matriceMethod(){
     splitMatrice n = new splitMatrice(intArray);
   // n.printArr();
    

 Thread thread1 = new Thread(new Runnable() {
 public void run() {
 n.printArr(); // call method 1 in thread 1
            }
        });
 
 
 thread1.start();
 
 
 
 
 
 
 
 
 
   }
        public void mergeMethod(){
    
     
       // using forkJoinPool in this merge sort number
       MergeSort m = new MergeSort( intArray);
       m.printArr2D();
          
          
          
          
          
        
         
        
        }
        
        
    }
       
 
   
           
    
    

      
