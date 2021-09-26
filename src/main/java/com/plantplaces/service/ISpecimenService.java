package com.plantplaces.service;
import com.plantplaces.dto.SpecimenDTO;


public interface ISpecimenService {
	SpecimenDTO fetchBy(int id);
	void save (SpecimenDTO specimentDTO);

}
