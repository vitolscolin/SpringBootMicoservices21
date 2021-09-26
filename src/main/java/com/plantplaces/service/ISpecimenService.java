package com.plantplaces.service;
import com.plantplaces.dto.SpecimenDTO;


public interface ISpecimenService {
	SpecimenDTO fetchBy(int id, String longit, String lat, String desc);
	void save (SpecimenDTO specimentDTO);
}
