/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import interfaces.ContainerInterface;
import java.util.ArrayList;
import java.util.List;
import models.Container;

/**
 *
 * @author fauzan-radji
 */
public class ContainerController implements ContainerInterface {

  private ObjectContainer db;

  public ContainerController(ObjectContainer db) {
    this.db = db;
  }

  @Override
  public Container insert(Container container) {
    db.store(container);

    return container;
  }

  @Override
  public Container update(String id, Container container) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Container read(String id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Container delete(String id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Container getById(String id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public List<Container> getAll() {
    List<Container> containers = null;
    ObjectSet results = db.queryByExample(new Container());
    if (results.hasNext()) {
      containers = new ArrayList<>();

      for (Object result : results) containers.add((Container) result);
    }

    return containers;
  }
}
