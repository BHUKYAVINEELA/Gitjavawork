package Crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int stdId;
private String firstName;
private String lastName;

public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
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

}
