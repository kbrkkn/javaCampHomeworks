package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Users;

public interface EmployeesDao extends JpaRepository<Users,Integer>{

}
