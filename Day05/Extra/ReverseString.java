import java.util.Scanner;

class ReverseString{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

StringBuilder str = new StringBuilder(sc.nextLine());

int start = 0;
int end = str.length()-1;

while(start < end){

char temp = str.charAt(start);
str.setCharAt(start, str.charAt(end));
str.setCharAt(end, temp);

start++;
end--;
}

System.out.println(str);
}
}