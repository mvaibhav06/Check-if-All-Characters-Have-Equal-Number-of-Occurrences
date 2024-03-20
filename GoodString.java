import java.util.HashMap;

public class GoodString {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> temp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(temp.containsKey(ch)){
                temp.put(ch, temp.get(ch)+1);
            }else{
                temp.put(ch,1);
            }
        }
        int counter = temp.get(s.charAt(0));
        for(Character ch: temp.keySet()){
            if(temp.get(ch)!=counter) return false;
        }
        return true;

    }
}
