import java.util.Scanner;

public class Person {

    public static void main(String[] args) {

        PersonData info = new PersonData("May - Ann", "Dura", "Rebucas", 21, "April 14",
                "Brgy. Pena Purok 7, Calbayog City, Samar");
        info.setFirstName("May - Ann");
        String userFirstName = info.getFirstName();
        System.out.println(userFirstName);

    }

}