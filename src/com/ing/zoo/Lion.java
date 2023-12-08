package com.ing.zoo;

import java.util.Random;

public class Lion {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "scratches ear";
        }
        else
        {
            trick = "runs";
        }
        System.out.println(trick);
    }
}
