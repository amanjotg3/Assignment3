package Assignment3.Task1;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	CalcImplementation obj;
	int a,b;
	protected void setUp() throws Exception {
		obj=new CalcImplementation();
		a=8;
		b=4;
		
		CalcInterface mockObj=mock(CalcInterface.class);

		when(mockObj.add(a, b)).thenReturn(a+b);
		obj.setIntObj(mockObj);
		
		when(mockObj.sub(a, b)).thenReturn(a-b);
		obj.setIntObj(mockObj);
		
		when(mockObj.mul(a, b)).thenReturn(a*b);
		obj.setIntObj(mockObj);
		
		when(mockObj.div(a, b)).thenReturn((double) (a/ b));
		obj.setIntObj(mockObj);
	}

	
	public void testAddTwoNums() {
		assertEquals(12,obj.AddTwoNums(a, b));
	}

	public void testSubTwoNums() {
		assertEquals(4,obj.SubTwoNums(a, b));
	}

	public void testMulTwoNums() {
		assertEquals(32,obj.MulTwoNums(a, b));
	}

	public void testDivTwoNums() {
		assertEquals((double)2 , obj.DivTwoNums(a, b));
	}

	protected void tearDown() throws Exception {
		obj=null;
		a=0;
		b=0;
	}

}
