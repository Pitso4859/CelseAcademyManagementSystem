package com.pitsocode.celseacademymanagementsystem.Service;

import com.pitsocode.celseacademymanagementsystem.Entity.Learner;

import java.util.List;

public interface LearnerService {
    List<Learner> getAllLearners();
    Learner saveLearner(Learner learner);
    Learner getLearnerById(Long id);
    Learner updateLearner(Learner learner);
    void deleteLearner(Long id);
}
