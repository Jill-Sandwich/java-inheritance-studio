package quizmaker;

public class QuizRunner {
    public static void main(String[] args){
        Quiz myQuiz = new Quiz();

        MultipleChoice myMultiChoiceQuestion = new MultipleChoice("What sound does a Cat make?\nA: Bark\nB: Quack\nC: Meow\nD: None\nPlease type a single letter as an answer:", "C");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckBox myCheckBoxQuestion = new CheckBox("Select all that apply: Which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "B,C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalse myTrueFalseQuestion = new TrueFalse("Cats are herbivores.\n True or False?", "False");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}
