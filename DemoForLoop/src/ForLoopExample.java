
public class ForLoopExample {
	
	public static void main(String[] Args){
		
		/* int i = 0 --> initializer, i starts out as zero 
		 * i <= 5 --> condition, can be anything that evaluates to true or false
		 *        --> read as long as i is less than or equal to 5 then do another loop
		 * i++ --> the iterator, specifies how i will increment or decrement with each loop
		 *     --> read as i plus plus.  means to add one to the existing value of i
		 */
		for(int i = 0; i <=5; i++){
			/* anything that I put inside the 
			 * for loop will get executed each 
			 * time the for loop iterates
			 */
			
			System.out.println("First For Loop: " + i);
		}
		
		/* i starts out as 10
		 * loop again as long as i is less than or equal to 3
		 * decrement the current value of i by one with each loop
		 */
		for(int i = 10; i >= 3; i-- ){
			System.out.println("Second For Loop: " + i);
		}
		
		String myString = "Pitt County Robotics";
		for(int i = 0;i < myString.length(); i++)
		{
			if(myString.charAt(i) == 'R'){
				System.out.println(
						String.format("Third For Loop:  'R' was the %s letter", i + 1)
						);
				break;
			}
		}

		for(int i = 0; i < myString.length(); i++){
			if(myString.charAt(i) != 'o'){
				continue;
			}
			System.out.println(
					String.format("Fourth For Loop: 'o' found at position %s", i)
					);
		}
		
		int x = 0;
		for(;;){
			x++;
			if(x == 1000){
				System.out.println(
						String.format("Fifth For Loop: i equals %s", x)
						);
				break;
			}
			
		}
		

			
		
	}
}
