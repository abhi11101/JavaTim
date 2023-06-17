package Section7_8_OOPS.Polymorphism;

public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watch Comedy");
    }
}
