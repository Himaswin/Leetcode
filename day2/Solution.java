package day2;

import java.util.HashMap;

class Solution {
    public static boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> char_count = new HashMap<>();
    
            for(char c : s.toCharArray()){
                char_count.put(c, char_count.getOrDefault(c,0)+1);
            }
            for(char c : t.toCharArray()){
                char_count.put(c, char_count.getOrDefault(c,0)-1);
            }
            for(int i: char_count.values()){
                if(i != 0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            String s1 = "geeks";
            String s2 = "kseeg";
            System.out.println(isAnagram(s1, s2));
    }
    }
    //learning outcomes
    // how to declare an hashmap
    // HashMap<Character, Integer> char_count = new HashMap<>();
    //to get values char_count.values()
    //char_count.put() to insert into the hasmap
    //put(a,b) a is character and b is value
    //char_count.put(c, char_count.getOrDefault(c,0)+1) so put the value inside the hashmap and use c when there is already c inside or default it to 0 +1 indicates the increament

