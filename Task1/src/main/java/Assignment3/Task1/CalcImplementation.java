package Assignment3.Task1;

public class CalcImplementation {
	CalcInterface intObj;
	public int AddTwoNums(int a, int b)
	{
		return intObj.add(a,b);
	}
	public int SubTwoNums(int a, int b)
	{
		return intObj.sub(a, b);
		
	}
	public int MulTwoNums(int a, int b)
	{
		return intObj.mul(a, b);
	}
	public double DivTwoNums(int a, int b)
	{
		return intObj.div(a, b);
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
}
