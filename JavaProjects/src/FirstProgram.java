import java.util.Scanner;

public class FirstProgram {

    //main method
    //entry point of the entry application
        public static void main(String[] args){

           test();
            System.out.println("Hi what is your name?");
            Scanner name = new Scanner(System.in);

            String myName = name.nextLine();

            //print() is a method we are calling
            //() is how you call method
            System.out.println("Hello " + myName + " !");

            System.out.println("How old are you?");
            Scanner age = new Scanner(System.in);

            int myAge = age.nextInt();

            if(myAge < 30){
                System.out.println("Still so young!");

            }else{
                System.out.println("You're really old bye");
            }


        }

        public static void test(){
            System.out.println("Hello World");

        }
}
