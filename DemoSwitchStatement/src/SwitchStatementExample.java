
public class SwitchStatementExample {

	public static void main(String[] Args){
		
		String myColor = "blue";
		
		/*
		 * myColor -> the value being switched
		 * 		   -> only the case statement that matches the switched value will be executed
		 * 		   -> if no case statements match, the default statement will be executed
		 * 		   -> the default statement is optional
		 */
		switch(myColor){
		case "red":
			System.out.println("Switch 1: the color is red");
			break;
		case "white":
			System.out.println("Switch 1: the color is white");
			break;
		case "blue":
			System.out.println("Switch 1: the color is blue");
			break;
		default:
			System.out.println("Switch 1: the color is unknown");
		}
		
		
		switch(myColor){
		case "red":
		case "blue":
			System.out.println("Switch 2: the color is either red or blue");
			break;
		case "white":
			System.out.println("Switch 2: the color is white");
			break;
		}
		
		
	}
	
}
