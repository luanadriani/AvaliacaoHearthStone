package com.hearthstone.HearthStone.controller;

import com.hearthstone.HearthStone.model.Carta;
import com.hearthstone.HearthStone.request.CartaPostRequestBody;
import com.hearthstone.HearthStone.service.CartaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("carta")
public class CartaController {
    CartaService cartaService = new CartaService();

    @GetMapping
    public ResponseEntity<List<Carta>> list(){
        return ResponseEntity.ok(cartaService.listAll());
    }

    @GetMapping(path = "/id/{id}")
    public ResponseEntity<Carta> findById(@PathVariable Integer id){
        return ResponseEntity.ok(cartaService.findById(id));
    }

    @GetMapping(path = ("/nome/{nome}"))
    public ResponseEntity<List<Carta>> findByName(@PathVariable String nome){
        return ResponseEntity.ok(cartaService.findByNome(nome));
    }

    @GetMapping(path = ("/classe/{classe}"))
    public ResponseEntity<List<Carta>> findByClasse(@PathVariable String classe){
        return ResponseEntity.ok(cartaService.findByClasse(classe));
    }

    @GetMapping(path = ("/tipo/{tipo}"))
    public ResponseEntity<List<Carta>> findByTipo(@PathVariable String tipo){
        return ResponseEntity.ok(cartaService.findByTipo(tipo));
    }

    @PostMapping
    public ResponseEntity<Carta> save(@RequestBody @Valid CartaPostRequestBody cartaPostRequestBody){
        return new ResponseEntity<>(cartaService.save(cartaPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = ("/{id}"))
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        cartaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
