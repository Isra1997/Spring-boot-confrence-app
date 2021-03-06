package com.eec.conferencedemo.controllers;

import com.eec.conferencedemo.models.Speaker;
import com.eec.conferencedemo.repositories.SpeakerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {
  @Autowired
  private SpeakerRepository speakerRepository;

  @GetMapping
  public List<Speaker> getSpeakers(){
    return speakerRepository.findAll();
  }


  @GetMapping
  @RequestMapping("{id}")
  public Speaker getSpeaker(@PathVariable Long id){
    return speakerRepository.findById(id).get();
  }

  @PostMapping(consumes = {"application/json"})
  @ResponseStatus(HttpStatus.CREATED)
  public Speaker postSpeaker(@RequestBody  final Speaker speaker){
    return  speakerRepository.saveAndFlush(speaker);
  }
}
