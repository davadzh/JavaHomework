package models;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private TestList test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;


    public Test(){}


    public int getRow_id() {
        return row_id;
    }

    public Question getQuestion() {
        return question;
    }

    public TestList getTest() {
        return test;
    }


    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setTest(TestList test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Test{" +
                "row_id=" + row_id +
                ", test=" + test +
                ", question=" + question +
                '}';
    }
}
