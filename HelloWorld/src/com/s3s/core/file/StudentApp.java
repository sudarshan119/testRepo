package com.s3s.core.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentApp {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> s = new ArrayList<>();
		ArrayList<Course> c = new ArrayList<>();
		String sName;
		String grade = "";
		String cName, pName;
		int sid, cid;
		int score;
		String stri ="f";
		Scanner str=new Scanner(System.in);
		Scanner str1=new Scanner(System.in);
		
		while(!(stri.equals("n"))){
			System.out.println("Enter Student Id:  ");
			sid=str.nextInt();
			System.out.println("Enter Student Name: ");
			sName=str1.nextLine();
			System.out.println("Enter Course Name: ");
			cName=str1.nextLine();
			System.out.println("Enter course ID");
			cid=str.nextInt();
			
			System.out.println("Enter Score");
			score=str.nextInt();
			
			if(score>90){
				grade="A";
			}else if(score>80&&score<90){
				grade="B";
			}else{
				grade="C";
			}
			System.out.println("Enter Professor Name ");
			pName=str1.nextLine();
			
			Student stu= new Student(sid,sName, score, grade);
			Course cou= new Course(cid,cName, pName);
			
			//Add data to arraylist
			s.add(stu);
			c.add(cou);
			
			System.out.println("Enter n to exit");
			str1.nextLine();
			
			//Serialization
			FileOutputStream fout= new FileOutputStream("C:\\Users\\karki\\Documents\\java-semptember\\HelloWorld\\src\\com\\s3s\\core\\file\\student.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			for (Student y : s) {

				out.writeObject(y);
			}
			for(Course x: c){
				out.writeObject(x);
			}

			out.flush();
			out.close();
			
			System.out.println("Serialization Done.. ");
			fout.close();
			//Deserializable
			ObjectInputStream input =new ObjectInputStream(new FileInputStream("C:\\Users\\karki\\Documents\\java-semptember\\HelloWorld\\src\\com\\s3s\\core\\file\\student.txt"));
			
			for(Student y:s){
				y=(Student) input.readObject();
				System.out.println("ID "+y.getSID());
				System.out.println("Student Name "+y.getSName());
				System.out.println("Score "+y.getScore());
				System.out.println("Grade "+y.getGrade());
				
			}
			for(Course x:c){
				x=(Course) input.readObject();
				System.out.println("Course ID "+x.getCID());
				System.out.println("Course Name "+x.getCName());
				System.out.println("Course Professor "+x.getProfessor());
			}
			input.close();
		}
		
	}

}
