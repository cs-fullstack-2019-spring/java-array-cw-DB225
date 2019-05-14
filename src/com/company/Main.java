package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	exe1(args);
	exe2(args);
	exe3(args);
	exe4(args);
//	exe5(args)
	//exe6(args)
	//exe7(args)
    }
    private static void exe1(String[] args) {
        Scanner GradedClass = new Scanner(System.in);
        System.out.println("Enter 4 names: ");
        String name1 = GradedClass.nextLine();
        String name2 = GradedClass.nextLine();
        String name3 = GradedClass.nextLine();
        String name4 = GradedClass.nextLine();
        ArrayList<String> names = new ArrayList<String>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);

        for(String name : names){
            System.out.println(name);
        }
    }

    private static void exe2(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        // Print numbers
        System.out.println(numbers);

        // Print the 3rd index of numbers.
        System.out.println(numbers.get(2));

        // Delete the second index.
        numbers.remove(1);

        // Print the 3rd index again.
        System.out.println(numbers.get(2));
    }

    private static void exe3(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Bob");
        namesList.add("John");
        namesList.add("Kenn");
        namesList.add("Kevin");

        // Remove “Kenn” from the array.
        namesList.remove("Kenn");

        // Print the array.
        System.out.println(namesList);

        // Print the size of the array.
        namesList.size();

        // Check to see if the array contains “Kevin”. If so, get the index of “Kevin” to print.
        if(namesList.contains("Kevin")){
            System.out.println(namesList.indexOf("Kevin"));
        }
    }

    private static void exe4(String[] args){
        Scanner GradedClass = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int number1 = GradedClass.nextInt();
        int number2 = GradedClass.nextInt();
        int number3 = GradedClass.nextInt();
        int number4 = GradedClass.nextInt();
        int number5 = GradedClass.nextInt();

        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        allNumbers.add(number1);
        allNumbers.add(number2);
        allNumbers.add(number3);
        allNumbers.add(number4);
        allNumbers.add(number5);

        int sum = number1+number2+number3+number4+number5;

          System.out.println("Numbers = " +allNumbers);
            System.out.println("The sum is "+sum);

    }

//    private static void exe5(String[] args){
//        Scanner GradedClass = new Scanner(System.in);
//        ArrayList<Integer> userNumbers = new ArrayList<Integer>();
//        do{
//            System.out.println("Add some numbers, then press 0 to end: ");
//            int userInput = GradedClass.nextInt();
//            userNumbers.add(userInput);
//        }
//        while (!userInput.equals(0));
//
//

//    }

}
