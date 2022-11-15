//Joshua Orbiso BSIT-3

package com.cituccs.cyberaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.cyberaware.entity.UserGuideEntity;

@Repository
public interface UserGuideRepository extends JpaRepository<UserGuideEntity, Integer >{

	
	UserGuideEntity findByGuide(String guide);
}
