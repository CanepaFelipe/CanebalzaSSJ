package com.CanebalzaSSJ.CanebalzaSSJ.controllers;

import java.util.List;



import com.CanebalzaSSJ.CanebalzaSSJ.models.Turno;
import com.CanebalzaSSJ.CanebalzaSSJ.services.TurnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/turnos")
public class TurnosController { 
	@Autowired
	private TurnosRepository repo;
	
	@GetMapping()
	public String showTurnoList(Model model) {
		List<Turno> turnos = repo.findAll();
		model.addAttribute("turnos", turnos);
		return "turnos/index";
	}
}
