class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();

        String inter = s;
        int interval =0;
        while(inter.length()>k)
        {
            for(int i=0;i<inter.length();i+=k)
            {
                for(int j=i;j<i+k && j<inter.length();j++)
                {
                    interval +=inter.charAt(j) -'0';
                }
             sb.append(interval);
             interval =0;

            }
            inter = sb.toString();
            sb.setLength(0);
        }
        return inter;
    }
}