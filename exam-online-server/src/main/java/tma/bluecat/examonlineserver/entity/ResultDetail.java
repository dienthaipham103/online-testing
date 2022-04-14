package tma.bluecat.examonlineserver.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "resultdetail")
public class ResultDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "selected")
    private String selected;

    @ManyToOne
    @JoinColumn(name = "quesExam_id", referencedColumnName = "id")
    private QuesExam quesExamid;

    @ManyToOne
    @JoinColumn(name = "result_id", referencedColumnName = "id")
    private Result resultid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuesExam getQuesExamid() {
        return quesExamid;
    }

    public void setQuesExamid(QuesExam quesExamid) {
        this.quesExamid = quesExamid;
    }

    public Result getResultid() {
        return resultid;
    }

    public void setResultid(Result resultid) {
        this.resultid = resultid;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
}
