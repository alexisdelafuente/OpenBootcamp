package com.example.ejercicios_Tema_6_DeLaFuente.repositories;

import com.example.ejercicios_Tema_6_DeLaFuente.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
