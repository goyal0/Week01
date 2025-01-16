import java.util.Scanner;

class CheckPalindrome{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

StringBuilder str = new StringBuilder(sc.next());

int i = 0;
int j = str.length()-1;

boolean check = true;

while(i<j){

if(str.charAt(i) != str.charAt(j))
check = false;

i++;
j--;

}

if(check)
System.out.println("String is palindrome");

else
System.out.println("String is not palindrome");

}

}

