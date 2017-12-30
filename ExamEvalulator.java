package Chapt6;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ExamEvalulator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
		
		System.out.println("Hello, Welcome to the Exam Evalulator");
		System.out.println("Please give me at least 10 yest grades and "
				+ "I will evaluate their averages, mininum, and the maxinum. ");
		System.out.println("I caution you to avoid typing a grade less than zero"
				+" or more than 100. ");

		
		int average = 0;//the average of the exam.
		int examInput; //stores the exam scores.
		int total =0;
		Scanner scan = new Scanner(System.in);
		
		for(int examNum = 1; examNum <=10; examNum++)
		{ 
			System.out.print("By one at a time, ");
			System.out.println("Enter the Exam Score > ");
			examInput = scan.nextInt();
			
			
			if( examInput>0 && examInput <101)
			{
				total += examInput; //adds the input to the total.
				
				if (examInput == 0) {
			          break;
			      }
			      if (examInput < min) {
			          min = examInput;
			      }
			      if (examInput > max) {
			         max = examInput;
			      }
			}
			else
			{
				System.out.println("Invalid Input, Try again");
				examNum--;//pushes back the exam num so it wont count the invalid grade
			}
			
			 
		
		}
		
		  

	    System.out.println("The mininum of the exams: " + min);
	    System.out.println("The maxinum of the exams: " + max);
		
		average = total/10;
		
		System.out.println("The average of the exams:  " +average);
	}

}
