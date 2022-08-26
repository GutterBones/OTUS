public class Answer {
    private final String answer;
    private boolean isUserAnswer;

    public Answer (String a) {
        answer = a;
    }
    public String getAnswer(){
        return answer;
    }
    public void setUserAnswer() {
        isUserAnswer = true;
    }
    public boolean getUserAnswer (){
        return isUserAnswer;
    }
    @Override
    public String toString() {
        return answer;
    }
}
