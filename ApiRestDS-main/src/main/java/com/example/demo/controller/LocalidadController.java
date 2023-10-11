package com.example.demo.controller;

import com.example.demo.entities.Localidad;
import com.example.demo.services.LocalidadServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")

public  class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
