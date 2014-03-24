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
public interface SortingInterface<E> {
    
    public < E extends Comparable<E> >E[] sortByAlphabet(E[] e);
    public < E extends Comparable<E> >E[] sortByDate(E[] e);
    public < E extends Comparable<E> >E[] sortBySize(E[] e);
    public < E extends Comparable<E> > E[] sortByLength(E[] e);
    
    
}
