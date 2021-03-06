package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

/**
 * Handle the start endpoint
 * 
 * @return
 *
 */
@Controller
public class PlantPlacesController {

	@Autowired
	private ISpecimenService specimenServiceStub;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchBy(43, "60.65", "40.75", "Fringe Flower");
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}

	/**
	 * Handle the / endpoint
	 * 
	 * @return
	 *
	 */

	@PostMapping("/")
	public String create() {

		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = { "loyalty=silver" })
	public ModelAndView index() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchBy(45, "165.56", "20.89", "Pipevine");
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("start");
		modelview.addObject("specimenDTO", specimenDTO);
		return modelview;
	}
}
