/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

/**
 *
 * @author Andrew
 */
public interface SearchInterface<E> {
    public E searchByName(String name);
    public E searchByDate(String date);
    public E searchBySize(E size);
    public E searchByLength(E e);
    
}
