package com.adp.developer.mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.adp.developer.mainApp.entity.Vault;

@CrossOrigin(origins="http://localhost:4200")
public interface VaultRepository extends JpaRepository<Vault,Integer>{

}
