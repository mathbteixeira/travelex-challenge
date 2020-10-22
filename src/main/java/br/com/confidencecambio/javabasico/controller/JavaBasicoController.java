package br.com.confidencecambio.javabasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.JavaBasicoService;

@RestController
@RequestMapping("/api/imc")
public class JavaBasicoController {
	@Autowired
    private JavaBasicoService service;
    
    @GetMapping("/calcular")
	@ResponseBody
	public Double calculaImc(@RequestParam(name="peso") String peso, @RequestParam(name="altura") String altura) {
		return service.calculaImc(Double.parseDouble(peso), Double.parseDouble(altura));
	}
}
