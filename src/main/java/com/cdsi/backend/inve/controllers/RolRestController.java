package com.cdsi.backend.inve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.entity.Role;
import com.cdsi.backend.inve.models.services.IRolService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/rol")
public class RolRestController {
	@Autowired
	private IRolService rolServi;
	
	@GetMapping(value = "/list")
	//@Secured("ROLE_ADMIN")
	public List<Role> rolesUnicos() {
		return rolServi.rolesUnicos(); 
	}
}
