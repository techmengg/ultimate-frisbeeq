import java.util.ArrayList;
import java.util.Scanner;


public class Person {
    private String firstName, lastName;

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public int throwDisc(int pow) {
        if (pow < 1) {
            pow = 1;
        }
        if (pow > 10) {
            pow = 10;
        }
        return pow * 2;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
