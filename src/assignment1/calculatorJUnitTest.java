/**
 * 
 */
package assignment1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * @author amirashfaq
 *
 */
public class calculatorJUnitTest {

	

	 @Test
	    public void shouldVerifyParameters() {
	        //calculator.main(new String[]{"7","+", "2"});
	    }
	
	 @Test
	   public void testArgumentsSupplied() {
		
		 PrintStream originalOut = System.out;         
			OutputStream os = new ByteArrayOutputStream(); 
			PrintStream ps = new PrintStream(os); 
			System.setOut(ps); 
			String[] args = {"8", "-","2"};
			calculator.main(args);
			assertSame(6, Integer.valueOf(os.toString().trim()) );
			System.setOut(originalOut );
		
//originalOut.flush();
	   }
}
