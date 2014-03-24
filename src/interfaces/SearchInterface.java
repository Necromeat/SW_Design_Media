/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.util.Iterator;



/**
 *
 * @author Andrew
 */
public interface SearchInterface<E> {
    
    public Iterable<E> search(FilterInterface<E> filter, Iterable<E> iterable);
    public Iterator<E> search(FilterInterface<E> filter, Iterator<E> iterator);
    
}
