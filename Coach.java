public class Coach extends Person {
    private String role;

    public Coach(String first, String last, String rol) {
        super(first, last);
        role = rol;
    }

    public String toString() {
        return super.toString() + "\n   Role: " + role;
    }
}
