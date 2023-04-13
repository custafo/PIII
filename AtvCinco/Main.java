package AtvCinco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Driver's formulary");
        System.out.println("What's your name?");
        String driversName = in.nextLine();
        System.out.println("What's your car's plate number?");
        int plate = in.nextInt();
        System.out.println("What's your car's brand?");
        String brand = in.nextLine();
        in.nextLine();
        System.out.println("Tell your distance between the passenger: ");
        double distancedriver = in.nextDouble();

            System.out.println("Welcome to gUBER, Passenger, ready to start your ride?");
            System.out.println("Please, set the address as you wish: ");
            boolean finished = false;
            while(!finished){
                System.out.println("1. Home");
                System.out.println("2. Mom's");
                System.out.println("3. Cafe");
                System.out.println("4. Library");
                System.out.println("5. Park");
                System.out.println("0. To cancel riding with gUBER");
                int choice = in.nextInt();
                switch(choice) {
                    case 0: 
                    finished = true;
                    break;
                    
                    case 1: 
                        double distance = 5;
                        double c = 10;
                        double delta = Math.pow(distancedriver, 2) - 4 * distance * c;
                        double sqroot = Math.sqrt(delta);
                        if(sqroot < 0){
                        System.out.println("Is not a viable sqroot.");
                        }
                        if(sqroot == 0){
                        double x = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        System.out.println("There is only one result: " + x);
                        }
                        else{
                        double positv = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        double negatv = ((distancedriver*(-1)) - sqroot)/2 * distance;
                        System.out.println("Finding you a driver...");
                        System.out.println("Your driver is: " + driversName);
                        System.out.println("The car's model is : " + brand);
                        System.out.println("The car's plate is : " + plate);
                        System.out.println("The value is: R$" + positv * 10 + ",00");
                        }
                        break;

                    case 2:
                        distance = 10;
                        c = 10;
                        delta = Math.pow(distancedriver, 2) - 4 * distance * c;
                        sqroot = Math.sqrt(delta);
                        if(sqroot < 0){
                        System.out.println("Is not a viable sqroot.");
                        }
                        if(sqroot == 0){
                        double x = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        System.out.println("There is only one result: " + x);
                        }
                        else{
                        double positv = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        double negatv = ((distancedriver*(-1)) - sqroot)/2 * distance;
                        System.out.println("Finding you a driver...");
                        System.out.println("Your driver is: " + driversName);
                        System.out.println("The car's model is : " + brand);
                        System.out.println("The car's plate is : " + plate);
                        System.out.println("The value is: R$" + positv * 10 + ",00");
                        }

                    break;

                    case 3:
                        distance = 12;
                        c = 10;
                        delta = Math.pow(distancedriver, 2) - 4 * distance * c;
                        sqroot = Math.sqrt(delta);
                        if(sqroot < 0){
                        System.out.println("Is not a viable sqroot.");
                        }
                        if(sqroot == 0){
                        double x = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        System.out.println("There is only one result: " + x);
                        }
                        else{
                        double positv = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        double negatv = ((distancedriver*(-1)) - sqroot)/2 * distance;
                        System.out.println("Finding you a driver...");
                        System.out.println("Your driver is: " + driversName);
                        System.out.println("The car's model is : " + brand);
                        System.out.println("The car's plate is : " + plate);
                        System.out.println("The value is: R$" + positv * 10 + ",00");
                        }
                        
                    break;

                    case 4:
                        distance = 15;
                        c = 10;
                        delta = Math.pow(distancedriver, 2) - 4 * distance * c;
                        sqroot = Math.sqrt(delta);
                        if(sqroot < 0){
                        System.out.println("Is not a viable sqroot.");
                        }
                        if(sqroot == 0){
                        double x = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        System.out.println("There is only one result: " + x);
                        }
                        else{
                        double positv = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        double negatv = ((distancedriver*(-1)) - sqroot)/2 * distance;
                        System.out.println("Finding you a driver...");
                        System.out.println("Your driver is: " + driversName);
                        System.out.println("The car's model is : " + brand);
                        System.out.println("The car's plate is : " + plate);
                        System.out.println("The value is: R$" + positv * 10 + ",00");
                        }

                    break;

                    case 5:
                        distance = 20;
                        c = 10;
                        delta = Math.pow(distancedriver, 2) - 4 * distance * c;
                        sqroot = Math.sqrt(delta);
                        if(sqroot < 0){
                        System.out.println("Is not a viable sqroot.");
                        }
                        if(sqroot == 0){
                        double x = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        System.out.println("There is only one result: " + x);
                        }
                        else{
                        double positv = ((distancedriver*(-1)) + sqroot)/2 * distance;
                        double negatv = ((distancedriver*(-1)) - sqroot)/2 * distance;
                        System.out.println("Finding you a driver...");
                        System.out.println("Your driver is: " + driversName);
                        System.out.println("The car's model is : " + brand);
                        System.out.println("The car's plate is : " + plate);
                        System.out.println("The value is: R$" + positv * 10 + ",00");
                        }

                    break;

                    default:
                    System.out.println("Not able to conclude choice, start all over again.");
                    finished = true;
                    break;
                }    
            }
        }
        }