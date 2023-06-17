package Section7_8_OOPS.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new Adventure("Star Wars");
//        movie.watchMovies();
//        movie=new Comedy("21 Jump Street");
//        movie.watchMovies();
//        movie=new ScienceFiction("Interstellar");
//        movie.watchMovies();
//
//
//        Movie theMovie = Movie.getMovie("Science","Star Wars");
//        theMovie.watchMovies();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type( A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovies();
        }
    }
}
