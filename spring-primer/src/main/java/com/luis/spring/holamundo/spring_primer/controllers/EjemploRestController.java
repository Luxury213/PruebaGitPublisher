package com.luis.spring.holamundo.spring_primer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.spring.holamundo.spring_primer.models.dto.dto;




@RestController
@RequestMapping("/api")

public class EjemploRestController {
@GetMapping(path = "/detalles_info2_paramostraraandres")




public dto detalles_info(){

     dto usuario1 = new dto();
     usuario1.setTitulo("Desarrollador");
     usuario1.setUsuario("Luis");


    // Empleados empleados1 = new Empleados("Luis", "De Avila", "Calle 123", "Desarrollador", 
    // 22, 123456789, 1);
     //Map<String , Object> respuesta = new HashMap<>();
     
     //respuesta.put("Empleado", "Datos empleado");
//respuesta.put("Informacion", empleados1);
  return usuario1;
}
}
