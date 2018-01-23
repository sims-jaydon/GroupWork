
import java.util.Scanner;
 
public class C7_1 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
System.out.println("Enter total number of Students:");
int n = input.nextInt();
System.out.println("Enter " + n + " Scores:");
 
// Create an Array of n elements
int[] studentScoreArray = new int[n];
 
// input the grade in the Array table
for (int i = 0; i < studentScoreArray.length; i++) {
  studentScoreArray[i] = input.nextInt();
}
 
// Display each student indexes , his score and grade.
for (int i = 0; i < studentScoreArray.length; i++) {
  System.out.println("Student " + i + " Score is " + studentScoreArray[i] + " and grade is " + getStudentGrade(studentScoreArray, i));
}
}
 
//studentScoreArray
public static int getBestScore(int[] studentScoreArray) {
 
int bestScore = studentScoreArray[0];
for (int i = 0; i < studentScoreArray.length; i++) {
  if (studentScoreArray[i] > bestScore) {
   bestScore = studentScoreArray[i];
  }
}
return bestScore;
}
 
//studentScoreArray
//studentIndex
public static char getStudentGrade(int[] studentScoreArray, int studentIndex) {
     char n;
        if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 10) 
            n = 'A';
        else if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 20) 
            n = 'B';
        else if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 30) 
            n = 'C';
        else if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 40) 
            n = 'D';
        else {
            n = 'F';
        }
             return n;
    }
}
