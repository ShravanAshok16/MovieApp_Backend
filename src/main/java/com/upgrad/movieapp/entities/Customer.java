package com.upgrad.movieapp.entities;



import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name="Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private int customerId;

    @Column(name="first_name", length = 20, nullable = false)
    private String firstName;
    @Column(name="last_name", length = 20)
    private String lastName;
    @Column(length = 20, nullable = false, unique = true)
    private String userName;
    @Column(length = 20, nullable = false)
    @Size(min=5)
    private String password;
    @Column(nullable = false)
    private LocalDateTime dateOfBirth;
    @Column(nullable = false,name = "user_type_id")
    @JoinColumn(name = "user_type_id")
    private int userTypeId;

    @Column(nullable = false,name = "language_id")
    @JoinColumn(name = "language_id")
    private int languageId;

    public int getCustomerId(){
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
}
