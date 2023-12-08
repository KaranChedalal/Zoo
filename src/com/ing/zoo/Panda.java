package com.ing.zoo;

import java.util.Random;

public class Panda {

    public String name;
    public String helloText;
    public String eatText;
    public String trick;
    public Panda()
    {
    }

    public void sayHello()
    {
        helloText = "yawn";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch crunch crunch";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "falls";
        }
        else
        {
            trick = "sleeps";
        }
        System.out.println(trick);
    }
    }

