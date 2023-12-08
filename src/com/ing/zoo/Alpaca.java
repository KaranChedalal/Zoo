package com.ing.zoo;

import java.util.Random;

public class Alpaca {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;




    public Alpaca()
    {
    }

    public void sayHello()
    {
        helloText = "spit";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "nom crunch nom";
        System.out.println(eatText);

    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "walks";
        }
        else
        {
            trick = "spits";
        }
        System.out.println(trick);
    }


}
