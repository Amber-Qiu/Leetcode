// Points: map, String & StringBuilder
public class Solution {
  public String intToRoman1(int num) {
      Map<Integer, String> map = new HashMap<Integer, String>();
      map.put(1,"I");
      map.put(4,"IV");
      map.put(5,"V");
      map.put(9,"IX");
      map.put(10,"X");
      map.put(40,"XL");
      map.put(50,"L");
      map.put(90,"XC");
      map.put(100,"C");
      map.put(400,"CD");
      map.put(500,"D");
      map.put(900,"CM");
      map.put(1000,"M");

      //List<Integer> alist = new ArrayList<Integer>(map.keySet());
      //Collections.sort(alist, Collections.reverseOrder());
      int[] alist = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
      StringBuilder s = new StringBuilder();
      for(int value : alist){
          if(num / value >= 1){
              for(int i = 0; i<(num/value);i++){
                  s.append(map.get(value));
              }
              num = num%value;
          }
      }
      return s.toString();
  }

  // Input is guaranteed to be within the range from 1 to 3999.
  public String intToRoman2(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
  }
}
