public class Dice
{
	private int randomValue;
	private static final int HIGHEST_VALUE = 6;
	private static final int LOWEST_VALUE = 1;

	//Constructor
	public Dice()
	{
		randomValue = ((int)(Math.random()*100) % HIGHEST_VALUE + LOWEST_VALUE);
	}

	//Accessor method that returns the die's value
	public int getValue()
	{
		return randomValue;
	}
}