/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import interfaces.FileInterface;
import interfaces.FilterInterface;
import interfaces.SearchInterface;
import java.util.ArrayList;
import java.util.Collection;
import mediaLogic.File;
import mediaLogic.Search;
import mediaLogic.SearchByName;

/**
 *
 * @author dekez
 */
public class SearchTest {
    public static void main(String[] args){
        SearchInterface<FileInterface> search = new Search<>();
        FilterInterface<FileInterface> filter = new SearchByName("lol");
        ArrayList<FileInterface> files = new ArrayList();
        
        files.add(new File("Lol"));
        files.add(new File("totallol"));
        files.add(new File("MAWR"));
        files.add(new File("mawr"));
        
        
        
        Iterable<FileInterface> result = search.search(filter, files);
        
        for(FileInterface file : result){
            System.out.println(file.getName());
        }
    }
}
