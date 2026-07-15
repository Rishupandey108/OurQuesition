class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int odd = (n*(2+(n-1)*2))/2;
        int even = (n*(4+(n-1)*2))/2;

        int result = gcd(odd,even);
        return result;
    }


    public static int gcd(int odd ,int even){
        return even==0?odd:gcd(even,odd%even);
    }
}