/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.castgroup.teste.controller;

import br.castgroup.teste.model.Pessoa;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author fernando.j.junior
 */
@Controller
public class HomeController {
    
    
    @RequestMapping(value = "/cadastroPessoa", method = RequestMethod.GET)
    public String index() {
        
        return "cadastroPessoa";
    }
    

}