package quizmaker;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    //Class Variables

    //Constructor
    public MultipleChoice(String question, String answer){
        super(question, answer);
    }


    //Methods
    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        } else {
            return false;
        }
    }
}
