package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {

	@Id
	@GeneratedValue
	@Column(name = "EmployeeId")
	private int employeeId;

	@Column(name = "UserId")
	private int userId;

	@Column(name = "MERNISValidation")
	private boolean mernisValidation;

	@Column(name = "Name")
	private String name;

	@Column(name = "SurName")
	private String surname;

	@Column(name = "TcNumber")
	private int tcNumber;

	@Column(name = "BirthOfYear")
	private Date birthOfYear;

	@Column(name = "PositionId")
	private int positionId;

	public Employees() {
		
	}
	public Employees(int employeeId, int userId, boolean mernisValidation, String name, String surname, int tcNumber,
			Date birthOfYear, int positionId) {
		super();
		this.employeeId = employeeId;
		this.userId = userId;
		this.mernisValidation = mernisValidation;
		this.name = name;
		this.surname = surname;
		this.tcNumber = tcNumber;
		this.birthOfYear = birthOfYear;
		this.positionId = positionId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isMernisValidation() {
		return mernisValidation;
	}

	public void setMernisValidation(boolean mernisValidation) {
		this.mernisValidation = mernisValidation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTcNumber() {
		return tcNumber;
	}

	public void setTcNumber(int tcNumber) {
		this.tcNumber = tcNumber;
	}

	public Date getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(Date birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

}
