package Student_Grade_Management_System;
/**
 * Represents a student with name, ID, and grades.
 * Provides methods to calculate average and check if passed.
 *
 *
 * @author hayat mohamed
 * */

public class Student {
    private String name;
    private int id;
    private double grades[];

    /**
     * Constructor to initialize a Student object.
     * @param name The student's name
     * @param id The student's ID
     * @param grades An array of the student's grades
     */

    public Student(String name ,int id ,double grades[]){
        this.name = name;
        this.id = id;
        this.grades = grades;


    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double grades[]) {
        this.grades = grades;
    }

    /**
     * Calculates the average of the student's grades.
     * @return The average grade as a double
     */

    public double calculateAverage(){
        double Average =0 ;
        for (double i : grades){
            Average += i;
        }
        return Average / grades.length;
    }


    /**
     * Checks if the student has passed based on average.
     * @return "Passed" if average >= 50, otherwise "Failed"
     */

    public String isPassed(){
        if (calculateAverage() >= 50)
            return "Passed";
        else
            return "Failed";
    }


    /**
     * Displays student information including name, ID, average, and result.
     */
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + isPassed());

    }

}
