package quizmaker;
//Add Questions to Quiz
//Run the Quiz
//Grade the Quiz

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    //Class Variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //Constructor
    public Quiz() {

    }

    //Methods
    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz() {
        for(Question question: questions) {
            //Ask the user the question
            System.out.println(question.getQuestion());
            //Get users answer
            String userAnswer = this.getUserAnswers();
            //Check users answer
            boolean didUserGetQuestionRight = question.checkAnswer(userAnswer);
            //increment numOfQuestionsCorrect if answered correctly
            if(didUserGetQuestionRight){
                this.numOfQuestionsCorrect++;
            }
        }
        //Grade the Quiz
        double percentageCorrect = ((double) this.numOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }

    private String getUserAnswers(){
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
}
