package com.ing.zoo;

import java.util.Random;

public class Hippo {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "swims";
        }
        else
        {
            trick = "holds breath";
        }
        System.out.println(trick);
    }
}
