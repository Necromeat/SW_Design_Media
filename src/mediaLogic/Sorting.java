/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediaLogic;


/**
 *
 * @author Andrew
 */
public class Sorting<E> implements interfaces.SortingInterface<E>{

    @Override
    public < E extends Comparable<E> > E[] sortByAlphabet(E[] e) {
        E[] es = null; 
       return es =(E[])sortSmallerThan(e);
    
    }

    @Override
    public< E extends Comparable<E> > E[] sortByDate(E[] e) {
     E[] es = null; 
       return es =(E[])sortSmallerThan(e); 
    }

    @Override
    public< E extends Comparable<E> > E[] sortBySize(E[] e) {
     E[] es = null; 
       return es =(E[])sortSmallerThan(e);
    }

    

    @Override
    public <E extends Comparable<E>> E[] sortByLength(E[] e) {
       E[] es = null; 
       return es =(E[])sortSmallerThan(e);
    }
    
    <E extends Comparable<E>> E[] sortSmallerThan(E[] e){
         E[] es; 
        if(e.length >0){
           es = e;
        }else{
            return e;
        }
      int min;
        int current;
        E temp;

        for (int i = 0; i < es.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < es.length; j++) {
                current = j;
                if (es[min].compareTo(e[current]) < 0) {
                    min = current;

                }

                temp = es[min];
                es[min] = es[current];
               es[current] = temp;
                
            }

        }
        
        return es;
    }
    
    <E extends Comparable<E>> E[] sortLargerThan(E[] e){
         E[] es; 
        if(e.length >0){
           es = e;
        }else{
            return e;
        }
      int min;
        int current;
        E temp;

        for (int i = 0; i < es.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < es.length; j++) {
                current = j;
                if (es[min].compareTo(e[current]) > 0) {
                    min = current;

                }

                temp = es[min];
                es[min] = es[current];
               es[current] = temp;
                
            }

        }
        
        return es;
    }
    
    <E extends Comparable<E>> E[] sortEqualTo(E[] e){
         E[] es; 
        if(e.length >0){
           es = e;
        }else{
            return e;
        }
      int min;
        int current;
        E temp;

        for (int i = 0; i < es.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < es.length; j++) {
                current = j;
                if (es[min].compareTo(e[current]) == 0) {
                    min = current;

                }

                temp = es[min];
                es[min] = es[current];
               es[current] = temp;
                
            }

        }
        
        return es;
    }
}
