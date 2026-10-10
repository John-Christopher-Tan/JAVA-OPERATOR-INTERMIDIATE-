/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaj.operator.intermidiate;


public class AVAJOPERATORINTERMIDIATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sAbsent = 3;
        double sAverage = 80.25;

        boolean pass = (sAverage >= 75 && sAbsent <= 3) || (sAverage >= 90);

        System.out.println("Student Average Grade: " + sAverage);

        System.out.println("Number of Absences: " + sAbsent);

        if (sAverage >= 90) {
            System.out.println("Status: PASS");
            System.out.println("You exceed the graded needed, Congrats!!! (average >= 90).");
        } else if (sAverage >= 75 && sAbsent <= 3) {
            System.out.println("Status: PASS");
            System.out.println("You are qualified for the grade needed (average >= 75) with acceptable attendance (absences <= 3).");
        } else {
            System.out.println("Status: FAIL");
            System.out.println("You did not meet the grade that needed.");

    }
    
    }}
