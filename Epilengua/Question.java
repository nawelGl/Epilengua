package Epilengua;

public class Question {
    private String question;

    private Reponse[] reponses = new Reponse[4];

    public void setQuestion(String question, Reponse reponse1, Reponse reponse2, Reponse reponse3, Reponse reponse4) {
        this.question = question;
        this.reponses[0] = reponse1;
        this.reponses[1] = reponse2;
        this.reponses[2] = reponse3;
        this.reponses[3] = reponse3;
    }

    public String getQuestion() {
        return question;
    }

    public Question(String question){
        this.question = question;
    }
}
