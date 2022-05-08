package com.example.viladevinhouse.controllers;

import com.example.viladevinhouse.security.DTO.VilaDTO;
import com.example.viladevinhouse.security.model.Vila;
import com.example.viladevinhouse.security.service.VilaServices;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vila/", method = RequestMethod.GET)
public class VilaController {

        private VilaServices service;

        public VilaController (VilaServices service) {
            this.service = service;
        }

        @PostMapping("/add")
        public ResponseEntity<Object> insert(@RequestBody VilaDTO vilaDTO) {
            var vila = new Vila();
            BeanUtils.copyProperties(vilaDTO, vila);
            return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrar(vila));
        }
        // Lista geral de Vila
        @GetMapping ("/listarVilas")
        public List<VilaDTO> listaAll( ) {
        return service.listarVilas();
    }
}
