public class snakeLadder
{
	public static void main(String[] args)
	{
		int position = 0;
		System.out.println(" Initial Position : " +position);
		
		int number = (int)(Math.random()*6)+1;
		System.out.println("Dice Number : " +number);
		
		number += position;
		System.out.println("Current Position : " +number);
		
	}
}
