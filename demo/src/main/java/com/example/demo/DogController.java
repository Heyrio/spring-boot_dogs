package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
class DogController {

  private final DogRepository repository;

  DogController(DogRepository repository) {
    this.repository = repository;
  }

  // Aggregate root

  @GetMapping("/dogs")
  List<Dog> all() {
    return repository.findAll();
  }

  @PostMapping("/dogs")
  Dog newDog(@RequestBody Dog newDog) {
    return repository.save(newDog);
  }

  // Single item

  // @GetMapping("/dogs/{id}")
  // Dog one(@PathVariable Long id) {

  //   return repository.findById(id).orElseThrow();
  // }

  // @PutMapping("/dogs/{id}")
  // Dog replaceDog(@RequestBody Dog newDog, @PathVariable Long id) {

  //   return repository.findById(id)
  //     .map(dog -> {
  //       dog.setName(newDog.getName());
  //       return repository.save(dog);
  //     })
  //     .orElseGet(() -> {
  //       newDog.setId(id);
  //       return repository.save(newDog);
  //     });
  // }

  // @DeleteMapping("/dogs/{id}")
  // void deleteDog(@PathVariable Long id) {
  //   repository.deleteById(id);
  // }
}