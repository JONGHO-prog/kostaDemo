/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.naviworks.acme.clazz;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Clazz")
public class Clazz implements Serializable {
	public Clazz() {
	}
	
	@Column(name="Id", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_NAVIWORKS_ACME_CLAZZ_CLAZZ_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_NAVIWORKS_ACME_CLAZZ_CLAZZ_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Enumerated(EnumType.STRING)
	private com.naviworks.acme.clazz.ClazzStatus clazzStatus;
	
	@ManyToOne(targetEntity=com.naviworks.acme.cource.Course.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CourseID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKClazz743645"))	
	private com.naviworks.acme.cource.Course course;
	
	@Column(name="EvaluationRate", nullable=false)	
	private float evaluationRate;
	
	@OneToMany(mappedBy="clazz", targetEntity=com.naviworks.acme.clazz.ClazzDay.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set clazzDay = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setEvaluationRate(float value) {
		this.evaluationRate = value;
	}
	
	public float getEvaluationRate() {
		return evaluationRate;
	}
	
	public void setCourse(com.naviworks.acme.cource.Course value) {
		this.course = value;
	}
	
	public com.naviworks.acme.cource.Course getCourse() {
		return course;
	}
	
	public void setClazzStatus(com.naviworks.acme.clazz.ClazzStatus value) {
		this.clazzStatus = value;
	}
	
	public com.naviworks.acme.clazz.ClazzStatus getClazzStatus() {
		return clazzStatus;
	}
	
	public void setClazzDay(java.util.Set value) {
		this.clazzDay = value;
	}
	
	public java.util.Set getClazzDay() {
		return clazzDay;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
