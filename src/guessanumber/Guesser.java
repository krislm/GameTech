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
public interface Guesser
{
    void prepare(int min, int max);
    int makeGuess();
    void feedback(Answer ans);
}
