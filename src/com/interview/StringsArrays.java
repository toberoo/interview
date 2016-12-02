package com.interview;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;

public class StringsArrays {

    public boolean isUnique(String s) {
        HashSet<Character> characters = new HashSet<>();
        for (char a: s.toCharArray()) {
            if (characters.contains(a))
                return false
            characters.add(a);
        }
        return true;
    }

    public boolean isUniqueNoHash(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false
            }
        }
        return false;
    }

    public boolean isPermutation(String s1, String s2) {
        HashMap<Character, Integer> characters =  new HashMap<>();
        for (char a: s1.toCharArray()) {
            characters.putIfAbsent(a, 0);
            characters.put(a, characters.get(a) + 1);
        }

        for (char a: s2.toCharArray()) {
            Integer i = characters.get(a);
            if (i == null)
                return false;
            i = i - 1;
            if (i == 0) {
                characters.remove(a);
            }
            else characters.put(a, i);
        }

        return characters.isEmpty();
    }

    public String urlify(char[] chars) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                s.append("%20");
            else
                s.append(chars[i]);

        }
        return s.toString();
    }

    public boolean palindromepermutation(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (char a: s.toCharArray()) {
            chars.putIfAbsent(a, 0);
            chars.put(a, chars.get(a) + 1);
        }
        //We have to have all evens and one odd.
        int odds = 0;
        for (Character c: chars.keySet()) {
            if (chars.get(c) % 2 != 0)
                odds++;
            if (odds > 1)
                return false;
        }
        return true;
    }

    public boolean oneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            
        }
    }
}
