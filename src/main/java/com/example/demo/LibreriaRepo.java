package com.example.demo;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface LibreriaRepo extends Repository<Libreria, Integer> {
    List<Libreria>findAll();
    Libreria findOne(int id);
    Libreria save(Libreria l);
    void delete(Libreria l);
}
