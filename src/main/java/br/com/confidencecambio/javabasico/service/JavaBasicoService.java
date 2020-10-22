package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class JavaBasicoService {
    
    public Double calculaImc(Double peso, Double altura) {
    	return peso / (altura * altura);
    }
}
