package com.luis.spring.holamundo.spring_primer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luis.spring.holamundo.spring_primer.models.Empleados;


@Controller
public class EjemploController {
@GetMapping("/detalles_info23218312")


public String info (Model model) {
     Empleados empleados1 = new Empleados("Luis", "De Avila", "Calle 123", "Desarrollador", 
     22, 123456789, 1);

     model.addAttribute("empleados", empleados1);
     
     return "detalles_info";
}
}
