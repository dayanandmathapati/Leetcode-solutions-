class Solution {

    public int[] intersection(int[] num1,
                              int[] num2) {
HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num1.length;i++){
            map.put(num1[i],1);
           
        }
         int[] result = new int[num1.length];
            int count =0;
        for(int i =0 ;i < num2.length;i++){
            if(map.containsKey(num2[i])){
                result[count] = num2[i];
                count++;
                map.remove(num2[i]);
            }
        }
      return Arrays.copyOf(result, count);
    }
}