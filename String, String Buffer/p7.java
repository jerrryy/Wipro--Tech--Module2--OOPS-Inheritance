class p7
{
	public static String modified(String str)
	{
		String str1="";
		int len=str.length();
		char first=str.charAt(0);
		char last=str.charAt(len-1);
		if(first=='x' && last=='x'){
			for(int i=1;i<len-1;i++)
			{
				str1=str1+str.charAt(i);
			}return str1;
		}else
				return str;
	}
	public static void main(String ar[])
	{
		String s=ar[0];
		String s1=modified(s);
		System.out.println(s1);
	}
}