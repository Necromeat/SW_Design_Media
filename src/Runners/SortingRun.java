/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Runners;

import java.util.Date;
import mediaLogic.Sorting;

/**
 *
 * @author Andrew
 */
public class SortingRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sort by date");
        runDatesort();
           System.out.println("Sort by Length");
        runSortByLength();
           System.out.println("Sort by Apla");
        runAlphasort();
    }
    
    public static void runAlphasort(){
         String[] e ={"Abe","Cocking","Def","Ac","Ele","an","Zebra","Lion","Giraf","Cockington"};
        Sorting sort = new Sorting();
        e=(String[])sort.sortByAlphabet(e);
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
    
    public static void runDatesort(){
        Date date1 = new Date(2013, 11, 12);
        Date date2 = new Date(2013, 8, 12);
        Date date3 = new Date(2013, 10, 12);
        
         Date[] e = new Date[3];
         e[0]=date1;
         e[1]=date2;
         e[2]=date3;
        Sorting sort = new Sorting();
        e=(Date[])sort.sortByAlphabet(e);
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
    
    public static void runSortByLength(){
        Integer[] e ={1,5,6,2,8,90,120,42};
        Sorting sort = new Sorting();
        e=(Integer[])sort.sortByLength(e);
        for (int i = 0; i < e.length; i++) {
            System.out.println(""+e[i]);
        }
    }
}
