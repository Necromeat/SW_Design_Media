/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.util.Collection;

/**
 *
 * @author Andrew
 */
public interface MediaInterface {
    public void setFoldersForUse(String filePath);
    public Collection getFoldersForUse();
    public void deletePath(String path);
    
    
}
