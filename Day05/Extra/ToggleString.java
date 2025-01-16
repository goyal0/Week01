import java.util.Scanner;

    class ToggleString{

        public static String Toggle(String str1){

                    String toggledString = "";

                    for(int i=0;i<str1.length();i++){

                    if(str1.charAt(i) >='a' && str1.charAt(i) <= 'z')
                                            toggledString += (char)(str1.charAt(i) - 32);

                    else if(str1.charAt(i) >='A' && str1.charAt(i) <= 'Z')
                    toggledString += (char)(str1.charAt(i)+32);
                        }
                       
                return toggledString;

                    }

        public static void main(String[] args){
                       
            Scanner sc = new Scanner(System.in);
               
                //Taking input of string
                                                                                            System.out.println("Enter the string to toggle");
                String str1 = sc.nextLine();
                                   
                    String ans1 = Toggle(str1);

                System.out.println("Toggled string is");
                System.out.println(ans1);      
 
            }

        }

