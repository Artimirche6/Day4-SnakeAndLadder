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
		
		
		//2nd Player
		
		int diceRoll1 = 0, position1 = 0, diceCount1 = 0, optionCount1 = 0;
		System.out.println(" *******Initial Position for Player 2 : " +position1+"*******");

		while(position1 <= 100)
		{
		
		int option1  = (int)(Math.random()*3)+1;
		System.out.println("Option for Player 2 : " +option1);
		
		optionCount1++;
		System.out.println("#------Option Count for Player 2 : " +optionCount1+ "------#");
		
			switch(option1)
			{
				case 1: 
					
					diceRoll1  = (int)(Math.random()*6)+1;
					System.out.println("Dice Number for Player 2 : " +diceRoll1);
						
					position1 += diceRoll1;
					diceCount1++;
					System.out.println("----Dice Count for Player 2 : " +diceCount1+ "----");
					
					if (position1 > 100)
					{
						position1 -= diceRoll1;
						System.out.println("No Move Position (More than 10) for Player 2 : " +position1);
					}
					else if(position1 == 100)
					{
						System.out.println("Player 2 WON : " +position1);
						System.exit(0);
					}
					else
					{
						System.out.println("Current Position  for Player 2 : " +position1);
					}
					
				break;	
					
				case 2: 
					
					if(position1 == 0)
					{
						position1 = 0;
						System.out.println("Initial Start Position  for Player 2 : " +position1);
					}
					else if(position1 == 100)
					{
						System.out.println("Player 2 WON : " +position1);
						System.exit(0);
					}
					else
					{
						diceRoll1  = (int)(Math.random()*6)+1;
						System.out.println("Dice Number for Player 2 : " +diceRoll1);
						
						diceCount1++;
						System.out.println("----Dice Count for Player 2 : " +diceCount1+ "----");
					
						position1 -= diceRoll1;
						if(position1 < 0)
						{
							position1 += diceRoll1;
							System.out.println(" No Move Position (Less than 0) for Player 2 : " +position1);
						}
						else
						{
							System.out.println("Current Position for Player 2: " +position1);
						}
					}
					
				break;	
				
				case 3: 
					System.out.println(" No Play for Player 2: " +position1);
				break;
				
				default:
					System.out.println("Player 2 Quit");
				break;
				
					
				
			}
			
		}
		
	}
}
