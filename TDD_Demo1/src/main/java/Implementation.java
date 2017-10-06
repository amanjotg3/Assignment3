import java.util.Scanner;

public class Implementation  implements Addition, Multiply, TaxCal{
public long add(long... ls) {
	long result=0;
	for(long temp: ls) {
		result+=temp;
}
	return result;
}
public int mul(int a, int b)
{
return a*b;
}
public int mul1(int a, int b, int c)
{
return (a*b*c)/100;
}
public int tax(int hrs, int hrlyrate)
{
	int pay=hrs*hrlyrate;
	int kiwisaver_dedRate=(7*pay)/100;
	int ResiduePay=pay-kiwisaver_dedRate;
	int taxRate=(10*ResiduePay)/100;
	int tax=ResiduePay-taxRate;
	return tax;
}
}
