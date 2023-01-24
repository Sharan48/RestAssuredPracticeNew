package com.javaproject_serialization_And_deseriliaztion;

public class FirstProject {
	
	String ProjectName;
	String ProjectId;
	String ProjectManager;
	int TeamSize;
	long TeamBudget;
	public FirstProject(String projectName, String projectId, String projectManager, int teamSize,
			long teamBudget) {
		super();
		ProjectName = projectName;
		ProjectId = projectId;
		ProjectManager = projectManager;
		TeamSize = teamSize;
		TeamBudget = teamBudget;
	}
	
	FirstProject(){}
	
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectId() {
		return ProjectId;
	}
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}
	public String getProjectManager() {
		return ProjectManager;
	}
	public void setProjectManager(String projectManager) {
		ProjectManager = projectManager;
	}
	public int getTeamSize() {
		return TeamSize;
	}
	public void setTeamSize(int teamSize) {
		TeamSize = teamSize;
	}
	public long getTeamBudget() {
		return TeamBudget;
	}
	public void setTeamBudget(long teamBudget) {
		TeamBudget = teamBudget;
	}
	
	
	

}
