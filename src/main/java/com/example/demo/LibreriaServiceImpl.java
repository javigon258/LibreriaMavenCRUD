package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class LibreriaServiceImpl implements LibreriaService{

    @Autowired
    private LibreriaRepo repositorio;
    
	@Override
	public List<Libreria> mostrar() {
	      return repositorio.findAll();
	    }

	@Override
	public Libreria mostrarId(int id) {
		// TODO Auto-generated method stub
		return repositorio.findOne(id);
	}

	@Override
	public Libreria add(Libreria l) {
		return repositorio.save(l);
	}

	@Override
	public Libreria edit(Libreria l) {
		// TODO Auto-generated method stub
		return repositorio.save(l);
	}

	public Libreria delete(int idL) {
		// TODO Auto-generated method stub
		Libreria lib = repositorio.findOne(idL);
		if(lib!= null) {
			repositorio.delete(lib);
		}
		return lib;
	}

}
