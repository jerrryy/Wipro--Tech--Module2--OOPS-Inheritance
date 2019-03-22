class p6
{
	public static String shortLong(String str, String str1)
	{
		String s="";
		String s1="";
		String s2="";
		int len=str.length();
		int len1=str1.length();
			if(len<len1)
			{
				s=str;
				s1=str1;
			}
			else{
				s=str1;
				s1=str;
			}
			s2=s+s1+s;
			return s2;
	}
	public static void main(String ar[])
	{
		String q=ar[0];
		String w=ar[1];
		String z=shortLong(q,w);
		System.out.println(z);
	}
}