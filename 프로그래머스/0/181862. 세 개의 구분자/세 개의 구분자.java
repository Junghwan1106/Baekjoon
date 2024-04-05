import java.util.*;

class Solution {
    public List solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for(int i = 0 ; i < myStr.length(); i++){
            char value = myStr.charAt(i);
            
            if(value == 'a' || value == 'b' || value == 'c'){
                if(temp != ""){
                    list.add(temp);
                    temp = "";
                }
            } else {
                temp += value;
            }
        }
        if(temp != ""){
            list.add(temp);
            temp = "";
        }
        
        if(list.size() == 0) list.add("EMPTY");
        return list;
    }
}