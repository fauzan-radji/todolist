/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Todo;

/**
 *
 * @author fauzan-radji
 */
public interface TodoInterface {
  public Todo insert(Todo container);

  public Todo update(String id, Todo container);

  public Todo read(String id);

  public Todo delete(String id);

  public Todo getById(String id);

  public List<Todo> getAll();

  public List<Todo> getByContainerId(String id);
}
