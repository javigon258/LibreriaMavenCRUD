package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/librerias"})
public class Controlador {
    @Autowired
    LibreriaService service;
    
    @GetMapping
    public List<Libreria>mostrar(){
        return service.mostrar();
    }
    
    @PostMapping
    public Libreria anadir(@RequestBody Libreria l) {
		return service.add(l);
    	
    }
    
    @GetMapping(path= {"/{id}"})
    public Libreria mostrarId(@PathVariable ("id") int id) {
		return service.mostrarId(id);   	
    }
    
    @PutMapping(path = {"/{id}"})
    public Libreria editar(@RequestBody Libreria l, @PathVariable("id") int id) {
    	l.setId(id);
    	return service.edit(l);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public Libreria delete(@PathVariable ("id") int id) {
    	return service.delete(id);
    	
    }
    
}
