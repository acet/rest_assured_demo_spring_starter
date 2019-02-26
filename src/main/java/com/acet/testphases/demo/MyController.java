package com.acet.testphases.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class MyController {

  @GetMapping
  public int getAllProfiles(@RequestParam("first") int first, @RequestParam("second") int second) {
    return first + second;
  }
}
