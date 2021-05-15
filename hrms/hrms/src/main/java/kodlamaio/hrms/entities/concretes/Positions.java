package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Positions")
public class Positions {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "PositionName")
	private String positionName;

	public Positions() 
	{
		
	}
	public Positions(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}
