import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueInput;

        do {
            // Create a new movie object
            Movie movie = new Movie();
            
            // Prompt the user to enter the title of a movie
            System.out.print("Enter the title of the movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);
            
            // Prompt the user to enter the movie’s rating
            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);
            
            // Prompt the user to enter the number of tickets sold
            System.out.print("Enter the number of tickets sold: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets);
            keyboard.nextLine(); // Clear the newline

            // Print out the information using the movie’s toString method
            System.out.println(movie.toString());

            // Ask if the user wants to continue
            System.out.print("Do you want to enter another movie? (yes/no): ");
            continueInput = keyboard.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        // Close the scanner
        keyboard.close();
        System.out.print("Goodbye");
    }
}
