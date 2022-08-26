public class Main {
    public static void main(String[] args) {
        String question1 = "How many people live in Russia?";
        String question2 = "What is the area of Russia?";
        String question3 = "Which country is the largest in the world?";
        String question4 = "How many people live in Russia?";
        String answer1 = "(1) 100 - 120 million";
        String answer2 = "(2) 120 - 140 million";
        String answer3 = "(3) 140 - 160 million";
        String answer4 = "(4) more than 160 million";
        String answer5 = "(1)less than 15 million square kilometers";
        String answer6 = "(2)15 - 17 million million square kilometers";
        String answer7 = "(3)17 - 19 million million square kilometers";
        String answer8 = "(4)more than 19 million square kilometers";
        String answer9 = "(1)Russia";
        String answer10 = "(2)USA";
        String answer11 = "(3)China";
        String answer12 = "(4)Uganda";
        String answer13 = "(5)Ukraine";
        String answer14 = "(1) 100 - 120 million";
        String answer15 = "(2) 120 - 140 million";
        String answer16 = "(3) 140 - 160 million";
        String answer17 = "(4) more than 160 million";
        Answer[] answers1 = new Answer[]{new Answer(answer1),new Answer(answer2),new Answer(answer3),new Answer(answer4)};
        Answer[] answers2 = new Answer[]{new Answer(answer5),new Answer(answer6),new Answer(answer7),new Answer(answer8)};
        Answer[] answers3 = new Answer[]{new Answer(answer9),new Answer(answer10),new Answer(answer11),new Answer(answer12),new Answer(answer13)};
        Answer[] answers4 = new Answer[]{new Answer(answer14),new Answer(answer15),new Answer(answer16),new Answer(answer17)};
        TestElement questions1 = new TestElement(question1,answers1,3);
        TestElement questions2 = new TestElement(question2,answers2,3);
        TestElement questions3 = new TestElement(question3,answers3,1);
        TestElement questions4 = new TestElement(question4,answers4,3);
        TestElement[] testElements = new TestElement[]{questions1,questions2,questions3,questions4};
        Quiz Opros1 = new Quiz(testElements);
        Opros1.runQuiz();
    }
}