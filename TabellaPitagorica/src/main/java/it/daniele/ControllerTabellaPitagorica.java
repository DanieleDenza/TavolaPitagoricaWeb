package it.daniele;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTabellaPitagorica {
	private Prova1 p = new Prova1();
	@RequestMapping("/")
	
	public String CIAO(Map<String, Object> model) {

		model.put("Tabella", this.p);


		return "helloWorld";
	}
}