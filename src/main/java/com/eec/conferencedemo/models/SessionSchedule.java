package com.eec.conferencedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name ="session_schedule")
public class SessionSchedule {
  @Id
  @GeneratedValue
  private Long schedule_id;
  private Long time_slot_id;
  private Long session_id;
  private String room;

  public SessionSchedule() {
  }

  public Long getSchedule_id() {
    return schedule_id;
  }

  public void setSchedule_id(Long schedule_id) {
    this.schedule_id = schedule_id;
  }

  public Long getTime_slot_id() {
    return time_slot_id;
  }

  public void setTime_slot_id(Long time_slot_id) {
    this.time_slot_id = time_slot_id;
  }

  public Long getSession_id() {
    return session_id;
  }

  public void setSession_id(Long session_id) {
    this.session_id = session_id;
  }

  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }
}
