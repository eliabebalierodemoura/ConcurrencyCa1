/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjectCa1.projecta1;

import com.ProjectCa1.deviation.Deviation;
import com.ProjectCa1.deviation.ForkJoin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 *
 * @Eliabe 2022474
 */
public class ReaderFile implements FileInputInterface {

   static double mean,dev,
         sum=0,sum2=0,counter=0;
 

  
   //public void reader() {
      private static final int NUM_THREADS = 4;
        

    @Override
    public void Deviateionreader() throws IOException {
        List<String> list1 = new ArrayList<String>();
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));

        String header = reader.readLine(); // Read header line
       // System.out.println(header); // Print header line

        String line;
        while ((line = reader.readLine()) != null) {
             String [] values = line.split(",");
             
             //loop to input value int list1
             for(int i = 0; i<10; i++){
                list1.add(values[i]);
             
             }
       
             
            String [] row = line.split(",");
                for(String index : row){
                 System.out.printf("%-10s", index);
                     
                }
           System.out.println();
    
                              
        }
            
            //Converting String list into an Integer
            List<Integer> test = list1.stream().map(Integer::parseInt).collect(Collectors.toList());
      
            
            
         // Deviation d = new Deviation();
          //d.print();
          
          ForkJoin t = new ForkJoin(test);
          
      
       
   
     
      
      
    }
}
   