package cpsc2150.sets;

import java.util.*;

public class IntegerSetApp {

    private static final int MAX_SIZE = 100;

    private static final int EXIT_CHOICE = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Print a menu of options
        printMenu();
        int input = Integer.parseInt(in.nextLine());
        while (input != EXIT_CHOICE) {
            if (input == 1) {
                //Make each set
                System.out.println("Make set 1");
                ISet set1 = getSet(in);
                System.out.println("Make set 2");
                ISet set2 = getSet(in);

                //print the sets
                System.out.println("Set 1 is:");
                System.out.println(set1.toString());
                System.out.println("Set 2 is:");
                System.out.println(set2.toString());

                //get the intersection
                set1.intersect(set2);

                //print the intersection
                System.out.println("The intersection is:");
                System.out.println(set1.toString());
            } else {
                System.out.println("That was not an option");
            }

            //print the menu and get the next option
            printMenu();
            input = Integer.parseInt(in.nextLine());
        }
    }

    /**
     * This method will print the options menu
     *
     * @pre none
     * @post [menu will be displayed to user]
     */
    private static void printMenu() {
        System.out.println("\nMake a selection");
        System.out.println("1. Find the INTERSECTION of Two Sets");
        System.out.println(EXIT_CHOICE + ". Exit");
    }

    /**
     * This method will get the values from a user and build a set
     *
     * @param in a scanner object to use to get data from the user
     * @return a set that the user built
     * @pre in is open and connected to the user
     * @post getSet = [set containing the user provided values]
     */
    private static <T> ISet getSet(Scanner in) {
        System.out.println("Enter 'a' for ArraySet and 'l' for ListSet");
        String choice = in.nextLine();
        ISet<T> s = null;
        if (choice.equals("a"))
            s = new ArraySet<>();
        if (choice.equals("l"))
            s = new ListSet<>();
        int counter = 0;


        // add values to the set until user enters "qt" to stop entering values
        System.out.println("Enter a value to add to the set. Enter qt to stop adding to the set");
        T val = (T) in.nextLine();
        while (!val.equals("qt")) {
            //we can assume if they did not enter "qt", they did enter a number
            T addVal = (T) val;
            if (counter == MAX_SIZE) {
                System.out.println("ERROR: You have reached the maximum number of values you can input into the set!");
                break;
            }
            //add the value to our set
            s.add(addVal);
            counter++;
            //get the next value before looping
            System.out.println("Enter a value to add to the set. Enter qt to stop adding to the set");
            val = (T) in.nextLine();
        }

        //we have filled our set, so we can return it
        return s;
    }
}