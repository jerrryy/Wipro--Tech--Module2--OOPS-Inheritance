class p8
{
	public static String modifiedStr(String str)
	{
		String str1="";
		int count=0,i,l=0;
		int len=str.length();
		for(i=0;i<len;i++)
		{
			if((str.charAt(i))=='*')
			{
				count++;
			}
		}
		if(count==1)
		{
			for(i=0;i<len;i++)
			{
				if((str.charAt(i))=='*')
					l=i;
			}
			for(i=0;i<len;i++)
			{
				if(i==l-1 || i==l || i==l+1)
					continue;
				else
					str1=str1+str.charAt(i);
			}
			return str1;
		}
		else
			return null;
	}
	public static void main(String ar[])
	{
		String q=ar[0];
		String z=modifiedStr(q);
		System.out.println(z);
	}
}