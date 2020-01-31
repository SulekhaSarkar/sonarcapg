import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void simpletestPass()
	{
		int a=1;
		int b=3;
		assertTrue(a+b == 4);
	}
	
	@Test
	public void simpletestFail()
	{
		int a=2;
		int b=3;
		assertTrue(a+b == 5);
	}
}
