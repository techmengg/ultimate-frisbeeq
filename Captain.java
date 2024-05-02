public class Captain extends UltimatePlayer {
    private boolean type;

    public Captain(String f, String l, String p, boolean t) {
        super(f, l, p);
        type = t;
    }

    public int throwDisc(int pow) {
        if (pow < 1) {
            pow = 1;
        }
        if (pow > 10) {
            pow = 10;
        }
        return pow * 5;
    }

    public boolean getType() {
        return type;
    }

    public String toString() {
        String off = "";
        if (getType()) {
            off = "offense";
        } else {
            off = "defense";
        }
        return super.toString() + "\n   Captain: " + off;
    }
}