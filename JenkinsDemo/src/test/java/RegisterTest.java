import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegisterTest 
{
	Register obj;
	int x,y,z;
	@Before
	public void setUp() throws Exception {
		x=5;
		y=6;
		z=4;
		obj=new Register();
	}
	

	@Test
	public void testaverage() {
		assertEquals(5,obj.average(x,y,z));
			}
	
	@Test
		public void testaverage1() {
		assertEquals(8,obj.average(x,y,z));
			}
	
	@Test
		public void testaverage2() {
			assertEquals(5,obj.average(x,y,z));
				}
	
}
