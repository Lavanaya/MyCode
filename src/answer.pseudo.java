import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Random;

public class answer.pseudo{
    //define number range to generate a random number
    int max=11;
    int min=6;

//method to generate and append random number
    public void randomGenerator(String name)
    {
        //make an object of util class Random
        Random random =new Random();
        //call nextInt method which will generate a random number between 1-6 and add min to make the random number lie between 6-11
        Integer randomNumber = (Integer)random.nextInt((max-min)+1) + min;
        //concat the generated number with given name
        name = name.concat(randomNumber.toString());
        System.out.print(name);
    }

    public static void main(String[] args){
        //declaring name variable
        String name="Rahul";
        //to call non-static method create an object of class
        answer.pseudo rand=new answer.pseudo();
        //call method randomGenerator(String)
        rand.randomGenerator(name);
    }
}