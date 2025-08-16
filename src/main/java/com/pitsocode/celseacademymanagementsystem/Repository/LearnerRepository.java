package com.pitsocode.celseacademymanagementsystem.Repository;

import com.pitsocode.celseacademymanagementsystem.Entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends JpaRepository<Learner, Long> {
}
