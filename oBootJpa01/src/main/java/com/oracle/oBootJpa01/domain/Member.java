package com.oracle.oBootJpa01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "member1") //db안에 member1 테이블을 사용한다는선언
@Getter //lombok
@Setter //lombok
@ToString //lombok
public class Member {
	@Id //p.k 기본키를 설정한다는것
	private long id;
 
	private String name;
 
	/*@Getter //lombok
	@Setter //lombok
	 * @Override public String toString() { String returnstr = ""; returnstr =
	 * "Member1 [id=" + id + ", name=" + name + "]"; return returnstr; }
	 */

	
	/* @ToString //lombok
	 * public long getId() { return id; } public void setId(long id) { this.id = id;
	 * } public String getName() { return name; } public void setName(String name) {
	 * this.name = name; }
	 */
}
