package com.mcy.controller;

import com.mcy.model.Person;
import com.mcy.service.DataGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Index {

  private DataGenerator dataGenerator;
  private ObjectMapper objectMapper;

  public Index(DataGenerator dataGenerator) {
    this.dataGenerator = dataGenerator;
    this.objectMapper = new ObjectMapper();
  }

  @GetMapping("/v1/Names")
  public ResponseEntity<List<String>> getRandomNames() {
    return ResponseEntity.ok(dataGenerator.generateRandomNames());
  }

  @GetMapping("/v1/Person")
  public ResponseEntity<Person> getRandomPerson() throws JsonProcessingException {

    return ResponseEntity.ok(
        objectMapper.readValue(dataGenerator.generateRandomPerson(), Person.class));
  }
}
