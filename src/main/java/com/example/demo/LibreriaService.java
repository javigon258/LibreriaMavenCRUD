package com.example.demo;

import java.util.List;

public interface LibreriaService {
    List<Libreria>mostrar();
    Libreria mostrarId(int id);
    Libreria add(Libreria l);
    Libreria edit(Libreria l);
    Libreria delete(int id);
}
