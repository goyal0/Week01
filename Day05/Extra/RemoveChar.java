import java.util.Scanner;

class RemoveChar{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String str1 = sc.nextLine();
char ch = sc.next().charAt(0);

String ans = "";

for(int i=0;i<str1.length();i++){

if(str1.charAt(i) != ch)
ans += str1.charAt(i);

}

System.out.println(ans);

}
}