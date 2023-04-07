/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjectCa1.deviation;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @Eliabe 2022474
 */
public class Deviation {
   static double mean,dev,
         sum=0,sum2=0,counter=0;
    
  
  List <Integer > deviationList;
  
   public Deviation(){
   }
    int resultSum;
    public Deviation(int resultSum){
    this.resultSum = resultSum;
          
          
          
    }
    
       
        public Deviation(List <Integer > deviationList,int resultSum ){
            
            
        this.deviationList =  deviationList;
       
//for (int counter = 0; counter < deviationList.size(); counter++) {
               //    sum += deviationList.get(counter);
       // }
      /* this secction is getting data from  Forkjoin
         fork join will breakdown and sum the number from csv file
        and then will bring the result to this secction
      */ 
      
      
      // Here we have the sum of number from csv and then divid for n the amount of number
     
      mean = resultSum / deviationList.size();
     
      // After devide you take each number and do minus the division result and multiply by 2
     //After need to sum  and dived again by the amount of number minus 1
     for(int i = 0; i < deviationList.size(); i++){
     sum2 += Math.pow( deviationList.get(i) - mean, 2);
     
     
     }
     dev = Math.sqrt(sum2/(deviationList.size()-1));
     
       // System.out.println("mean = "+ mean+"\nStandart deviation = "+dev);
   
        
    }
        public  void  print  (){ 
            
        DecimalFormat df = new DecimalFormat("#.#");
         
       //System.out.println("");
       System.out.println("mean = "+ mean+"\nStandart deviation = "+df.format(dev));
   
   }
   
    }
    
    
    

