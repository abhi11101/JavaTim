package Section7_8_OOPS.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovies();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovies();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovies();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

    }
}
