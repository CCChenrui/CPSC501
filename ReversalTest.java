//Author : Chenrui Hu
<<<<<<< HEAD
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
>>>>>>> 05e9e30162f201986ce9b6ca936d9206d2d062a8
	
	
	@Test
	public void test() {
<<<<<<< HEAD
		try{
			File Inputfile = folder.newFile("TestCase1Input.txt");
			File Outputfile = folder.newFile("TestCase1Output.txt");
			
			Reversal.reverseFile(Inputfile, Outputfile);
			
			Scanner scan = new Scanner(Outputfile);

			int line=0;
			
			
		} catch (IOException e){
			fail("No exception should be thrown");
		}
=======
		File actual =  
>>>>>>> 05e9e30162f201986ce9b6ca936d9206d2d062a8
	}

	
}
