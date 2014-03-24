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
public interface SearchInterface<E> {
    public E searchByName(String name, Collection folders);
    public E searchByDate(String date, Collection folders);
    public E searchBySize(E size, Collection folders);
    public E searchByLength(E e, Collection folders);
    
}
