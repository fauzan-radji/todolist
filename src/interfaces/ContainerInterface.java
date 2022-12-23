/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Container;

/**
 *
 * @author fauzan-radji
 */
public interface ContainerInterface {
    public Container insert(Container container);
    public Container update(String id, Container container);
    public Container read(String id);
    public Container delete(String id);
    public Container getById(String id);
    public List<Container> getAll();
}
