package com.simplilearn.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)
public class User {
	private String name;
	private int age;

}
