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
public interface TextHuman
{
    public void sendMessage(String msg);
    public String askString(String question);
    public int askInt(String question, int min, int max);
    public int choose(String question, String[] choices);
}
