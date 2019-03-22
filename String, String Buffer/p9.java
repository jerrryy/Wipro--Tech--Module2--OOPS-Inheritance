class p9
{
	public static String subsequence(String str1, String str2)
	{
		String str3="";
        if(str1.length()>=str2.length()){
            for(int i=0;i<str1.length();i++){
                str3+=str1.charAt(i);
                for(int j=i;j<str2.length();){
                    str3+=str2.charAt(j);
                    break;
                }
            }
        }
        else if(str2.length()>=str1.length()){
            for(int i=0;i<str2.length();i++){
                str3+=str2.charAt(i);
                for(int j=i;j<str1.length();){
                    str3+=str1.charAt(j);
                    break;
                }
            }
        }
        return str3;
		
	}
	public static void main(String ar[])
	{
		String q=ar[0];
		String w=ar[1];
		String z=subsequence(q,w);
		System.out.println(z);
	}
}