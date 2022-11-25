package com.mytech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissionController {

	@Autowired
	MissionRepository missionRepository;
	
	@GetMapping("/missions")
	public List<Mission> getAllMissions(){
			return (List<Mission>) missionRepository.findAll();
	}
	
	@GetMapping("/mission/{missionName}")
	public Mission getAllMissions(@PathVariable String missionName){
			return  missionRepository.findByMissionName(missionName);
	}
	
	@PostMapping("/mission")
	public Mission saveMission(@RequestBody Mission mission) {
		return missionRepository.save(mission);
	}
}
