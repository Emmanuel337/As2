  import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser
{
	static String question1;
	

	public static void main(String[] args) {
		 
		 
		int answer , guess;
		String question4 = null;
		
	 do {
		 
		Scanner Keyboard  = new Scanner(System.in);
		Random rand = new Random();
		
		resetCount();
		getCount();
	    rand();
	    System.out.println("Enter your first guess between 0 and 99");
		   guess = Keyboard.nextInt(); 
		if(guess == rand()) {
		System.out.println("Congratuation, you gussed corectly");
		}
		
		else if (guess > rand())do{
			 System.out.println("Your guess is too high");
			 System.out.println("Enter your next guess between 0 and" + guess );
			   guess = Keyboard.nextInt(); 
			   if(guess == rand()) {
					System.out.println("Congratuation, you gussed corectly");
					}while( guess == rand());
			   
					
		}while(question4.equals("Y") || question4.equals("y") );
		
		else if (guess < rand())do{
			 System.out.println("Your guess is too Low");
			 System.out.println("Enter your next guess between " + guess + " and 99 " );
			 guess = Keyboard.nextInt();
			 if (guess < rand())
			 guess = Keyboard.nextInt();
			 
			 while(guess == rand());
			 if(guess == rand()) {
					System.out.println("Congratuation, you gussed corectly");
					}
			 
					System.out.println("Do you want to enter another?");
					System.out.println(" y or n ");
					}while(guess == rand()); 
		}while(question4.equals("Y") || question4.equals("y") );
		
		System.out.println("Do you want to enter another?");
		System.out.println(" y or n ");
		
		Scanner answer4  = new Scanner(System.in);
		question4 = answer4.nextLine();     
	}
	

		

	 
	
	public static int rand() {
		Random rand = new Random();
		int randInt = rand.nextInt(100)+1;
		int answer = randInt;
		return randInt;
	}
	
	public static void resetCount() {
		int count = 0;
	}
	
	public static int getCount() {
		int count = 0;
		return count;
	}
	
	
}

 
