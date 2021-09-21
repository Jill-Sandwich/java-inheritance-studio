package quizmaker;

import java.util.ArrayList;

public class CheckBox extends Question{
    //Class Variables

    //Constructor
    public CheckBox(String question, String answer){
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer){
        String actualAnswer = this.getAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        } else {
            return false;
        }
    }
}
