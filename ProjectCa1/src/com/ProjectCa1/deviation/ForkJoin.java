/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjectCa1.deviation;

import com.ProjectCa1.projecta1.ProjectCa1;
import com.ProjectCa1.projecta1.ReaderFile;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @Eliabe 2022474
 */
public class ForkJoin extends RecursiveTask<Integer> {

    private static final int threshold = 100;
//    private int[] numArray;
    private static AtomicInteger numThreads = new AtomicInteger(0);
    
    List <Integer > deviationList; 
    private int start;
    private int end;
    int sum1 = 0;
     public ForkJoin () {}
    public ForkJoin (int start, int end) {
//        this.numArray = numArray;
        this.start = start;
        this.end = end;
       // System.out.println(start+" "+end );
    }
    
    @Override
    public Integer compute() {
        
        if ((end - start) <= threshold) { // run our task
            int count = 0;
            for (int i = start; i < end; i++) {
                count++;
            }
           // System.out.println(numThreads.addAndGet(1));
            return count;
            
            
        } else { // divide / fork
            int mid = (end + start) / 2;
            ForkJoin left = new ForkJoin(start, mid);
            ForkJoin right = new ForkJoin(mid, end);
          //  System.out.println("Split");
            
            // fork the left
            left.fork();
            
            // run the right
            int rightResult = right.compute();
            
            int leftResult = left.join();
            return leftResult + rightResult;
            
            
        }
    }
        
        
        public ForkJoin (List <Integer > deviationList){
        this.deviationList =  deviationList;
       
        for (int counter = 0; counter < deviationList.size(); counter++) {
                   sum1 += deviationList.get(counter);
        }
             
 
        
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoin task = new ForkJoin( 0, sum1);
        int result = pool.invoke(task);
        System.out.println("");
        System.out.println("The sum is " + result);
       
        Deviation d = new Deviation(deviationList,result );
         d.print();
        
    }
      
}
