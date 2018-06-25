public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M',1000);

        char prev = s.charAt(s.length()-1);
        int sum = map.get(prev);
        for(int i = s.length()-2; i>=0;i--){
            char curr = s.charAt(i);
            int currVal = map.get(curr);

            boolean a = curr=='I' && (prev=='V'||prev=='X');
            boolean b = curr=='X' && (prev=='L'||prev=='C');
            boolean c = curr=='C' && (prev=='D'||prev=='M');
            if(a || b || c){
                sum -= currVal;
            }else{
                sum += currVal;
            }
            prev = curr;
        }
        return sum;
    }
}
