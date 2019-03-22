class p2
{
	public static String mixed(String str, String str1)
	{
		String s=str.toLowerCase();
		str1=str1.toLowerCase();
		int len=str.length();
		int len1=str1.length();
		char ch=str.charAt(len-1);
		char ch1=str1.charAt(0);
		if(ch==ch1)
		{
			for(int i=1;i<len1;i++)
			{
				s=s+str1.charAt(i);
			}
			return s;
		}
		else
		{
				s=s+str1;
			return s;
		}
		
	}
	public static void main(String ar[])
	{
		String q=ar[0];
		String w=ar[1];
		String z=mixed(q,w);
		System.out.println(z);
	}
}