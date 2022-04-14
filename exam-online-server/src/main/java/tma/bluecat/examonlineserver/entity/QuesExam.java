package tma.bluecat.examonlineserver.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "quesexam")
public class QuesExam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "quesExamid")
    private List<ResultDetail> resultDetails;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question questionid;

    @ManyToOne
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    private Exam examid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Question questionid) {
        this.questionid = questionid;
    }

    public Exam getExamid() {
        return examid;
    }

    public void setExamid(Exam examid) {
        this.examid = examid;
    }
}
