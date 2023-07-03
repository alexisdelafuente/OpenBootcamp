package com.example.ejercicios_Tema_6_DeLaFuente.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer memoriaRam;
    private Integer capacidadDisco;

    public Laptop(){

    }
    public Laptop(Long id, String marca, String modelo, Integer memoriaRam, Integer capacidadDisco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.capacidadDisco = capacidadDisco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Integer getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(Integer capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
}
