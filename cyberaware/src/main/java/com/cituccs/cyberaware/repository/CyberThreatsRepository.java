//Joshua Orbiso BSIT-3

package com.cituccs.cyberaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.cyberaware.entity.CyberThreatsEntity;

@Repository
public interface CyberThreatsRepository extends JpaRepository<CyberThreatsEntity, Integer >{	
	
	
	CyberThreatsEntity findByName(String name);
}
