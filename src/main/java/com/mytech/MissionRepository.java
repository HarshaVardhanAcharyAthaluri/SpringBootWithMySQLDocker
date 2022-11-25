package com.mytech;

import org.springframework.data.repository.CrudRepository;

public interface MissionRepository extends CrudRepository<Mission, Integer>{

	public Mission findByMissionName(String missionName);
	
}
