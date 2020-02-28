
import java.util.Scanner;

public class vacationQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			String vacationType = new String();
			String result = new String();
			int groupSize;
			
			
			System.out.println("What type of vacation would you like to go on? Musical, Tropical, or Adventurous");
			vacationType = scan.nextLine();
		
			System.out.println("How many people will be in your group?");
			groupSize = scan.nextInt();
			
			result = "Since you have " + groupSize + " in your group and you want to take a " + vacationType + " vacation, you should take a ";
			
			
			if(groupSize>=1&&groupSize<=2)
				result = result + "First Class flight to ";
			else if(groupSize>=3&&groupSize<=5)
				result = result + "Helicopter to ";
			else if(groupSize>=6)
				result = result + "Charter Flight to";
			
			if(vacationType.equalsIgnoreCase("Musical"))
				result = result + " New Orleans!";
			else if(vacationType.equalsIgnoreCase("Tropical"))
				result = result + " the sunny Beaches in Mexico!";
			else if(vacationType.equalsIgnoreCase("Adventurous"))
				result = result + " the Grand Canon and go whitewater rafting!";
			System.out.println(result);
		
			
		}

}
