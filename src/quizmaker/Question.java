package quizmaker;

import java.util.ArrayList;

public abstract class Question {

    private final String question;
    private final String answer;

    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    //Methods

    //Getters and Setters
    public String getQuestion(){ return this.question; }

    public String getAnswer(){ return this.answer; }

    //Other Methods
    public abstract boolean checkAnswer(String answer);
}
