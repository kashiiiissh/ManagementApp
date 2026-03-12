package in.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.model.Feedback;
import in.sp.main.repository.FeedbackRepository;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    
    public Feedback saveFeedback(Feedback feedback) {
        return repository.save(feedback);
    }

    
    public List<Feedback> getFeedbackByUsername(String username) {
        return repository.findByUsername(username);
    }

    
    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }

    
    public void deleteFeedback(Long id) {
        repository.deleteById(id);
    }
}