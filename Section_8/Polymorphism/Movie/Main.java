import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("\n");
        // Movie theMovie = Movie.getMovie("Comedy", "Kanchana");
        // theMovie.watchMovie();
        // Movie theCMovie = new Comedy("Hungama");
        // theCMovie.watchMovie();
        // Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter A or C : ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie title : ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
        s.close();
    }
}
