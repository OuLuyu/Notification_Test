//package ntut.csie.model;
//
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.persistence.*;
//import java.security.SecureRandom;
//
//@Entity // This tells Hibernate to make a table out of this class
//public class ProjectRelation {
//	@Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//
//	@NotBlank
//	private Long projectId;
//	private Long userId;
//
//	public Long getId(){
//		return id;
//	}
//
//	public void setId(Long id){
//		this.id = id;
//	}
//
//	public Long getUserId(){
//		return userId;
//	}
//
//	public void setUserId(Long userId){
//		this.userId = userId;
//	}
//
//	public Long getProjectId(){
//		return projectId;
//	}
//
//	public void setProjectId(Long projectId){
//		this.projectId = projectId;
//	}
//}
