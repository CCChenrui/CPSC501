//Author : Chenrui Hu

import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;
import org.junit.*;
import org.junit.rules.TemporaryFolder;

// there will be 4 different cases in ReversalTest
public class ReversalTest {
	@Rule public TemporaryFolder folder = new TemporaryFolder();
	
	//@BeforeClass //Open the File
	
	//@AfterClass //Close the File
=======
import java.io.*;
import org.junit.*;

// there will be 4 different cases in ReversalTest
public class ReversalTest {

	@BeforeClass //Open the File
	
	@AfterClass //Close the File

	
	
	@Test
	public void test() {

		try{
			File Inputfile  = folder.newFile("TestCase1Input.txt");
			File Outputfile = folder.newFile("TestCase1Output.txt");
			
			PrintWriter writer = new PrintWriter(Inputfile);
			
			writer.println("My name is CHenrui.");
			writer.close();
			
			
			Reversal.reverseFile(Inputfile, Outputfile);
			
			Scanner scan = new Scanner(Outputfile);

		    String Expected= "CHenrui. is name My";
			
		    String Actual = scan.nextLine();
		    
		    assertEquals("",Expected,Actual);
			
		} catch (IOException e){
			fail("No exception should be thrown");
		}


	}

	
}
