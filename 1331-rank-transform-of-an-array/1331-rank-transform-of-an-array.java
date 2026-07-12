class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return arr;
       Map<Integer,Integer> map = new HashMap<>();
       int number =1;
       int [] temp = arr.clone();
       Arrays.sort(temp);
       for(int i:temp)
       {
        if(!map.containsKey(i))
        {
            map.put(i,number++);
        }
       }
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}