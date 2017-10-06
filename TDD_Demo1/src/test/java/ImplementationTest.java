import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	private Implementation obj;
	@Before
	public void setUp() throws Exception {
		obj=new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	@Test
	public void testAdd() {
	    long ans=15+(-6)+13+(-20);
		assertEquals(ans,obj.add(15,-6,13,-20));
		ans=25+(-9)+37;
		assertEquals(ans,obj.add(25,-9,37));
		ans=25+19;
		assertEquals(ans,obj.add(25,19));
	}

@Test
public void testPay()
{
	int hrs=25;
	int hourlyrate=19;
	int Pay;
	Pay=hrs*hourlyrate;
	assertEquals(Pay,obj.mul(25,19));
}

@Test
public void testInterest()
{
	int principal=2500;
	int rate=19;
	int time=3;
	int interest;
	interest=(principal*rate*time)/100;
	assertEquals(interest,obj.mul1(2500,19,3));
}

@Test
public void testTax()
{
	int hrs=40;
	int hourlyrate=19;
	int Pay=hrs*hourlyrate;
	int kiwisaver_dedRate=(7*Pay)/100;
	int Residue_Pay=Pay-kiwisaver_dedRate;
	int taxRate=(10*Residue_Pay)/100;
	int tax=Residue_Pay-taxRate;
	
	assertEquals(tax,obj.tax(40,19));
}
}
