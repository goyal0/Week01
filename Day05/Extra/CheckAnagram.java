import java.util.Scanner;

class CheckAnagram{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String str1 = sc.next();
String str2 = sc.next();

int store1[] = new int[256];
int store2[] = new int[256];

for(int i=0;i<str1.length();i++){
store1[str1.charAt(i)]++;
}

for(int i=0;i<str2.length();i++){
store2[str2.charAt(i)]++;
}

boolean check = true;

int i=0;

while(i<store1.length || i<store2.length){

if(store1[i] != store2[i]){
check = false;
break;
}
i++;
}

if(check)
System.out.println("Both String are anagram");
else
System.out.println("Both are note anagram");
}
}

