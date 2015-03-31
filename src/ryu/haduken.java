package ryu;

import java.util.Scanner;
public class haduken
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

int option;


    int guess;
    int cumputerNum;
    cumputerNum = 0 + (int) ( Math.random() * 10 );
	
	
	int numberOfGoodGuesses = 0;
	int numberOfBadGuesses = 0;
	boolean win = false;



       int numberOfPlays = 0; 
    do {    
	

	 while (win == false) {

    System.out.print( "Enter your guess:  " );
    guess = input.nextInt();

    
 
   

    if ( guess > cumputerNum )
    {
    System.out.print("Too high, try again. \n");
	numberOfBadGuesses++;
        
    }
        

    else if ( guess < cumputerNum )
    {
    System.out.print("Too low, try again. \n");
	numberOfBadGuesses++;
    }


    else if( guess == cumputerNum )
    {
    //System.out.print("Are you pyschic?   ");
	numberOfGoodGuesses++;
	win = true;
    }

   
   }
    
        
    

        
    {
	System.out.print( "\n Enter <-1> to play again or <-2> to finish. " );
    option = input.nextInt();
    numberOfPlays++;
    }
    
   } while ((option == -1 ) || (option == -2));
    
	
	System.out.println( "FIN!" );
        
	System.out.println( "Bad Guesses: " + numberOfBadGuesses );
       
	System.out.println( "Good guesses: " + numberOfGoodGuesses );

	System.out.println( "Plays:  " + numberOfPlays);
     }
}