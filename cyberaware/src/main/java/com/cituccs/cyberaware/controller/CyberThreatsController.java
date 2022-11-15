//Joshua Orbiso BSIT-3

package com.cituccs.cyberaware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.cyberaware.entity.CyberThreatsEntity;
import com.cituccs.cyberaware.service.CyberThreatsService;

@RestController
@RequestMapping("/cyberthreats")

public class CyberThreatsController {
	
	@Autowired
	CyberThreatsService ctserv;
	
	@PostMapping("/postThreat")
	public CyberThreatsEntity insertThreat(@RequestBody CyberThreatsEntity threat) {
		return ctserv.insertThreat(threat);
	}
	
	@GetMapping("/getAllThreats")
	public List<CyberThreatsEntity> getAllThreats(){
		return ctserv.getAllThreats();
	}
	
	@GetMapping("/getByName")
	public CyberThreatsEntity findByName(@RequestParam String name) {
		return ctserv.findByName(name);
	}
	
	@PutMapping("/putThreat")
	public CyberThreatsEntity putThreat(@RequestParam int ctid, @RequestBody CyberThreatsEntity newThreatDetails) throws Exception{
		return ctserv.putThreat(ctid,newThreatDetails);
	}
	
	@DeleteMapping("/deleteThreat/{ctid}")
	public String deleteThreat(@PathVariable int ctid) {
		return ctserv.deleteThreat(ctid);
	}
}