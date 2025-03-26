package com.manohar.employeemanagementsystembackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDto(Long id,String firstName,String lastName,String  email){
        this.email=email;
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }


    public EmployeeDto() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
