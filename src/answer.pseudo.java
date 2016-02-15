import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Random;

public class RandomGenerator{
    int max=11;
    int min=6;

    public void randomGenerator(String name)
    {
        Random random =new Random();
        Integer randomNumber = (Integer)random.nextInt((max-min)+1) + min;
        name = name.concat(randomNumber.toString());
        System.out.print(name);
    }

    public static void main(String[] args){
        String name="Rahul";
        RandomGenerator rand=new RandomGenerator();
        rand.randomGenerator(name);
    }
}