package com.pitsocode.celseacademymanagementsystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "learners")
public class Learner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name", nullable=false)
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column (name= "email")
    private String email;
    @Column (name="password" , nullable=false, length=255 )
    private String password;
  public Learner(){

  }
    public Learner(String firstname, String lastname, String email, String password ) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
