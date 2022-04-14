package tma.bluecat.examonlineserver.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "exam")
public class Exam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column (name = "time")
    private int time;

    @Column(name = "numberQuestion")
    private int numberQuestion;

    @OneToMany(mappedBy = "examid")
    private List<Result> results;

    @OneToMany(mappedBy = "examid")
    private List<QuesExam> quesExams;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacherid;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subjectid;

    public Exam() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNumberQuestion() {
        return numberQuestion;
    }

    public void setNumberQuestion(int numberQuestion) {
        this.numberQuestion = numberQuestion;
    }

    public Teacher getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Teacher teacherid) {
        this.teacherid = teacherid;
    }

    public Subject getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Subject subjectid) {
        this.subjectid = subjectid;
    }
}
