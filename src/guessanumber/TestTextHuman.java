/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guessanumber;

/**
 *
 * @author Tobias
 */
public class TestTextHuman
{
    public static void main(String[] args)
    {
        TextHuman human = new ConsoleTextHuman();
    
        String name = human.askString("What is your name");
        int age = human.askInt("What is your age", 1, 100);
        if(age < 18)
        {
            human.sendMessage("Wow, you are young!");
        }
        else
        {
            human.sendMessage("Wow, you are old!");
        }
        
        String[] pets = {"Cat", "Dog", "Bird", "Fish", "None of the above"};
        
        int pet = human.choose("Which pet do you have", pets);
        
        human.sendMessage("Okay,  so you have a " + pets[pet]);
    }
    
}
