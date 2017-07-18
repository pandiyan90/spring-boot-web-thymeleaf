package com.alex.entity.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int u_id;

	@Column
	private String id;
	
	@Column
	private String name;

	public Person(int u_id){
		this.u_id=u_id;
	}

}