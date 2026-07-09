package com.example.kuberhpa;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;


@RestController
@RequestMapping("/kuber")
@CrossOrigin

public class KuberhpaController {

  @RequestMapping(value = "/hpatest", method = RequestMethod.GET)
  public String generateStress() throws IOException, InterruptedException {

    new MyThread().start();
    new MyThread().start();
    new MyThread().start();
    new MyThread().start();
    new MyThread().start();
    new MyThread().start();

    return " Hello!->6 threads launched!";

    // Test url: http://localhost:9001/kuber/hpatest
  }

}

class MyThread extends Thread {

  @Override
  public void run() {

    while (true) {

    }
  }
}