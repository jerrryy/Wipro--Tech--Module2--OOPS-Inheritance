class p5
{
	public static String midString(String str)
	{
		String str1="";
		int len=str.length();
			for(int i=1;i<len-1;i++)
			{
				str1=str1+str.charAt(i);
			}return str1;
	}
	public static void main(String ar[])
	{
		String s=ar[0];
		String s1=midString(s);
		System.out.println(s1);
	}
}