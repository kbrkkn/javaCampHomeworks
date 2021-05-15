package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
@Service
public class EmployersManager implements EmployersService{

	@Autowired
    private EmployersDao employersDao;

	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}


	
}
