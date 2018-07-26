public class FDice
{
	public static void main(String[] args) 
	{
	// creating new dice for the competition
		Dice player1 = new Dice();
		Dice player2 = new Dice();
		Dice player3 = new Dice();
		Dice player4 = new Dice();
		Dice player5 = new Dice();
		Dice comp1 = new Dice();
		Dice comp2 = new Dice();
		Dice comp3 = new Dice();
		Dice comp4 = new Dice();
		Dice comp5 = new Dice();

	//get the values of the dice for each player
		int player1Value = player1.getValue();
		int player2Value = player2.getValue();
		int player3Value = player3.getValue();
		int player4Value = player4.getValue();
		int player5Value = player5.getValue();
		int comp1Value = comp1.getValue();
		int comp2Value = comp2.getValue();
		int comp3Value = comp3.getValue();
		int comp4Value = comp4.getValue();
		int comp5Value = comp5.getValue();

	//make variables to hold the sum of each players dice
		int pTotal = player1Value + player2Value + player3Value + player4Value + player5Value;
		int cTotal = comp1Value + comp2Value + comp3Value + comp4Value + comp5Value;

	//output each dice roll for each competitor
		System.out.println("");
		System.out.println("Your dice rolls were: \n ");
		System.out.println("--> " + player1Value + "\n");
		System.out.println("--> " + player2Value + "\n");
		System.out.println("--> " + player3Value + "\n");
		System.out.println("--> " + player4Value + "\n");
		System.out.println("--> " + player5Value + "\n");

		System.out.println("");
		System.out.println("The computer's dice rolls were: \n ");
		System.out.println("--> " + comp1Value + "\n");
		System.out.println("--> " + comp2Value + "\n");
		System.out.println("--> " + comp3Value + "\n");
		System.out.println("--> " + comp4Value + "\n");
		System.out.println("--> " + player5Value + "\n");
		System.out.println("");

		System.out.println("Your dice rolled to be " + (pTotal) + ".\nThe opponent's dice rolled to be " + (cTotal) + "\n");

		//If statement to output the victor in this dice matchup

		if (pTotal > cTotal)
		{
			System.out.println("Congratulations you won!");
		} 
		else if (cTotal > pTotal) 
		{
			System.out.println("Unfortunately the computer won this round, better luck next time.");
		} else {
			System.out.println("It's a draw, run again for another chance to beat the computer!");
		}
	}
}