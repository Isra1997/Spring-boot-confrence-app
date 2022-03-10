package com.eec.conferencedemo.controllers;

import com.eec.conferencedemo.models.Session;
import com.eec.conferencedemo.repositories.SessionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

  @Autowired
  private SessionRepository sessionRepository;

  @GetMapping
  public List<Session> getSessions(){
    return sessionRepository.findAll();
  }

  @GetMapping
  @RequestMapping("{id}")
  public Session getSession(@PathVariable Long id){
    return sessionRepository.findById(id).get();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public  Session create(@RequestBody final Session session){
    return sessionRepository.saveAndFlush(session);
  }

  @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable Long id){
    sessionRepository.deleteById(id);
  }
}
