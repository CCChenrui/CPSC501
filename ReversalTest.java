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
	
	
	@Test
	public void test() {
		try{
			File Inputfile = folder.newFile("TestCase1Input.txt");
			File Outputfile = folder.newFile("TestCase1Output.txt");
			
			Reversal.reverseFile(Inputfile, Outputfile);
			
			Scanner scan = new Scanner(Outputfile);

			int line=0;
			
			
		} catch (IOException e){
			fail("No exception should be thrown");
		}
	}

	
}
