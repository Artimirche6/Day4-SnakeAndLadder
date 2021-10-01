public class snakeLadder
{
	
	public static void main(String[] args)
	{
		int diceRoll = 0, position = 0;
		System.out.println(" *******Initial Position : " +position+"*******");
		
		while(position <= 10)
		{
		
		int option  = (int)(Math.random()*3)+1;
		System.out.println("Option : " +option);
		
		switch(option)
		{
			case 1: 
				
				diceRoll  = (int)(Math.random()*6)+1;
				System.out.println("Dice Number : " +diceRoll);
					
				position += diceRoll;
				
				if (position > 10)
				{
					position -= diceRoll;
					System.out.println("No Move Position (More than 10) : " +position);
				}
				else if(position == 10)
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
				else if(position == 10)
				{
					System.out.println("You Won : " +position);
					System.exit(0);
				}
				else
				{
					diceRoll  = (int)(Math.random()*6)+1;
					System.out.println("Dice Number : " +diceRoll);
				
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
