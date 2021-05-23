package Entities;
import java.time.LocalDate;
public class Customer {
    private int id;
    private String  firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationalityId;
    public Customer(){

    }
    public Customer(int id, String firstName, LocalDate dateOfBirth, String nationalityId,String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
