package quizmaker;

import java.util.ArrayList;

public class TrueFalse extends Question{
    //Class Variables

    //Constructor
    public TrueFalse(String question, String answer){
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer){
        if(answer.toUpperCase().equals(this.getAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
