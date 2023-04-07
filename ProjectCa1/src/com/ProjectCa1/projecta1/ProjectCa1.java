/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ProjectCa1.projecta1;


import com.Project1.MergeSort.MergeSort;
import com.Progect1.Matrices.splitMatrice;
import com.Progect1.Matrices.readMatrice;
import com.Progect1.Matrices.matrixMultply;
import com.ProjectCa1.deviation.Deviation;
import com.ProjectCa1.deviation.ForkJoin;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @Eliabe 2022474
 */

 


    public class ProjectCa1 {
  
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        
        Scanner input = new Scanner(System.in);
        boolean B = true;
        boolean t = true;
        
        // loop to chose each method
       
      try
      {
         
        do{
            
           System.out.println("Pleas select 1 to deviation, 2 to matrices or 3 to merge sort numbers");
            int input1 = input.nextInt();
           
           if(input1 == 1){
               B=true;
              
             System.out.println("");   
           ReaderFile F = new ReaderFile();
           F.Deviateionreader();
           }   
           
           else if(input1 == 2){
           B=true;
           
            System.out.println("");
           readMatrice n1 = new readMatrice();
           n1.matriceMethod();
        }
        
           else if(input1 == 3){
           B=true;
             
             System.out.println("");
            readMatrice n = new readMatrice();
            n.mergeMethod();
            
           }
                else{
                     B = false;
                     
                        }
        // exception in case wrong option
            
        }  while(!B );     
            
  }catch(Exception e){
      
      System.out.println("Access failure you did not entered a number");
      }
      }
      
   
    }
    