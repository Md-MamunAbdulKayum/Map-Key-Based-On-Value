/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.mapkeybasedonvalue;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Mamun
 */
public class MapKeyBasedOnValue {
    
   static Map<String, String> nameMap = new HashMap();
    
    public static void main(String[] args) {
        // prepare the map
        for (int i = 1; i <= 10; i++) {
            nameMap.put("name"+i, "New Name"+i);
        }
        
        // find the key according to a value
     String valueAccorTOKey = findKey(nameMap, "New Name1");
        System.out.println("Value According TO Key: "+valueAccorTOKey);
    }
    
/**
 * returns matched key according to a value
 * @param nameMap
 * @param value
 * @return 
 */
    public static String findKey(Map nameMap, String value){
    
             SortedSet<String> keys = new TreeSet<>(nameMap.keySet());
                    
                    // find hashmap key according to value
                    for (Object key : keys) {
                        if (nameMap.get(key).equals(value)) {
                           return  key.toString();
                        }
                    }
                    return null;
    }

}
