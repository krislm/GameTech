/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessanumber;

import java.util.Scanner;

/**
 *
 * @author Tobias
 */
public class ConsoleTextHuman implements TextHuman
{
    private Scanner s = new Scanner(System.in);

    @Override
    public void sendMessage(String msg)
    {
        System.out.println(msg);
    }

    @Override
    public String askString(String question)
    {
        System.out.print(question + "? ");
        return s.nextLine();
    }

    @Override
    public int askInt(String question, int min, int max)
    {
        if(min > max) throw new IllegalArgumentException("min must be <= max");
        while (true)
        {
            System.out.print(question + " [" + min + ";" + max + "]? ");
            try
            {
                int res = s.nextInt();
                if (res >= min && res <= max) return res;
            } catch (Exception e)
            {
            }
            System.out.println("Please enter an integer between " +
                    min + " and " + max + "!");
        }
    }

    @Override
    public int choose(String question, String[] choices)
    {
        System.out.println(question);
        for(int i = 0; i < choices.length; ++i)
        {
            System.out.println((i+1) + " - " + choices[i]);
        }
        return (askInt("Make a choice", 1, choices.length) - 1);
    }
}
