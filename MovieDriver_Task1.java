import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        // Create a new object of type Scanner that reads from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Create a new movie object
        Movie movie = new Movie();
        
        // Prompt the user to enter the title of a movie
        System.out.print("Enter the title of the movie: ");
        String title = keyboard.nextLine();
        // Set the title in the movie object
        movie.setTitle(title);
        
        // Prompt the user to enter the movie’s rating
        System.out.print("Enter the movie's rating: ");
        String rating = keyboard.nextLine();
        // Set the rating in the movie object
        movie.setRating(rating);
        
        // Prompt the user to enter the number of tickets sold
        System.out.print("Enter the number of tickets sold: ");
        int soldTickets = keyboard.nextInt();
        // Set the number of tickets sold in the movie object
        movie.setSoldTickets(soldTickets);
        
        // Print out the information using the movie’s toString method
        System.out.println(movie.toString());
        
        // Close the scanner
        keyboard.close();
    }
}
