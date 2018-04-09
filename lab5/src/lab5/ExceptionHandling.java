package lab5;
import java.util.Scanner;

public class ExceptionHandling {
	 public static void main(String args[]) 
	 {
	      int num[] =new int[5];
	      try
	      {
	    	System.out.println("value 6="+num[6]);  
	      }
	      catch(ArrayIndexOutOfBoundsException e)
	      {
	    	  System.out.println("Exception Thrown = "+e);
	      }
	      finally
	      {
	    	num[1]=6;
	    	System.out.println("Value 2 = "+num[1]);
	      }
	      
	     
	   }
		  
		}


