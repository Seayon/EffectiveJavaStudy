package com.seayon.javabase.chapter09;

import net.sf.cglib.core.CollectionUtils;

import java.util.*;

public class HashMapTest {
    public static final Map<String, String> STRING_STRING_HASH_MAP = new HashMap<>();

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.merge("1", "2", String::concat);
        map.merge("1", "3", String::concat);
        String s = map.get("1");
        System.out.println("s = " + s);
        STRING_STRING_HASH_MAP.put("2", "2");
        STRING_STRING_HASH_MAP.put("1", "new1");
//        STRING_STRING_HASH_MAP = new HashMap<>();
        System.out.println("map = " + STRING_STRING_HASH_MAP);

    }
}
