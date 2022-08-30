class Calculation
{
	int c;
    public void Add(int a,int b)
	{
    	c=a+b;
    	System.out.println(" The sum of given  munbers="+c);
		 
	}
}
class Calculation1 extends Calculation
{
	int z;
    public void Sub(int x,int y)
	{
    	z=x-y;
    	System.out.println(" The subtraction of given  munbers="+z);
		 
	}
}
class Calculation2 extends Calculation1
{
	int r;
    public void Mul(int p,int q)
	{
    	r=p*q;
    	System.out.println(" The multiplication of given  munbers="+r);
		 
	}
}
public class MyCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10;
		Calculation2 C= new Calculation2();
		C.Add(a,b);
		C.Sub(a,b);
		C.Mul(a,b);
	}

}
