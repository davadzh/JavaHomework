package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    private String text;
    private boolean correct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToMany(mappedBy = "student_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentAnswer> studentAnswers;


    public Answer() {}

    public Answer(String text, boolean correct){
        this.text = text;
        this.correct = correct;
        this.studentAnswers = new ArrayList<StudentAnswer>();
    }


    public int getRow_id() {
        return row_id;
    }

    public String getText() {
        return text;
    }

    public Question getQuestion() {
        return question;
    }

    public List<StudentAnswer> getStudentAnswers() {
        return studentAnswers;
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setStudentAnswers(List<StudentAnswer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "row_id=" + row_id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                ", question=" + question +
                ", studentAnswers=" + studentAnswers +
                '}';
    }
}
