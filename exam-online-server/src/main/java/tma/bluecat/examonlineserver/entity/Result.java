package tma.bluecat.examonlineserver.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "result")
public class Result implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "mark")
    private float mark;

    @Column(name = "time")
    private String time;

    @Column(name = "type")
    private boolean type;

    @OneToMany(mappedBy = "resultid")
    private List<ResultDetail> resultDetails;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student studentid;

    @ManyToOne
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    private Exam examid;

    public Exam getExamid() {
        return examid;
    }

    public Student getStudentid() {
        return studentid;
    }

    public Result() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public void setStudentid(Student studentid) {
        this.studentid = studentid;
    }

    public void setExamid(Exam examid) {
        this.examid = examid;
    }
}
