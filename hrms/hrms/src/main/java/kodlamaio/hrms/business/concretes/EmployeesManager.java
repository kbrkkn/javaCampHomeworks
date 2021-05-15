package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Users;

@Service
public class EmployeesManager implements EmployeesService {

	@Autowired
	private EmployeesDao employeesDao;

	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	
	
	
}
