package com.example.viladevinhouse.security.service;

import com.example.viladevinhouse.security.DTO.VilaDTO;
import com.example.viladevinhouse.security.model.Vila;
import com.example.viladevinhouse.security.repository.VilaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilaServices {

    @Autowired
    private VilaRepository vilaRepository;

    public VilaServices(VilaRepository vilaRepository) {
        this.vilaRepository = vilaRepository;
    }

    public Vila cadastrar(Vila vila) {
        return vilaRepository.save(vila);
    }

    public List<VilaDTO> listarVilas() {
        return null;
    }
}
