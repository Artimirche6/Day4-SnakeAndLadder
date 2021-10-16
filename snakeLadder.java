public class snakeLadder
{
	
	public static void main(String[] args)
	{
		int diceRoll = 0, position = 0, diceCount = 0, optionCount = 0;
		System.out.println(" *******Initial Position : " +position+"*******");

		while(position <= 100)
		{
		
		int option  = (int)(Math.random()*3)+1;
		System.out.println("Option : " +option);
		
		optionCount++;
		System.out.println("#------Option Count : " +optionCount+ "------#");
		
			switch(option)
			{
				case 1: 
					
					diceRoll  = (int)(Math.random()*6)+1;
					System.out.println("Dice Number : " +diceRoll);
						
					position += diceRoll;
					diceCount++;
					System.out.println("----Dice Count : " +diceCount+ "----");
					
					if (position > 100)
					{
						position -= diceRoll;
						System.out.println("No Move Position (More than 10) : " +position);
					}
					else if(position == 100)
					{
						System.out.println("You Won : " +position);
						System.exit(0);
					}
					else
					{
						System.out.println("Current Position : " +position);
					}
					
				break;	
					
				case 2: 
					
					if(position == 0)
					{
						position = 0;
						System.out.println("Initial Start Position : " +position);
					}
					else if(position == 100)
					{
						System.out.println("You Won : " +position);
						System.exit(0);
					}
					else
					{
						diceRoll  = (int)(Math.random()*6)+1;
						System.out.println("Dice Number : " +diceRoll);
						
						diceCount++;
						System.out.println("----Dice Count : " +diceCount+ "----");
					
						position -= diceRoll;
						if(position < 0)
						{
							position += diceRoll;
							System.out.println(" No Move Position (Less than 0) : " +position);
						}
						else
						{
							System.out.println("Current Position : " +position);
						}
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
}
