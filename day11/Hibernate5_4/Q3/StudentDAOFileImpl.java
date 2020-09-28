package mypack;

import java.io.*;

public class StudentDAOFileImpl implements StudentDAO{
	
	public void addStudent(Student ref) {
		try 
		{
			FileOutputStream fos = new FileOutputStream("d:\\abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ref);
			oos.close();
			//fos.close();
			
			/*
			FileOutputStream fos=new FileOutputStream("d:\\abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ref);*/
		}
		catch(IOException ee) {
			System.out.println("In catch : " + ee);
		}
	}
}
