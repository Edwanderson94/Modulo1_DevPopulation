package com.example.viladevinhouse.security.repository;

import com.example.viladevinhouse.security.model.Habitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitantesRepository extends JpaRepository <Habitante, Long> {

}
