package com.example.springvalidation.entity;

	import jakarta.validation.constraints.*;

	public class Student {

	    @NotBlank(message = "Name is required")
	    private String name;

	    @Email(message = "Invalid email")
	    private String email;

	    @Min(value = 18, message = "Age must be at least 18")
	    private int age;

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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	    // getters and setters
	}

