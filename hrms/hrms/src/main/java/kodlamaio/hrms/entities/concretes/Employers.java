package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employers")
public class Employers  {

	@Id
	@GeneratedValue
	@Column(name = "EmployerId")
	private int employerId;

	@Column(name = "UserId")
	private int userId;

	@Column(name = "CompanyName")
	private String companyName;

	@Column(name = "WebSiteUrl")
	private String webSiteUrl;

	@Column(name = "Telephone")
	private String telephone;

	@Column(name = "HRMSValidation")
	private boolean hrmsValidation;

	public Employers() {

	}

	public Employers(int employerId, int userId, String companyName, String webSiteUrl, String telephone,
			boolean hrmsValidation) {
		super();
		this.employerId = employerId;
		this.userId = userId;
		this.companyName = companyName;
		this.webSiteUrl = webSiteUrl;
		this.telephone = telephone;
		this.hrmsValidation = hrmsValidation;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSiteUrl() {
		return webSiteUrl;
	}

	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean isHrmsValidation() {
		return hrmsValidation;
	}

	public void setHrmsValidation(boolean hrmsValidation) {
		this.hrmsValidation = hrmsValidation;
	}

}
