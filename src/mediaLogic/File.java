/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediaLogic;

import interfaces.FileInterface;
import java.util.Date;

/**
 *
 * @author dekez
 */
public class File implements FileInterface{
    private String name;
    private String extension;
    private Date date;
    private int length;
    private float size;
    
    public File(){
        
    }
    
    public File(String name){
        this.name = name;
    }
    

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getExtension() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
