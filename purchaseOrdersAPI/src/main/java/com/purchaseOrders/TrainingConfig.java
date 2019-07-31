package com.purchaseOrders;

import com.purchaseOrders.model.Training;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class TrainingConfig {

  @Bean(name="trainingData")
  public List<Training> addingData() {
    List<Training> training = new ArrayList<>();

    Date date = new Date();

    training.add(new Training("Garth", "Instil", "Belfast", "gg@instil.com",
      "02890347292", "078234678923", "www.instil.co.uk", "Grad Academy",
      date, date, "LIT", 0, 12, 100.00, 1200.00,
      "6789098", "Training", 12));

    return training;

  }

}
