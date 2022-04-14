package tma.bluecat.examonlineserver.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name ="userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "classid_id", referencedColumnName = "id")
    private Class classid;

    @OneToMany(mappedBy = "studentid")
    private List<Result> results;

    public Class getClassid() {
        return classid;
    }


    public Student() {

    }

    public Student(Long id, String name, String userName, String password, Class classid) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.classid = classid;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setClassid(Class classid) {
        this.classid = classid;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
