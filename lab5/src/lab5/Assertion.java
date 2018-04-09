package lab5;
import java.util.Scanner;
public class Assertion {
	 public static void main(String[] args) {
	        
	        Scanner s=new Scanner(System.in);
	        
	        System.out.println("Enter Your Marks");
	        
	        int marks=s.nextInt();
	 
	        assert marks <=70:"Average Marks";
	 
	        System.out.println("Yes");
	 
	    }
}
