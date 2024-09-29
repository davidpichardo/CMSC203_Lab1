package lab1;
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char userContinue = 'y';
		String movieName;
		String movieRating;
		int ticketsSold;
		
		//loop for movie name, rating, and sold tickets input
		
		while(userContinue == 'y' || userContinue == 'Y')
		{
			Scanner keyboard = new Scanner(System.in);
			
			Movie movie = new Movie();
			
			System.out.print("Enter movie name: ");
			
			movieName = keyboard.nextLine();
			
			movie.setTitle(movieName);
			
			System.out.print("Enter the rating of the movie");
			
			movieRating = keyboard.nextLine();
			
			movie.setRating(movieRating);
			
			System.out.print("Enter the number of tickets sold for the movie");
			
			ticketsSold = keyboard.nextInt();
			
			movie.setSoldTickets(ticketsSold);
			
			System.out.println(movie.toString());
			
			keyboard.nextLine();
			
			System.out.print("Do you want to enter another? (y or n)");
			userContinue = keyboard.next().charAt(0);
			
		}
		
		System.out.print("Goodbye");
	}

}