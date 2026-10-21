import java.util.Scanner;
public class IT26510618Lab5Q2{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int members=input.nextInt();
		
		if(members < 0) {
			System.out.println("Input must be a number 0 or greater");
		}else{
			switch(members) {
				case 0:
				 System.out.println("No prize");
				break;
				
				case 1:
				 System.out.println("prize is a : pen");
				 break;
				 
				 case 2:
				  System.out.println("prize is a : umberlla");
				  break;
				  
				 case 3:
				  System.out.println("prize is a : Bag");
				  break;
				  
				  case 4:
				   System.out.println("prize is a : Travelling chair");
				   break;
				   
				   default:
				     System.out.println("prize is a : headphone");
					 
			}
		}
	}
}
				  
				  
				  
				