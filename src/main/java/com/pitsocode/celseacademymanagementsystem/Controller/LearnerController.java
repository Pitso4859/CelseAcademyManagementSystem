package com.pitsocode.celseacademymanagementsystem.Controller;

import com.pitsocode.celseacademymanagementsystem.Entity.Learner;
import com.pitsocode.celseacademymanagementsystem.Service.LearnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class LearnerController {
    private LearnerService learnerService;

    public LearnerController(LearnerService learnerService) {
        super();
        this.learnerService = learnerService;
    }
    //HANDLER METHOD TO HANDLE LIST LEARNERS AND RETURN MODE AND VIEW
    @GetMapping("/learners")
    public String listLearners(Model model) {
        model.addAttribute("learners", learnerService.getAllLearners());
        return "learners";
    }
    @GetMapping("/learners/new")
    public String createLearnerForm(Model model) {
        // create learner object to hold learner form data
        Learner learner = new Learner();
        model.addAttribute("learner", learner);
        return "create_learner";

    }
    @PostMapping("/learners")
    public String saveLearner(@ModelAttribute("learner") Learner learner) {
        learnerService.saveLearner(learner);
        return "redirect:/learners";
    }
    @GetMapping("/learners/edit/{id}")
    public String editLearnerForm(@PathVariable Long id, Model model) {
        model.addAttribute("learner", learnerService.getLearnerById(id));
        return "edit_learner";
    }
    @PostMapping("learners/{id}")
    public String updateLearner(@PathVariable Long id , @ModelAttribute("learner") Learner learner, Model model) {
        //Get from database
        Learner existingLearner = learnerService.getLearnerById(id);
        existingLearner.setId(id);
        existingLearner.setFirstname(learner.getFirstname());
        existingLearner.setLastname(learner.getLastname());
        existingLearner.setEmail(learner.getEmail());
        existingLearner.getPassword();
        existingLearner.setPassword(learner.getPassword());

        //save update lerner object
        learnerService.saveLearner(existingLearner);
        return "redirect:/learners";
    }
    //handler method too delete LEARNER request
    @GetMapping("/learners/{id}")
    public String deleteLearner(@PathVariable Long id, Model model) {
        learnerService.getLearnerById(id);
        return "redirect:/learners";
    }

}

