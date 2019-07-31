package com.purchaseOrders.services;

import com.purchaseOrders.model.Training;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingService {
  @Resource(name="trainingData")
  private List<Training> training;

  @GetMapping
  public List<Training> allTraining() {
    return training;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public String addTraining(@RequestBody Training newData) {
    training.add(newData);
    return "Training data has been added";
  }
}
