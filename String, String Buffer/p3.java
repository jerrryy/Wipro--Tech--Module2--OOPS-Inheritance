class p3
{
	public static String calculate(String str)
	{
		String str1="";
		int j;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(j=0;j<2;j++)
			{
				str1=str1+str.charAt(j);
			}
			j=0;
		}
		return str1;
	}
	public static void main(String ar[])
	{
		String s=ar[0];
		String z=calculate(s);
		System.out.println(z);
	}
}