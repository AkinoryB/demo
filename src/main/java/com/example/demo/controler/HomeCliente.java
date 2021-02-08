package com.example.demo.controler;

import com.example.demo.modo.Cliente;

import com.example.demo.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeCliente{

    @Autowired
    private ClienteRepository clienteRepository;



    @GetMapping("/Cliente")
    public String gethomecliente (Model model){

        List<Cliente> lista = clienteRepository.findAll();


        model.addAttribute("cliente", lista);
        return "homecliente";

    }
}