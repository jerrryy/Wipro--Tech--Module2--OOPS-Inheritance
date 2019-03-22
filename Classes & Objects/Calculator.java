class Calculator
{
	static int powerInt(int num1, int num2)
	{
		double result1=Math.pow(num1,num2);
		return (int) result1;
	}
	static double powerDouble(double num1, double num2)
	{
		double result1=Math.pow(num1,num2);
		return result1;
	}
	public static void main (String args[])
	{
		int r1=powerInt(5,2);
		double r2=powerDouble(4.1,2);
		System.out.println(r1);
		System.out.println(r2);
	}
}