package Section7_8_OOPS.Polymorphism;

public class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens.");
    }
    public void watchAdventure(){
        System.out.println("Watch Adventure");
    }
}
