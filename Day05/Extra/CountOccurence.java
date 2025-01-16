import java.util.Scanner;

class CountOccurence{

public static void main(String[] args){

Scanner sc =  new Scanner(System.in);

String str = sc.nextLine();
String substr = sc.next();
int occurence = 0;
int count=0;

for(int i=0;i<str.length();i++){

if(str.charAt(i) == substr.charAt(0)){
 count = 0;

for(int j=i, p = 0;j<i+substr.length() && j < str.length();j++ , p++){

    if(str.charAt(j) == substr.charAt(p))
        count++;
    else
        break;
   
}

if(count == substr.length())
    occurence++;
}
}

System.out.println(occurence);

}
}

