class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_count = {}
        

        for c in s:
            char_count[c] = char_count.get(c,0)+1
        for c in t:
            char_count[c] = char_count.get(c,0)-1

        for i in char_count.values():
            if i != 0:
                return False
        return True
    #Learning outcomes
    #declaring hashmap char_count = {}
    #char_count.get(c,0)+1 get default c value and add one 
    