package com.oracle.oBootJpa02.respository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "member2")
public class Member {
	private long id;
	private String name;
	private long sal;
}
