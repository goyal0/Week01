import java.util.Scanner;

class CountAlpha{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String str = sc.next();

int countVowel = 0;
int countConsonent = 0;

for(int i=0;i<str.length();i++){
if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
countVowel++;

else
countConsonent++;
}

System.out.println("The number of vowels are" + countVowel);

System.out.println("The number of vowels are" + countConsonent);

}

}

