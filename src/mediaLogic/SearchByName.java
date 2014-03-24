/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediaLogic;

import interfaces.FileInterface;
import interfaces.FilterInterface;

/**
 *
 * @author dekez
 */
public class SearchByName implements FilterInterface<FileInterface>{
    private String searchCriteria;
    
    public SearchByName(String name){
        searchCriteria = name.toLowerCase();
    }
    
    @Override
    public boolean accept(FileInterface e) {
        return e.getName() != null && searchCriteria.equals(e.getName().toLowerCase());

    }


    
}
