/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.impl;

import com.company.dao.Abstract;
import com.company.dao.TaskListInter;
import com.company.entity.TaskList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Seid
 */
public class TaskListImpl extends Abstract implements TaskListInter {

    @Override
    public List<TaskList> getAll(String task, String date, String done) {
        List<TaskList> result = new ArrayList<>();
        try (Connection c = connect()) {
            String sql = "SELECT * FROM task_list";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean addTask(TaskList t) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into task_list(task,date,done) values(?,?,?)");
            stmt.setString(1, t.getTask());
            stmt.setString(2, t.getDate());
            stmt.setString(3, t.getDone());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updateTask(TaskList t) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update task_list set task=?,date=?,done=?  where id=?");
            stmt.setString(1, t.getTask());
            stmt.setString(2, t.getDate());
            stmt.setString(3, t.getDone());
            stmt.setInt(4, t.getId());
                        

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean removeTask(int id) {
    try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from task_list where id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
