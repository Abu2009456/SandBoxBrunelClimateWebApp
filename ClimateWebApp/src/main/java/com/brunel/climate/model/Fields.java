package com.brunel.climate.model;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class Fields {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;

    private String lastName;

    private String email;

    private String password;
    
    private int climateData;


    
    
    private Fields() {}

	public Fields(String firstName, String lastName, String email, String password, int climateData ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
		this.password= password;
		this.climateData = climateData;
		
		
		
		
		
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Fields climate = (Fields) o;
		return Objects.equals(id, climate.id) &&
			Objects.equals(firstName, climate.firstName) &&
			Objects.equals(lastName, climate.lastName) &&
			Objects.equals(email, climate.email)&&
		Objects.equals(password, climate.password)&&
		Objects.equals(climateData, climate.climateData);
		
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, firstName, lastName, email, password, climateData);
	}
    
    
    
    
    
    
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getClimateData() {
        return climateData;
    }

    public void setClimateData(int password) {
        this.climateData = climateData;
    }
    
    
    
    
    @Override
	public String toString() {
		return "Fields{" +
			"id=" + id +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", email='" + email + '\'' +
			", password='" + password + '\'' +
			", climateData='" + climateData+ '\'' +
		
			
			'}';
	}
    
    
    
    

}