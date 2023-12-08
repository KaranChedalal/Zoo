package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        String nameAnimal = null;



        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Panda po = new Panda();
        po.name = "po";
        Alpaca luna = new Alpaca();
        luna.name = "luna";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");


        String input = scanner.nextLine();
        if(input.equals(commands[0])) // call all animals
        {
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
            po.sayHello();
            luna.sayHello();

        } else if (input.startsWith(commands[0] + " " )) { // calling each animal
            nameAnimal = input.substring(commands[0].length() + 1);


        switch (nameAnimal) {
            case "henk":
                henk.sayHello();
                break;
            case "elsa":
                elsa.sayHello();
                break;
            case "dora":
                dora.sayHello();
                break;
            case "wally":
                wally.sayHello();
                break;
            case "marty":
                marty.sayHello();
                break;
            case "po":
                po.sayHello();
                break;
            case "luna":
                luna.sayHello();
                break;
            default:
                // Defaults when name is not found
                break;
        }


        } else if (input.equals(commands[1])) { // calling all herbivores
            luna.eatLeaves();
            elsa.eatLeaves();
            po.eatLeaves();
            marty.eatLeaves();
        } else if (input.equals(commands[2])) { // calling all carnivores
            henk.eatMeat();
            dora.eatMeat();
            wally.eatMeat();

        } else if (input.equals(commands[3])) { // call all animals to do their trick
                henk.performTrick();
                elsa.performTrick();
                dora.performTrick();
                wally.performTrick();
                marty.performTrick();
                po.performTrick();
                luna.performTrick();

        } else
        {
            System.out.println("Unknown command: " + input);
        }


    }
}

