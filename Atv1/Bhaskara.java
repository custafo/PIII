package Atv1;

import java.util.Scanner;
public class Bhaskara{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Would you like to start the program?");
    String input = in.nextLine();
    do{
    System.out.println("Set a value for a, b and c respectively: ");
    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();
    double delta = Math.pow(b, 2) - 4 * a * c;
    double sqroot = Math.sqrt(delta);
    if(sqroot < 0){
        System.out.println("Is not a viable sqroot.");
    }
    if(sqroot == 0){
        double x = ((b*(-1)) + sqroot)/2 * a;
        System.out.println("There is only one result: " + x);
    }
    else{
    double positv = ((b*(-1)) + sqroot)/2 * a;
    double negatv = ((b*(-1)) - sqroot)/2 * a;
    System.out.println("X and Y are, respectively: " + positv + " and " + negatv);
    }
    if(!input.equals("Yes")){
        in.close();
    }
    }while(input.equals("Yes"));
    }
}