package student;

import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        Student student = new Student();

        Scanner sc = new Scanner(System.in);
        int choice = 1;

        System.out.println();
        System.out.println("====================================================");
        System.out.println();
        System.out.println();
        System.out.println("Student Record Management App v1");
        System.out.println();
        System.out.println("Selection Menu: ");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Create Student Record: ");
        System.out.println("0. Exit ");
        System.out.println("----------------------------------------------------");
        System.out.println();
        while (choice != 0) {
            System.out.println("Enter Selection: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println("Creating Student Record...");
                    System.out.println();
                    System.out.println();
                    break;
                case 0:
                    System.out.println();
                    System.out.println();
                    System.out.println("Exit");
                    System.out.println();
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;

            }

            System.out.println();
            System.out.println("====================================================");
            System.out.println();
            System.out.println();
            System.out.println("Student Record Management App v1");
            System.out.println();
            System.out.println("Enter Student Details: ");
            System.out.println("----------------------------------------------------");
            System.out.println("Student ID No.");
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.println("Enter Student ID No.: ");
            sc.nextLine();

            while (choice != 0) {
                System.out.println("====================================================");
                System.out.println();
                System.out.println();
                System.out.println("Student Record Management App v1");
                System.out.println();
                System.out.println("Student Record Selection Menu: ");
                System.out.println("----------------------------------------------------");
                System.out.println("1. Update Student Profile Details ");
                System.out.println("2. Update Student Course Details");
                System.out.println("3. Display Student Record");
                System.out.println("0. Exit");
                System.out.println("----------------------------------------------------");
                System.out.println();
                System.out.println("Enter Selection: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println();
                        System.out.println();
                        System.out.println("1. Update Student Profile Details ");
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println();
                        System.out.println("2. Update Student Course Details");
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println();
                        System.out.println("3. Display Student Record");
                        System.out.println();
                        System.out.println();
                        break;
                    case 0:
                        System.out.println();
                        System.out.println();
                        System.out.println("Exit");
                        System.out.println();
                        System.out.println();
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

                System.out.println();
                System.out.println("====================================================");
                System.out.println();
                System.out.println();
                System.out.println("Student Record Management App v1");
                System.out.println();
                System.out.println("Student Profile Details Update Selection Menu: ");
                System.out.println("----------------------------------------------------");

                System.out.println("1. Update Student ID No.: ");

                String studentId = sc.nextLine();

                student.setStudentId(studentId);

                System.out.println("2. Update First Name: ");

                String firstName = sc.nextLine();

                System.out.println("3. Update Middle Name: ");

                String middleName = sc.nextLine();

                student.setMiddleName(middleName);

                System.out.println("4. Update Last Name: ");

                String lastName = sc.nextLine();

                student.setLastName(lastName);

                System.out.println("5. Update Suffix: ");

                String suffix = sc.nextLine();

                student.setSuffix(suffix);

                System.out.println("6. Update Age: ");

                String studentAge = sc.nextLine();

                student.setAge(studentAge);

                System.out.println("7. Update Year Level: ");

                String yearLevel = sc.nextLine();

                student.setYearLevel(yearLevel);

                System.out.println("8. Update Phone Number: ");

                String phoneNo = sc.nextLine();

                student.setPhoneNo(phoneNo);

                System.out.println("9. Update Email: ");

                String eMail = sc.nextLine();

                student.setEmail(eMail);

                System.out.println("0. Return ");

                System.out.println("----------------------------------------------------");

                System.out.println("Update Course Name: ");

                String courseName = sc.nextLine();

                student.setCourseName(courseName);

                System.out.println("Update Course Code: ");

                String courseCode = sc.nextLine();

                student.setCourseCode(courseCode);

                System.out.println("Update Department: ");

                String studentDep = sc.nextLine();

                student.setDepartment(studentDep);

                /**
                 * System.out.println("Update Student ID No.: ");
                 * 
                 * String studentId = sc.nextLine();
                 * 
                 * student.setStudentId(studentId);
                 * 
                 * System.out.println("Update First Name: ");
                 * 
                 * String firstName = sc.nextLine();
                 * 
                 * System.out.println("Update Middle Name: ");
                 * 
                 * String middleName = sc.nextLine();
                 * 
                 * student.setMiddleName(middleName);
                 * 
                 * System.out.println("Update Last Name: ");
                 * 
                 * String lastName = sc.nextLine();
                 * 
                 * student.setLastName(lastName);
                 * 
                 * System.out.println("Update Suffix: ");
                 * 
                 * String suffix = sc.nextLine();
                 * 
                 * student.setSuffix(suffix);
                 * 
                 * System.out.println("Update Age: ");
                 * 
                 * String studentAge = sc.nextLine();
                 * 
                 * student.setAge(studentAge);
                 * 
                 * System.out.println("Update Year Level: ");
                 * 
                 * String yearLevel = sc.nextLine();
                 * 
                 * student.setYearLevel(yearLevel);
                 * 
                 * System.out.println("Update Phone Number: ");
                 * 
                 * String phoneNo = sc.nextLine();
                 * 
                 * student.setPhoneNo(phoneNo);
                 * 
                 * System.out.println("Update Email: ");
                 * 
                 * String eMail = sc.nextLine();
                 * 
                 * student.setEmail(eMail);
                 * 
                 * System.out.println("Update Course Name: ");
                 * 
                 * String courseName = sc.nextLine();
                 * 
                 * student.setCourseName(courseName);
                 * 
                 * System.out.println("Update Course Code: ");
                 * 
                 * String courseCode = sc.nextLine();
                 * 
                 * student.setCourseCode(courseCode);
                 * 
                 * System.out.println("Update Department: ");
                 * 
                 * String studentDep = sc.nextLine();
                 * 
                 * student.setDepartment(studentDep);
                 */

                System.out.println();

                System.out.println(" Student Record ");
                System.out.println("====================================================");
                System.out.println("0. Exit");
                System.out.println("====================================================");
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Student Profile Details:");

                if (!firstName.isEmpty()) {
                    String a = firstName;
                    student.setFirstName(a);
                    System.out.println(" " + " * First Name: " + student.getFirstName());
                } else {
                    System.out.println(" " + " * First Name: " + student.getFirstName());
                }

                if (!middleName.isEmpty()) {
                    String b = middleName;
                    student.setMiddleName(b);
                    System.out.println(" " + " * Middle Name: " + student.getMiddleName());
                } else {
                    System.out.println(" " + " * Middle Name: " + student.getMiddleName());
                }

                if (!lastName.isEmpty()) {
                    String c = lastName;
                    student.setLastName(c);
                    System.out.println(" " + " * Last Name: " + student.getLastName());
                } else {
                    System.out.println(" " + " * Last Name: " + student.getLastName());
                }

                if (!suffix.isEmpty()) {
                    String d = suffix;
                    student.setSuffix(d);
                    System.out.println(" " + " * Suffix: " + student.getSuffix());
                } else {
                    System.out.println(" " + " * Suffix: " + student.getSuffix());
                }

                if (!studentAge.isEmpty()) {
                    String e = studentAge;
                    student.setAge(e);
                    System.out.println(" " + " * Age: " + student.getAge());
                } else {
                    System.out.println(" " + " * Age: " + student.getAge());
                }

                if (!yearLevel.isEmpty()) {
                    String f = yearLevel;
                    student.setYearLevel(f);
                    System.out.println(" " + " * Year Level: " + student.getYearLevel());
                } else {
                    System.out.println(" " + " * Year Level: " + student.getYearLevel());
                }

                if (!phoneNo.isEmpty()) {
                    String g = phoneNo;
                    student.setPhoneNo(g);
                    System.out.println(" " + " * Phone Number: " + student.getPhoneNo());
                } else {
                    System.out.println(" " + " * Phone Number: " + student.getPhoneNo());
                }

                if (!eMail.isEmpty()) {
                    String h = eMail;
                    student.setEmail(h);
                    System.out.println(" " + " * Email: " + student.getEmail());
                } else {
                    System.out.println(" " + " * Email: " + student.getEmail());
                }

                System.out.println();
                System.out.println("Student Course Details:");

                if (!courseName.isEmpty()) {
                    String i = courseName;
                    student.setCourseName(i);
                    System.out.println(" " + " * Course Name: " + student.getCourseName());
                } else {
                    System.out.println(" " + " * Course Name: " + student.getCourseName());
                }

                if (!courseCode.isEmpty()) {
                    String j = courseCode;
                    student.setCourseCode(j);
                    System.out.println(" " + " * Course Code: " + student.getCourseCode());
                } else {
                    System.out.println(" " + " * Course Code: " + student.getCourseCode());
                }

                if (!studentDep.isEmpty()) {
                    String k = studentDep;
                    student.setDepartment(k);
                    System.out.println(" " + " * Department: " + student.getDepartment());
                } else {
                    System.out.println(" " + " * Department: " + student.getDepartment());
                }

                System.out.println("----------------------------------------------------");
                System.out.println();
                System.out.println("Enter Selection: ");
                System.out.println();
                System.out.println("====================================================");
                sc.close();

            }

        }
    }
}