/*
 * The following code was created to show my young niece how coding works. This program "aks" the user 
questions, stores the user's answers and then puts the answers into a string.
 */
package grace;



import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Grace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("You're name is " + name);

        System.out.println("What is your favorite color?");
        String color = sc.nextLine();
        System.out.println(color + " is a nice color. I like the color red, only "
                + "because I am programmed to like red.");

        System.out.println("What is your favorite animal?");
        String animal = sc.nextLine();
        System.out.println(animal + "s are cute. I Like FireFoxes.");

        System.out.println("You're name is " + name + ". You like the color " + color + " and your favorite animal is a " + animal + ".");

        System.out.println("What is your favorite thing to do?");
        String favorite = sc.nextLine();

    }

}
