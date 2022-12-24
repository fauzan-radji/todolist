/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import interfaces.TodoInterface;
import java.util.ArrayList;
import java.util.List;
import models.Todo;

/**
 *
 * @author fauzan-radji
 */
public class TodoController implements TodoInterface {

  private ObjectContainer db;
  private ContainerController containerController;

  public TodoController(ObjectContainer db) {
    this.db = db;
    this.containerController = new ContainerController(db);
  }

  @Override
  public Todo insert(Todo todo) {
    db.store(todo);

    return todo;
  }

  @Override
  public Todo update(String id, Todo todo) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Todo read(String id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Todo delete(String id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Todo getById(String id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public List<Todo> getAll() {
    List<Todo> lTodos = null;
    ObjectSet results = db.queryByExample(new Todo());

    if (results.hasNext()) {
      lTodos = new ArrayList<>();

      for (Object result : results) lTodos.add((Todo) result);
    }

    return lTodos;
  }

  @Override
  public List<Todo> getByContainerId(String id) {
    // TODO Auto-generated method stub
    List<Todo> lTodos = null;
    Query query = db.query();
    query.constrain(Todo.class);
    query.descend("container").constrain(containerController.getById(id));
    ObjectSet results = query.execute();
    if (results.hasNext()) {
      lTodos = new ArrayList<>();

      for (Object result : results) lTodos.add((Todo) result);
    }
    return lTodos;
  }
}
