package com.adp.developer.mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adp.developer.mainApp.dao.VaultRepository;
import com.adp.developer.mainApp.entity.Vault;

@Service
public class VaultServiceImpl implements VaultService{
	
	private VaultRepository vaultRepo;
	
	@Autowired
	public VaultServiceImpl(VaultRepository vaultRepoInject) {
		this.vaultRepo=vaultRepoInject;
	}
	
	@Override
	public List<Vault> getAllVault() {
		return vaultRepo.findAll();
	}

	@Override
	public Vault updateVault(Vault vault) {
		return vaultRepo.save(vault);
	}
	
}
