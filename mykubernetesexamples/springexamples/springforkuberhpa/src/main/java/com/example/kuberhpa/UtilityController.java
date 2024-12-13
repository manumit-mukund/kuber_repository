package com.example.kuberhpa;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.logging.*;

@RestController
@RequestMapping("/kuber")
@CrossOrigin

public class UtilityController {

  private static final Logger logger = Logger.getLogger(UtilityController.class.getName());

  @RequestMapping(value = "/hpatest", method = RequestMethod.GET)
  public String generateStress() throws IOException, InterruptedException {

    logger.info("HPA test...");

    new CPUSpikerThread().start();
    new CPUSpikerThread().start();
    new CPUSpikerThread().start();
    new CPUSpikerThread().start();
    new CPUSpikerThread().start();
    new CPUSpikerThread().start();

    return " Hello!->6 threads launched!";
  }

}

class CPUSpikerThread extends Thread {

  @Override
  public void run() {

    while (true) {

      // Just looping infinitely
    }
  }
}