
public class WhileLoopExample {
	
	public static void main(String[] Args){
		
		boolean keepGoing = true;
		int counter = 0;
		
		/*
		 * keepGoing -> is the conditional expression
		 * 			 -> while will keep looping until conditional expression is false
		 */
		while(keepGoing){
			counter++;
			if(counter > 100){
				System.out.println("First While: we looped 100 times.");
				keepGoing = false;
			}
		}
		
		counter = 0;
		while(counter < 10){
			counter++;
		}
		System.out.println("Second While: counter is greater than or equal to 10");	
		
	}
}
