import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[] subjectScores = new double[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter score for subject " + (i + 1) + ": ");
            subjectScores[i] = scanner.nextDouble();
        }

        double totalScore = 0;
        for (double score : subjectScores) {
            totalScore += score;
        }

        double averageScore = totalScore / numberOfSubjects;

        System.out.println("Total score: " + totalScore);
        System.out.println("Average score: " + averageScore);

        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}