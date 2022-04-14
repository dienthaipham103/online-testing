package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
