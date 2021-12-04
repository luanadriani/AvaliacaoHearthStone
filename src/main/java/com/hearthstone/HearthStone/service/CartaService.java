package com.hearthstone.HearthStone.service;

import com.hearthstone.HearthStone.exception.BadRequestException;
import com.hearthstone.HearthStone.model.Carta;
import com.hearthstone.HearthStone.model.ClasseCarta;
import com.hearthstone.HearthStone.model.TipoCarta;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CartaService {
    private Map<Integer,Carta> cartas = new HashMap<>();

    public List<Carta> listAll() {
        return new ArrayList<>(cartas.values());
    }

    public Carta findById(Integer id) {
        if(cartas.get(id) != null){
            return cartas.get(id);
        }else{
            throw new BadRequestException("Carta não existe");
        }
    }

    public Carta save(Carta carta) {
        carta.setId(cartas.size()+1);
        cartas.put(carta.getId(), carta);
        return cartas.get(carta.getId());
    }

    public void delete(Integer id) {//tratar o exception caso não tenha o item.
        Carta carta = findById(id);
        cartas.remove(carta.getId());
    }

    public List<Carta> findByNome(String nome) {
        return cartas.values().stream().filter(v -> v.getNome().equals(nome)).collect(Collectors.toList());
    }

    public List<Carta> findByClasse(String classe) {
        try {
            ClasseCarta classeCarta = ClasseCarta.valueOf(classe);
            return cartas.values().stream().filter(v -> v.getClasse().equals(classeCarta)).collect(Collectors.toList());
        } catch (IllegalArgumentException  e){
            e.printStackTrace();
            throw new BadRequestException("A Classe selecionada não existe");
        }
    }

    public List<Carta> findByTipo(String tipo) {
        try {
            TipoCarta tipoCarta = TipoCarta.valueOf(tipo);
            return cartas.values().stream().filter(v -> v.getTipo().equals(tipoCarta)).collect(Collectors.toList());
        } catch (IllegalArgumentException  e){
            e.printStackTrace();
            throw new BadRequestException("O tipo selecionado não existe");
        }
    }
}
