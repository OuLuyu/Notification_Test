package ntut.csie.service.Interface;

import ntut.csie.model.ProjectRelation;

import java.util.List;

public interface ProjectRealtionService {
	List<ProjectRelation> getProjectRelationByProjectId(Long projectId);
	
	String save(ProjectRealtionService prs);
	
	ProjectRealtionService getProjectRelation(Long projectId, String userName);
	
	String delete(Long Id);
}
