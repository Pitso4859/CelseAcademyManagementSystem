package com.pitsocode.celseacademymanagementsystem;

import com.pitsocode.celseacademymanagementsystem.Entity.Learner;
import com.pitsocode.celseacademymanagementsystem.Repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CelseAcademyManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CelseAcademyManagementSystemApplication.class, args);
    }
   @Autowired
   private LearnerRepository learnerRepository;
    @Override
    public void run(String... args) throws Exception {
       /* Learner learner1 = new Learner("Koketso","Mabina","koketsomabina@gmail.com","koki");
        Learner learner2 = new Learner("Happy","Nkotolane","happinessnkotolane@gmail.com","nkotolane");
        learnerRepository.save(learner1);
        learnerRepository.save(learner2);

        */
    }
}
