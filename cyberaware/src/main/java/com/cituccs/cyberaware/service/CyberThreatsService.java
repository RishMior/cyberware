package com.cituccs.cyberaware.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.cyberaware.entity.CyberThreatsEntity;
import com.cituccs.cyberaware.repository.CyberThreatsRepository;

@Service
public class CyberThreatsService {
	@Autowired
	CyberThreatsRepository ctrepo;
	
	
	public CyberThreatsEntity insertThreat(CyberThreatsEntity threat) {
		return ctrepo.save(threat);
	}
	
	public List<CyberThreatsEntity> getAllThreats(){
		return ctrepo.findAll();
	}
	
	public CyberThreatsEntity findByName(String name) {
		if(ctrepo.findByName(name)!=null)
			return ctrepo.findByName(name);
		else
			return null;
	}
	
	public CyberThreatsEntity putThreat(int ctid, CyberThreatsEntity newThreatDetails) throws Exception{
		CyberThreatsEntity threat = new CyberThreatsEntity();
		
		try {
			threat = ctrepo.findById(ctid).get();
			threat.setName(newThreatDetails.getName());
			threat.setDescription(newThreatDetails.getDescription());
			threat.setLevel(newThreatDetails.getLevel());	
			return ctrepo.save(threat);
		}catch(NoSuchElementException nex) {
			throw new Exception("Cyberthreat ID " + ctid + "does not exist!");
		}
	}
	
	public String deleteThreat(int ctid) {
		String msg;
		if(ctrepo.findById(ctid) != null) {
			ctrepo.deleteById(ctid);
			msg = "Course ID " + ctid + " is successfully deleted!";
		}
		else
			msg = "Course ID " + ctid + " is NOT found!";
		return msg;
	}
}
