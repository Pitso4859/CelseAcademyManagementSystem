package com.pitsocode.celseacademymanagementsystem.Service.implementation;

import com.pitsocode.celseacademymanagementsystem.Entity.Learner;
import com.pitsocode.celseacademymanagementsystem.Repository.LearnerRepository;
import com.pitsocode.celseacademymanagementsystem.Service.LearnerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LearnerServiceImp implements LearnerService {
     private LearnerRepository learnerRepository;

    public LearnerServiceImp(LearnerRepository learnerRepository) {
        super();
        this.learnerRepository = learnerRepository;
    }

    @Override
    public List<Learner> getAllLearners() {
        return learnerRepository.findAll();
    }

    @Override
    public Learner saveLearner(Learner learner) {
        return learnerRepository.save(learner);
    }

    @Override
    public Learner getLearnerById(Long id) {
        return learnerRepository.findById(id).get();
    }

    @Override
    public Learner updateLearner(Learner learner) {
        return learnerRepository.save(learner);
    }

    @Override
    public void deleteLearner(Long id) {
        learnerRepository.deleteById(id);
    }
}
