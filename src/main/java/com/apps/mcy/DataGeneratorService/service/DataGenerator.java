package com.apps.mcy.DataGeneratorService.service;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataGenerator {

  private final Faker customFaker;

  public DataGenerator(Faker customFaker) {
    this.customFaker = customFaker;
  }

  public List<String> generateRandomNames() {

    return customFaker
        .<String>collection()
        .suppliers(() -> customFaker.name().fullName())
        .minLen(5)
        .maxLen(200)
        .build()
        .get();
  }

  public String generateRandomPerson() {
    return customFaker.expression(
            "#{json ''first_name'' , ''#{Name.first_name}'' , ''last_name'' , ''#{Name.last_name}'' , 'address' , '#{json ''country''    , ''#{Address.country}'' , ''city'' , ''#{Address.city}''}'}'}"
    );
            //"#{json 'person','#{json ''first_name'',''#{Name.first_name}'',''last_name'',''#{Name.last_name}''}','address','#{json ''country'',''#{Address.country}'',''city'',''#{Address.city}''}'}");
  }
}
