package Section7_8_OOPS.Polymorphism;

public class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens",
                "Space Guys",
                "Planet");
    }
    public void watchScienceFiction(){
        System.out.println("Watch Science Fiction");
    }
}
