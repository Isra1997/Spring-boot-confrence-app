package com.eec.conferencedemo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @Value("${app.version}")
  String appVersion;

  @GetMapping
  @RequestMapping("/")
  public Map getAppVersion(){
    Map appVersionMap = new HashMap<>();
    appVersionMap.put("app-version",appVersion);
    return  appVersionMap;
  }
}
