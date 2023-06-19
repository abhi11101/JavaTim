package Section14.Lambda;

public record Person(String firstName, String lastName) {
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
