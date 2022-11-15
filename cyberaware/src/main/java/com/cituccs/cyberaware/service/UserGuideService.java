package com.cituccs.cyberaware.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.cyberaware.entity.UserGuideEntity;
import com.cituccs.cyberaware.repository.UserGuideRepository;

@Service
public class UserGuideService {
	@Autowired
	UserGuideRepository ugrepo;

	public UserGuideEntity insertThreat(UserGuideEntity userg) {
		return ugrepo.save(userg);
	}
	
	public List<UserGuideEntity> getAllGuides(){
		return ugrepo.findAll();
	}
	
	public UserGuideEntity findByGuide(String guide) {
		if(ugrepo.findByGuide(guide)!=null)
			return ugrepo.findByGuide(guide);
		else
			return null;
	}
	
	public UserGuideEntity putGuide(int ugid, UserGuideEntity newGuideDetails) throws Exception{
		UserGuideEntity userg = new UserGuideEntity();
		
		try {
			userg = ugrepo.findById(ugid).get();
			userg.setGuide(newGuideDetails.getGuide());
			userg.setGdescription(newGuideDetails.getGdescription());
			return ugrepo.save(userg);
		}catch(NoSuchElementException nex) {
			throw new Exception("UserGuide ID " + ugid + "does not exist!");
		}
	}
	
	public String deleteGuide(int ugid) {
		String msg;
		if(ugrepo.findById(ugid) != null) {
			ugrepo.deleteById(ugid);		
			msg = "Course ID " + ugid + " is successfully deleted!";
		}
		else
			msg = "Course ID " + ugid + " is NOT found!";
		return msg;
	}	
}
