package com.brunel.climate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunel.climate.model.Fields;


public interface RegistrationRepository extends JpaRepository<Fields, Long> {
}