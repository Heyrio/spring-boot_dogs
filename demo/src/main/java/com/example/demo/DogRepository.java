package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

interface DogRepository extends MongoRepository<Dog, String> {
    
}