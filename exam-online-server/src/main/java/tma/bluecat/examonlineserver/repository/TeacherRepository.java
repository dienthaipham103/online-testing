package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
