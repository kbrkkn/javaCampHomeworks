package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployersService;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

private EmployersService employersService;

@Autowired
public EmployersController(EmployersService employersService) {
	super();
	this.employersService = employersService;
}

}
