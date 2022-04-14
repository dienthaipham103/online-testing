package tma.bluecat.examonlineserver.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "answer")
public class Answer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "isCorrect")
    private boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question questionid;

    public Answer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public Question getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Question questionid) {
        this.questionid = questionid;
    }
}
