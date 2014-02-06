/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessanumber;

/**
 *
 * @author krismaini
 */
public class Controller implements Ctrl {


    //amount of guesses = the players score
    int score=0;

    @Override
    public int runGame(Chooser c, Guesser g, int min, int max) {
        c.chooseNumber(min, max);
        g.prepare(min, max);
        
        Answer a;
        do {
            int guess = g.makeGuess();
            a = c.evaluate(guess);
            g.feedback(a);
            score++;
        }while (!a.equals(Answer.CORRECT));
        
        return score;
    }

}
