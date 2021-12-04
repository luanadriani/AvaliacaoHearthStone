package com.hearthstone.HearthStone.controller;

import com.hearthstone.HearthStone.exception.BadRequestException;
import com.hearthstone.HearthStone.model.Carta;
import com.hearthstone.HearthStone.model.ClasseCarta;
import com.hearthstone.HearthStone.model.TipoCarta;
import com.hearthstone.HearthStone.service.CartaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("carta")
public class CartaController {
    CartaService cartaService = new CartaService();

    @GetMapping
    public ResponseEntity<List<Carta>> list(){
        return ResponseEntity.ok(cartaService.listAll());
    }

    @GetMapping(path = ("/{id}"))
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
    public ResponseEntity<Carta> save(@RequestBody Carta carta){
        return new ResponseEntity<>(cartaService.save(carta), HttpStatus.CREATED);
    }

    @DeleteMapping(path = ("/{id}"))
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        cartaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
