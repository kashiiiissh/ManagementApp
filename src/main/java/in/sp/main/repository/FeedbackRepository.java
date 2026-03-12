package in.sp.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    List<Feedback> findByUsername(String username);

}
