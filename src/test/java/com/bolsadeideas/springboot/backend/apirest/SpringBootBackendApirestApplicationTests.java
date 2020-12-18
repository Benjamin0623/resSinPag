package com.bolsadeideas.springboot.backend.apirest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cdsi.backend.inve.models.entity.Role;
import com.cdsi.backend.inve.models.entity.Usuario;
import com.cdsi.backend.inve.models.services.IRolService;
import com.cdsi.backend.inve.models.services.IUsuarioService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBackendApirestApplicationTests {
	
	@Autowired
	private IUsuarioService userServi;
	
	@Autowired
	private IRolService rolServi;
	
	@Test
	public void contextLoads() {
		
		Long id = (long) 23;
		// Role rol = rolServi.getRol(id);
		// System.out.println(rol.getAuthority());
		List<Role> roles = new ArrayList<>();
		roles.add(rolServi.getRol(id));
		
		Usuario objU = new Usuario();
		
		objU.setUsername("VUV");
		objU.setEnabled(true);
		objU.setPassword("VUV");
		objU.setRoles(roles);
		
		Usuario u = userServi.createUsusario(objU);
		assertTrue(u.getPassword().equalsIgnoreCase(objU.getPassword()));
		
	}

}
