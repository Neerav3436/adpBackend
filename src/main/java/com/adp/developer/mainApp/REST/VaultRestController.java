package com.adp.developer.mainApp.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adp.developer.mainApp.entity.Vault;
import com.adp.developer.mainApp.service.VaultService;

@RestController
@RequestMapping("/api")
public class VaultRestController {
	
	private VaultService vaultService;
	
	@Autowired
	public VaultRestController(VaultService vault) {
		this.vaultService=vault;
	}
	
	@GetMapping("/vaults")
//	@CrossOrigin(origins="http://localhost:4200")
	public List<Vault> findAll(){
		return vaultService.getAllVault();
	}
	
	@PutMapping("/vaults")
	public Vault updateVault(@RequestBody Vault vault) {
		/*
		 * Algorithm to calculate change and expose the data calculate via new get api to UI
		 * {get input from UI post API is bit confusing}
		 * calculate balance..
		 * this.findAll() will change availability in vault and then to UI
		 */
		//Once data is received do a two way transaction calculate the change 
		//and push to UI via backend
		//make an update call to hibernate/jpa to datastore
		System.out.println();
		vaultService.updateVault(vault);
		return vault;
	}
}
