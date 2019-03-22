class p4
{
	public static String halfString(String str)
	{
		String str1="";
		int len=str.length();
		if(len%2==0)
		{
			for(int i=0;i<len/2;i++)
			{
				str1=str1+str.charAt(i);
			}return str1;
		}else
			 return null;
	}
	public static void main(String ar[])
	{
		String s=ar[0];
		String s1=halfString(s);
		System.out.println(s1);
	}
}