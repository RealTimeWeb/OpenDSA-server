
/** Test program for recursion programming exercise.
Author: Sally Hamouda */
//Exercise 3: computes logb n

import java.io.*;
import java.util.Random;


public class studentrecwbcrcprog3
{ 
 
   public static int modellog(int b, int n ) { 

   if ( b == n ) return 1;
   return 1+ log(b,n/b); 
 }
  
   

  public static void main(String [ ] args) {
    boolean SUCCESS = false;
    int b=0;
    int n=0;
  
    if (modellog(b , n)== log(b, n)) SUCCESS = true;

    try{

     PrintWriter output = new PrintWriter("output");

     if (SUCCESS) { 
   
      output.println("Well Done!");
      output.close();
     }
    else 
    {
     output.println("Try Again! Incorrect Base case or recursive call!");
     output.close();
    }
  
    }
      catch (IOException e) {
	e.printStackTrace();
    }

  }

  
