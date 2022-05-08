package com.example.viladevinhouse.controllers;

import com.example.viladevinhouse.security.DTO.HabitantesDTO;
import com.example.viladevinhouse.security.model.Habitante;
import com.example.viladevinhouse.security.service.HabitantesService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/vila/")
public class HabitantesController {

    private HabitantesService service;

    public HabitantesController (HabitantesService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> insert(@RequestBody HabitantesDTO habitantesDTO) {
        var habitantes = new Habitante();
        BeanUtils.copyProperties(habitantesDTO, habitantes);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadhabitante(habitantes));
    }
        // Lista geral de habitantes
        @GetMapping ("/listarHabitantes")
        public List<HabitantesDTO> listaAll( ) {
            return service.listarHabitantes();

    }
}

