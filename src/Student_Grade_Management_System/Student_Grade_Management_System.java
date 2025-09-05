package Student_Grade_Management_System;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Main method to run the Student Grade Management System.
 * <p>
 * The program asks the user how many students they want to enter,
 * then collects each student's information (name, ID, and grades).
 * After that, it displays a detailed report for every student.
 * </p>
 *
 * @author hayat mohamed
 *
 */
public class Student_Grade_Management_System {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to enter into the system ?");
        int number_student = scanner.nextInt();
        Student[] students = new Student[number_student];
        scanner.nextLine();

        for (int i = 0 ; i< number_student ;i++) {
            System.out.println("Enter name student "+ (i+1) +" :");
            String name = scanner.nextLine();

            System.out.println("Enter id :");
            int id = scanner.nextInt();
            double [] grades = new double[3];

            for (int j = 0 ; j< grades.length ; j++){
                System.out.println("Enter grade for subject " + (j+1) + ":");
                grades[j] = scanner.nextDouble();
            }
            scanner.nextLine();

            students[i] = new Student(name,id,grades);

        }


        System.out.println("------------ Students Report -------------");

        for (int i = 0 ; i< number_student ; ) {
            students[i].displayInfo();
            i++;
            if (i < number_student)
                System.out.println("------------ Report for other Students -------------");

        }


    }
}
