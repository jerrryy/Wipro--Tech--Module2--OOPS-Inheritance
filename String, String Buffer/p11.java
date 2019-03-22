import java.util.Scanner;

public class p11{
    public static void main(String[] args) {
        String str1,str2;
        String str3="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String-A : ");
        str1 = scan.nextLine();
        System.out.print("Enter String-B : ");
        str2 = scan.nextLine();
        int i=0,j=0,k=0;
        while(i<str1.length()){

            while((i<str1.length()&&j<str2.length()) && str1.charAt(i) == str2.charAt(j)) {
                if(i!=0 && j==0){
                    k = i;
                }
                i++;
                j++;
            }
            if(j==str2.length()){
                if(k>0) {
                    str3 = str3 + str1.charAt(k - 1);
                }
                if(i!=str1.length()) {
                    str3 = str3 + str1.charAt(i);
                }
            }
            i++;
            j=0;
        }
        if(str3==""){
            str3 = "No match found";
        }
        System.out.println(str3);
    }
}
