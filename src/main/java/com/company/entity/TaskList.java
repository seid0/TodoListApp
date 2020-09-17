/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.entity;

/**
 *
 * @author Seid
 */
public class TaskList {
    private Integer id;
    private String task;
    private String date;
    private String done;

    public TaskList() {
    }

    public TaskList(Integer id, String task, String date, String done) {
        this.id = id;
        this.task = task;
        this.date = date;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "TaskList{" + "id=" + id + ", task=" + task + ", date=" + date + ", done=" + done + '}';
    }
    
    
}
