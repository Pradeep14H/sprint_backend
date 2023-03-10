package com.projectmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity

public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long projectId;

	private String projectName;

	private String projectCode;
	private String projectBudget;

	private String technicalRequirments;

	private String projectManagerName;

	private String projectTechnology;

	private String projectCoordinator;
	
	private String projectDiscription;

	@Enumerated(EnumType.STRING)
	private Status status;

	@OneToOne(mappedBy = "project", cascade = CascadeType.ALL)
	@JoinColumn(name="project_fk")
	private Team team;

	//public Project(long l, String string, String string2) {
		// TODO Auto-generated constructor stub
	//}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(String projectBudget) {
		this.projectBudget = projectBudget;
	}

	public String getTechnicalRequirments() {
		return technicalRequirments;
	}

	public void setTechnicalRequirments(String technicalRequirments) {
		this.technicalRequirments = technicalRequirments;
	}

	public String getProjectManagerName() {
		return projectManagerName;
	}

	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}

	public String getProjectTechnology() {
		return projectTechnology;
	}

	public void setProjectTechnology(String projectTechnology) {
		this.projectTechnology = projectTechnology;
	}

	public String getProjectCoordinator() {
		return projectCoordinator;
	}

	public void setProjectCoordinator(String projectCoordinator) {
		this.projectCoordinator = projectCoordinator;
	}

	public String getProjectDiscription() {
		return projectDiscription;
	}

	public void setProjectDiscription(String projectDiscription) {
		this.projectDiscription = projectDiscription;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectCode=" + projectCode
				+ ", projectBudget=" + projectBudget + ", technicalRequirments=" + technicalRequirments
				+ ", projectManagerName=" + projectManagerName + ", projectTechnology=" + projectTechnology
				+ ", projectCoordinator=" + projectCoordinator + ", projectDiscription=" + projectDiscription
				+ ", status=" + status + ", team=" + team + "]";
	}
	
	
	
	

	

}
