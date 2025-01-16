import java.util.Scanner;

class RemoveDuplicate{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
 
String str = sc.next();
String  ans = "";

int[] store= new int[256];

for(int i=0;i<str.length();i++){

if(store[str.charAt(i)] == 0){
ans += str.charAt(i);
store[str.charAt(i)]++;
}
}
System.out.println(ans);
}
}