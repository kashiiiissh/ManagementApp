package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sp.main.model.Feedback;
import in.sp.main.service.FeedbackService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FeedbackService service;

    @GetMapping("/all")
    public List<Feedback> getAllFeedback() {
        return service.getAllFeedback();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFeedback(@PathVariable Long id) {
        service.deleteFeedback(id);
        return "Feedback Deleted";
    }
}