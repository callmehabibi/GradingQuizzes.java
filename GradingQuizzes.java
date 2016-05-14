/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Abdallah Hassan
 */
public class GradingQuizzes {

    static int arrayLength;

    public static void main(String[] args) {
        int correct = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the quiz: ");
        arrayLength = in.nextInt();
        System.out.print("Enter the answer key in one line: ");

        int answerKey[] = new int[arrayLength];
        int answersCompared[] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            answerKey[i] = in.nextInt();
        }

        boolean gradeAQuiz = true;
        while (gradeAQuiz) {
            System.out.print("Enter the questions to be compared: ");

            for (int i = 0; i < arrayLength; i++) {
                answersCompared[i] = in.nextInt();
            }

            for (int i = 0; i < arrayLength; i++) {
                System.out.println("The correct answer is: " + answerKey[i] + ". The inputted answer was " + answersCompared[i]);

                if (answerKey[i] == answersCompared[i]) {
                    correct++;
                }
            }

            double correctPercent = (double) correct / arrayLength * 100;
            System.out.println("# correct = " + correct + ". % correct = %" + correctPercent);
            correct = 0;
            System.out.print("Grade another quiz? (y/n): ");
            if (in.next().toUpperCase().equals("N")) {
                gradeAQuiz = false;
            }
        }
    }
}
