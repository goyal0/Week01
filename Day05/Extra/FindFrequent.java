import java.util.Scanner;

class FindFrequent{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String str = sc.nextLine();

int[] store = new int[256];

for(int i=0;i<str.length();i++){

store[str.charAt(i)]++;
}

int maxCount = 0;
char ch = '\0';

for(int i=0;i<store.length;i++){

if(store[i] > maxCount){
maxCount = store[i];
ch = (char)(i);
}

}

System.out.println(ch);
}
}

