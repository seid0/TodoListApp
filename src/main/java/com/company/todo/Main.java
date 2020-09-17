/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.todo;

import com.company.dao.TaskListInter;
import com.company.impl.TaskListImpl;

/**
 *
 * @author Seid
 */
public class Main {
    public static void main(String[] args) throws Exception{
        TaskListInter taskList = new TaskListImpl();
        taskList.removeTask(1);
    } 
}
