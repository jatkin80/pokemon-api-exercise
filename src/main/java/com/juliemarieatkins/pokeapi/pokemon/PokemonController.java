package com.juliemarieatkins.pokeapi.pokemon;

import com.juliemarieatkins.pokeapi.exception.ResourceNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/pokemon")
public class PokemonController {

  @Autowired
  private PokemonService pokemonService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Pokemon>> list() {
    Iterable<Pokemon> pokePeople = pokemonService.list();
    return createHashPlural(pokePeople);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Pokemon> read(@PathVariable Long id) {
    Pokemon pokemon = pokemonService
      .findById(id)
      .orElseThrow(
        () -> new ResourceNotFoundException("No Pokemon with that ID")
      );
    return createHashSingular(pokemon);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Pokemon> create(@Validated @RequestBody Pokemon pokemon) {
    Pokemon createdPokemon = pokemonService.create(pokemon);
    return createHashSingular(createdPokemon);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Pokemon> update(
    @RequestBody Pokemon pokemon,
    @PathVariable Long id
  ) {
    Pokemon updatedPokemon = pokemonService
      .update(pokemon)
      .orElseThrow(
        () -> new ResourceNotFoundException("No Pokemon with that ID")
      );

    return createHashSingular(pokemon);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    pokemonService.deleteById(id);
  }

  private Map<String, Pokemon> createHashSingular(Pokemon pokemon) {
    Map<String, Pokemon> response = new HashMap<String, Pokemon>();
    response.put("pokemon", pokemon);

    return response;
  }

  private Map<String, Iterable<Pokemon>> createHashPlural(
    Iterable<Pokemon> pokePeople
  ) {
    Map<String, Iterable<Pokemon>> response = new HashMap<String, Iterable<Pokemon>>();
    response.put("pokePeople", pokePeople);

    return response;
  }
}
