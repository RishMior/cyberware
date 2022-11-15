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

import com.cituccs.cyberaware.entity.UserGuideEntity;
import com.cituccs.cyberaware.service.UserGuideService;

@RestController
@RequestMapping("/userguide")

public class UserGuideController {

	@Autowired
	UserGuideService ugserv;
	
	@PostMapping("/postGuide")
	public UserGuideEntity insertThreat(@RequestBody UserGuideEntity userg) {
		return ugserv.insertThreat(userg);
	}
	
	@GetMapping("/getAllGuides")
	public List<UserGuideEntity> getAllGuides(){
		return ugserv.getAllGuides();
	}
	
	@GetMapping("/getByGuide")
	public UserGuideEntity findByGuide(@RequestParam String guide) {
		return ugserv.findByGuide(guide);
	}
	
	@PutMapping("/putGuide")
	public UserGuideEntity putGuide(@RequestParam int ugid, @RequestBody UserGuideEntity newGuideDetails) throws Exception{
		return ugserv.putGuide(ugid,newGuideDetails);
	}
	
	@DeleteMapping("/deleteGuide/{ugid}")
	public String deleteGuide(@PathVariable int ugid) {
		return ugserv.deleteGuide(ugid);
	}	
}
