package in.shubs.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class students {
	
	@Id
	@GeneratedValue
	private Integer Sno;
	private String name;
	private String email;
	private String gender;
	private String course;
	private String timings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "students [Sno=" + Sno + ", name=" + name + ", email=" + email + ", gender=" + gender + ", course="
				+ course + ", timings=" + timings + "]";
	}
	
	
	

}
