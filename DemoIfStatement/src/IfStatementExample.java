
public class IfStatementExample {
	
	public static void main(String[] Args){
		
		int totalTeamMembers = 5;
		
		/*
		 * totalTeamMembers < 5 -> is the conditional expression
		 * 						-> the condition must always evaluate to true or false
		 * 						-> is read as if totalTeamMembers is less than 5 then
		 * 						->     execute the block of code directly below
		 */
		if(totalTeamMembers < 5)
		{
			System.out.println("First If:  you need to recruit.");
		}
		
		/*
		 * (totalTeamMembers + 2) >= 5 -> is the conditional expression
		 * 							   -> is read as if totalTeamMembers plus 2 is greater 
		 * 									than or equal to 5 then execute the block of code
		 * 									directly below
		 * 
		 * else -> only executes if no other conditional expression is true in the same if statement
		 *      -> if no other conditional statement is true then the code directly under the else
		 *      		will execute
		 */
		if((totalTeamMembers + 2) >= 5)
		{
			System.out.println("Second If: looks like adding two might help.");
		}
		else
		{
			System.out.println("Second If: looks like you need more than two.");
		}
		
		String myString = "Pitt County Robotics";
		
		/*
		 * There are three parts to this if statement. if - else if - else
		 * Only one of them will execute
		 * The first conditional expression that evaluates to true will be the one to execute
		 * If no conditional expressions are true, then the else will execute
		 */
		if(myString.startsWith("Pitt County"))
		{
			System.out.println("Third If: you are awesome");
		}
		else if(myString.contains("Robotics"))
		{
			System.out.println("Third If:  at least you are on a robotics team");
		}
		else
		{
			System.out.println("Third If: get with the program man!");
		}
		
		boolean isTrue = true;
		
		if(isTrue)
		{
			System.out.println("Fourth If: if executed");
		}
		else if(isTrue) 
		{
			System.out.println("Fourth If: first else if executed");
		}
		else if(isTrue)
		{
			System.out.println("Fourth If: second else if executed");
		}
		else
		{
			System.out.println("Fourth If:  else executed");
		}
		
		/*
		 * Example of a nested if statement
		 */
		if(isTrue){
			if(isTrue){
				if(isTrue){
					// do something
				}
				else{
					// do something
				}
			}
			else{
				// do something
			}
		}
		else{
			// do something
		}
				
	}
}
