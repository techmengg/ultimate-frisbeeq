public class UltimatePlayer extends Person {
  
    private int jerseyNumber = -1;
    private static int id = 0;
    private String position = "";

    public UltimatePlayer(String f, String l, String p) {
        super(f, l);
        if (p.contains("cutter")) {
            position = "cutter";
        } else {
            position = "handler";
        }
        id++;
        jerseyNumber = id;
    }

    public String getPosition() {
        return position;
    }

    public int throwDisc(int pow) {
        if (pow < 1) {
            pow = 1;
        }
        if (pow > 10) {
            pow = 10;
        }
        return pow * 4;
    }

    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }
}
