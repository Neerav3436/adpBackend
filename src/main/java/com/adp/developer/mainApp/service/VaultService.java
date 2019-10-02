package com.adp.developer.mainApp.service;

import java.util.List;

import com.adp.developer.mainApp.entity.Vault;

public interface VaultService {
	
	public List<Vault> getAllVault();
	public Vault updateVault(Vault vault);
//	@Query("SELECT * FROM vault v WHERE id=1")
//    public Vault updateVault(@RequestBody Vault vault);
}
