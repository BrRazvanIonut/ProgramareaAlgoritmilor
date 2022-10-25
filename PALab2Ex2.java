/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pa.lab2ex2;

import java.util.Hashtable;

/**
 *
 * @author Razvan
 */
public class PALab2Ex2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Hashtable<String, Boolean> prezenteazi = new Hashtable<String, Boolean>(); 

        prezenteazi.put("George", false);
        prezenteazi.put("Luca", false);
        prezenteazi.put("Mihai", true);
 
        System.out.println("Mappings of prezenteazi : " + prezenteazi);
    }
}
