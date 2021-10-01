public class snakeLadder
{
	
	public static void main(String[] args)
	{
		int position = 10;
		System.out.println(" Initial Position : " +position);
		
		int option  = (int)(Math.random()*3)+1;
		System.out.println("Option : " +option);
		
		switch(option)
		{
			case 1: 
				int diceRoll  = (int)(Math.random()*6)+1;
				System.out.println("Dice Number : " +diceRoll);
				
				position += diceRoll;
				System.out.println("Current Position : " +position);
				
			break;	
				
			case 2: 
				
				if(position == 0)
				{
					position = 0;
					System.out.println("Start Position : " +position);
				}
				else
				{
					int diceRoll1  = (int)(Math.random()*6)+1;
					System.out.println("Dice Number : " +diceRoll1);
				
					position -= diceRoll1;
					System.out.println("Current Position : " +position);
				}
				
			break;	
			
			case 3: 
				System.out.println(" No Play : " +position);
			break;
			
			default:
				System.out.println("Player Quit");
			break;
			
				
			
		}
		
		
	}
}
