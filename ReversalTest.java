//Author : Chenrui Hu

import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;
import org.junit.Test;
<<<<<<< HEAD

// there will be 4 different kinds of cases in ReversalTest
// normal lines
// short lines, empty lines and long lines
// long lines, empty lines and short lines
// empty lines, normal lines, empty lines, normal lines and empty lines


public class ReversalTest {
	@Test // example, normal lines
	public void testexample() throws IOException {
		
			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("Lorem ipsum dolor sit amet,");
			writer.println("consectetur adipiscing elit.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected="elit. adipiscing consectetur";
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected="amet, sit dolor ipsum Lorem";
		    Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		   
		    scan.close();
	}
	
	
	@Test //normal lines case
	public void test1() throws IOException {
		
			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
=======

// there will be 4 different cases in ReversalTest
public class ReversalTest {

	@Test
	public void test() {
		
		try{
			File Inputfile  = new File("TestCase1Input.txt");
			File Outputfile = new File("TestCase1Output.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);
			
			writer.println("My name is CHenrui.");

			writer.close();
			
			
			Reversal.reverseFile(Inputfile, Outputfile);
			
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "CHenrui. is name My";
			
		    String Actual = scan.nextLine();
		    
		    scan.close();
		    
		    assertEquals("",Expected,Actual);
			
		} catch (IOException e){
			fail("No exception should be thrown");
		}


	}
	
	@Test
	public void test1() {
		
		try{
			File Inputfile  = new File("TestCase1Input.txt");
			File Outputfile = new File("TestCase1Output.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);
			
			writer.println("My name is CHenrui.");
			writer.println("");
			writer.println("This is my testcase.");
			writer.close();
			
>>>>>>> c28cc8df08f65f91268e141cc9a608c757b2e7df
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("My name is Chenrui.");
			writer.println("This is my testcase.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
<<<<<<< HEAD
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "testcase. my is This";			
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected= "Chenrui. is name My";			
		    Actual = scan.nextLine();	    		    
		    assertEquals("",Expected,Actual);
		    
		    scan.close();
	}
	
	@Test  // empty lines, normal lines, empty lines, normal lines and empty lines
	public void test2() throws IOException {

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("");
			writer.println("This will be a long line, and my name is Chenrui Hu.");
			writer.println("");
			writer.println("This is a short line.");
			writer.println("");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected="line. short a is This";
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected="Hu. Chenrui is name my and line, long a be will This";
		    Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		   
		    scan.close();
=======
			
			
			
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "testcase. my is This";
			
		    String Actual = scan.nextLine();
		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected= "CHenrui. is name My";
			
		    Actual = scan.nextLine();
		    		    
		    assertEquals("",Expected,Actual);
		    
		    scan.close();
		} catch (IOException e){
			fail("No exception should be thrown");
		}

>>>>>>> c28cc8df08f65f91268e141cc9a608c757b2e7df

	}

	@SuppressWarnings("resource")
	@Test  //short lines, empty lines and long lines
	public void test3() throws IOException {
		

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("My name is Chenrui.");
			writer.println("");
			writer.println("This is my another testcase, I want to make it becomes long.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "long. becomes it make to want I testcase, another my is This";			
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    
		    
		    Expected= "Chenrui. is name My";			
		    Actual = scan.nextLine();	    		    
		    assertEquals("",Expected,Actual);
		    

	}
	
	
	@Test // long lines, empty lines and short lines
	public void test4() throws IOException {
		

			File Inputfile  = new File("TestCaseInput.txt");
			File Outputfile = new File("TestCaseOutput.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);		
			writer.println("This will be a long line, and my name is Chenrui Hu.");
			writer.println("");
			writer.println("This is a short line.");
			writer.close();
						
			Reversal.reverseFile(Inputfile, Outputfile);
						
			Scanner scan = new Scanner(Outputfile);

		    String Expected="line. short a is This";
		    String Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		    Expected="Hu. Chenrui is name my and line, long a be will This";
		    Actual = scan.nextLine();		    		    
		    assertEquals("",Expected,Actual);
		    
		   
		    scan.close();

	}	
}
