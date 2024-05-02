// Don't forget, you will need to import the ArrayList class to implement the UltimateTeam class

import java.util.ArrayList;

public class UltimateTeam {
    private ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
    private ArrayList<Coach> coaches = new ArrayList<Coach>();

    public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c) {
        for (UltimatePlayer up : p) {
            players.add(up);
        }
        for (Coach co : c) {
            coaches.add(co);
        }
    }

    public String getCutters() {
        String list = "";
        for (UltimatePlayer p : players) {
            if (p.getPosition().contains("cutter")) {
                list += p.toString() + "\n";
            }
        }
        return list;
    }

    public String getHandlers() {
        String list = "";
        for (UltimatePlayer p : players) {
            if (p.getPosition().contains("handler")) {
                list += p.toString() + "\n";
            }
        }
        return list;
    }

    public String toString() {
        String list = "COACHES\n";
        for (Coach c : coaches) {
            list += c.toString() + "\n";
        }
        list += "\nPLAYERS\n";
        for (UltimatePlayer p : players) {
            list += p.toString() + "\n";
        }
        return list;
    }
}
