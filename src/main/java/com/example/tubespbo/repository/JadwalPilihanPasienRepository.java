package com.example.tubespbo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tubespbo.model.JadwalPilihanPasien;

public interface JadwalPilihanPasienRepository extends JpaRepository<JadwalPilihanPasien, Integer> {

    JadwalPilihanPasien findByEmailPasien(String email);

    JadwalPilihanPasien findById(int id);

}
