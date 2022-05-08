package com.example.viladevinhouse.security.service;

import com.example.viladevinhouse.security.DTO.HabitantesDTO;
import com.example.viladevinhouse.security.model.Habitante;
import com.example.viladevinhouse.security.repository.HabitantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitantesService {

    @Autowired
    private HabitantesRepository habitantesRepository;

    public HabitantesService (HabitantesRepository habitantesRepository) {
        this.habitantesRepository = habitantesRepository;
    }

    public Habitante cadhabitante(Habitante habitantes) {
        return habitantesRepository.save(habitantes);
    }

    public List<HabitantesDTO> listarHabitantes() {
        return null;
    }
}
