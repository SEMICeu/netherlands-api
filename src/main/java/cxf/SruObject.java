package cxf;

import java.util.List;

import io.swagger.model.PublicService;

public class SruObject {

	private String publicService_id;
	private String publicService_title;
	private String publicService_description;
	private String publicService_modified;
	private List<String> publicService_language;
	private List<String> publicService_spatial;
	private List<String> publicService_type;
	private String publicService_hasCompetentAuthority;
	private String publicOrganisation_id;
	private String publicOrganisation_spatial;
	
	
	public String getPublicService_id() {
		return publicService_id;
	}
	public void setPublicService_id(String publicService_id) {
		this.publicService_id = publicService_id;
	}
	public String getPublicService_title() {
		return publicService_title;
	}
	public void setPublicService_title(String publicService_title) {
		this.publicService_title = publicService_title;
	}
	public List<String> getPublicService_language() {
		return publicService_language;
	}
	public void setPublicService_language(List<String> publicService_language) {
		this.publicService_language = publicService_language;
	}
	public String getPublicService_description() {
		return publicService_description;
	}
	public void setPublicService_description(String publicService_description) {
		this.publicService_description = publicService_description;
	}
	public String getPublicService_modified() {
		return publicService_modified;
	}
	public void setPublicService_modified(String publicService_modified) {
		this.publicService_modified = publicService_modified;
	}
	public List<String> getPublicService_spatial() {
		return publicService_spatial;
	}
	public void setPublicService_spatial(List<String> publicService_spatial) {
		this.publicService_spatial = publicService_spatial;
	}
	public List<String> getPublicService_type() {
		return publicService_type;
	}
	public void setPublicService_type(List<String> publicService_type) {
		this.publicService_type = publicService_type;
	}
	public String getPublicService_hasCompetentAuthority() {
		return publicService_hasCompetentAuthority;
	}
	public void setPublicService_hasCompetentAuthority(String publicService_hasCompetentAuthority) {
		this.publicService_hasCompetentAuthority = publicService_hasCompetentAuthority;
	}
	public String getPublicOrganisation_id() {
		return publicOrganisation_id;
	}
	public void setPublicOrganisation_id(String publicOrganisation_id) {
		this.publicOrganisation_id = publicOrganisation_id;
	}
	public String getPublicOrganisation_spatial() {
		return publicOrganisation_spatial;
	}
	public void setPublicOrganisation_spatial(String publicOrganisation_spatial) {
		this.publicOrganisation_spatial = publicOrganisation_spatial;
	}
}
