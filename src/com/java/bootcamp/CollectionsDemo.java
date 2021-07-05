package com.java.bootcamp;

import java.util.*;

public class CollectionsDemo {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);



        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.contains(1));
        System.out.println(list1.addAll(Arrays.asList(6,7,8,9)));

        List list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

//        System.out.println(list2);



        /*
        difference between linked list and array List
        * **/

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

//        set= new LinkedHashSet<>();
//        set= new TreeSet<>();



        Map<String,Object> map = new HashMap();

        map.put("name","Shinji");
        map.put("age",28);

        System.out.println(map);
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        map.put("name","Pulkit");
        System.out.println(map);

//        map = new TreeMap<>();
//        map = new LinkedHashMap<>();




    }
}
