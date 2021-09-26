package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class specimenServiceStub implements ISpecimenService {

	@Override
	public void save(SpecimenDTO specimentDTO) {
		// TODO 

	}

	@Override
	public SpecimenDTO fetchBy(int id, String longit, String lat, String desc) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(id);
		specimenDTO.setLongit(longit);
		specimenDTO.setLat(lat);
		specimenDTO.setDesc(desc);
		return specimenDTO;
	}

}
