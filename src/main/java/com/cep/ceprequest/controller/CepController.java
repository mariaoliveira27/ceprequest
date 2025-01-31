package com.cep.ceprequest.controller;

import com.cep.ceprequest.dto.CepResponse; 
import com.cep.ceprequest.service.CepService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {
    
    private final CepService cepService;

    public CepController(CepService cepService){
        this.cepService = cepService;
    }

    @GetMapping("/{cep}")
    public CepResponse buscarEnderecoPorCep(@PathVariable String cep){
        return cepService.buscarEnderecoPorCep(cep);
    }
}
