package com.example.demo.controler;

import com.example.demo.modo.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Homecontroller {

    @Autowired
    private  ProdutoRepository produtoRepository;



    @GetMapping("/")
    public String gethome (Model model){

        List<Produto> lista = produtoRepository.findAll();

         model.addAttribute("lista", lista);
        return "home";

    }
}
