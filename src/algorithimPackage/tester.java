package algorithimPackage;

import java.io.*;
import java.util.Scanner;

public class tester {

	public static void main(String[] args)throws IOException {
		
		
		File file = new File("/Users/loganwatkins/eclipse-workspace/AlgorithimCourseUCSD/src/algorithimPackage/assignment1SumTestData.txt"); 
		  
		//BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		
		Scanner sc = new Scanner(file);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		assignment1SumClass sumObject = new assignment1SumClass();
		
		System.out.println(sumObject.sumNums(a, b));
		
		

	}

}
