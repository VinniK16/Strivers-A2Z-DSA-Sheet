/*

Problem: Given an array nums of size n which may contain duplicate elements, return a list of pairs where each pair contains a 
         unique element from the array and its frequency in the array.
         
         You may return the result in any order, but each element must appear exactly once in the output.

Link: https://takeuforward.org/plus/dsa/problems/counting-frequencies-of-array-elements

*/

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int i = 0;

        for(int key : map.keySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(key);
            pair.add(map.get(key));
            res.add(pair);
        }

        return res;
    }
}