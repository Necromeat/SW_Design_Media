/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediaLogic;

import interfaces.FilterInterface;
import interfaces.SearchInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author dekez
 */
public class Search<E> implements SearchInterface<E>{

    @Override
    public Iterable<E> search(FilterInterface<E> filter, Iterable<E> input) {
        Collection<E> results = new ArrayList<>();
        for(E e : input){
            if(filter.accept(e))
                results.add(e);
        }
        
        return results;
    }

    @Override
    public Iterator<E> search(FilterInterface<E> filter, Iterator<E> iterator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private class SearchIterable {
        
    }
    
    private class SearchIterator {
        
    }
    
    
}
