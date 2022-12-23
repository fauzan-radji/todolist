/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 *
 * @author fauzan-radji
 */
public class DB {
    private String name;
    private ObjectContainer db;
    
    public DB(String name) {
        this.name = name;
        this.db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                name
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
