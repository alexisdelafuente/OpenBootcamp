package com.example.ejercicios_Tema_6_DeLaFuente.controller;
import com.example.ejercicios_Tema_6_DeLaFuente.entities.Laptop;
import com.example.ejercicios_Tema_6_DeLaFuente.repositories.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

    public LaptopController (LaptopRepository laptopRepository){
    this.laptopRepository=laptopRepository;
    }

    //ver el Listado de Laptos
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //Buscar una Laptop
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> LaptopController(@PathVariable Long id){
        Optional<Laptop> laptopOpt= laptopRepository.findById(id);

        if(laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();
    }

    //Recibir un nuevo modelo de Laptop
    @PostMapping("/api/laptops")
    public Laptop create (@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
        return laptopRepository.save(laptop);
    }

}
