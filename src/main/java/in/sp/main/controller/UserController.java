package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sp.main.model.Feedback;
import in.sp.main.service.FeedbackService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private FeedbackService service;

    // Add feedback
    @PostMapping("/add")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return service.saveFeedback(feedback);
    }

    // User can see only their feedback
    @GetMapping("/my-feedback")
    public List<Feedback> getMyFeedback(@RequestParam String username) {
        return service.getFeedbackByUsername(username);
    }

}