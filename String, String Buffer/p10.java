class p10
{
	public static String repeatation(String str1, int n)
	{
		String c="";
		int len=str1.length();
		len=len-n;
		for(int i= 0;i<n;i++)
        {
            c=c+str1.substring(len);
        }
		return c;
	}
	public static void main(String ar[])
	{
		String q=ar[0];
		int x=Integer.parseInt(ar[1]);
		String z=repeatation(q,x);
		System.out.println(z);
	}
}