package student;

import java.util.Scanner;

public class studentInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter first name: ");

        String firstName = sc.nextLine();

        student.setFirstName(firstName);

        System.out.println("Enter middle name: ");

        String middleName = sc.nextLine();

        student.setMiddleName(middleName);

        System.out.println("Enter last name: ");

        String lastName = sc.nextLine();

        student.setLastName(lastName);

        System.out.println("Enter suffix: ");

        String suffix = sc.nextLine();

        student.setSuffix(suffix);

        char midInitial = middleName.charAt(0);

        System.out.println();

        sc.close();

        System.out.println("First Name: " + student.getFirstName());

        System.out.println("Middle Name: " + student.getMiddleName());

        System.out.println("Last Name: " + student.getLastName());

        System.out.println("Suffix: " + student.getSuffix());

        System.out.println("Full Name: " + student.FullName() + "" +
                midInitial + ".");

    }
}
