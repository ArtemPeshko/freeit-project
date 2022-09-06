package com.freeit.lesson15.colls;

import java.util.*;

/**
 * Created by Artem Peshko on 28.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class IteratorsEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
            set.add(i + 1);
            map.put(i + 1, i + 1);
        }
        System.out.println(set);
        System.out.println(map);

//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                list.remove(i);
//            }
//        }

//        list.forEach(value -> {
//            if (value % 2 == 0) {
//                list.remove(value);
//            }
//        });

//        System.out.println(list);

//        list.removeIf(next -> next % 2 == 0);

//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }


        Set<Integer> keys = map.keySet();
        Iterator<Integer> keysIterator = keys.iterator();
        while (keysIterator.hasNext()) {
            Integer key = keysIterator.next();
            System.out.print(key);
            System.out.println(map.get(key));
        }


        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
