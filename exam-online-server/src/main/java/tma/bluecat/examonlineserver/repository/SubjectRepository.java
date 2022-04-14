package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
