package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;


@Component
public class specimenServiceStub  implements ISpecimenService{


@Override
public void save(SpecimenDTO specimentDTO) {
	// TODO Auto-generated method stub
	
}


@Override
public SpecimenDTO fetchBy(int id) {
	SpecimenDTO specimenDTO = new SpecimenDTO();
	specimenDTO.setSpecimenID(43);
	specimenDTO.setLongit("40.75");
			specimenDTO.setLat("60.65");
			specimenDTO.setDesc("This is a plant");
			return specimenDTO;
}

}
