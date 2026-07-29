class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> hsmp = new HashMap<>();

        hsmp.put('2',"abc");
        hsmp.put('3',"def");
        hsmp.put('4',"ghi");
        hsmp.put('5',"jkl");
        hsmp.put('6',"mno");
        hsmp.put('7',"pqrs");
        hsmp.put('8',"tuv");
        hsmp.put('9',"wxyz");
        List<String> result = new ArrayList<>();
        
        Backtrack(result,0,new StringBuilder(),hsmp,digits);

        return result;
    }


    public static void Backtrack(List<String> res,int idx , StringBuilder sb , HashMap<Character,String> hsmp,String digits){
                        if(idx==digits.length()){
                            res.add(sb.toString());
                            return ;
                        }


                        String curr = hsmp.get(digits.charAt(idx));

                        for(int i=0;i<curr.length();i++){

                            sb.append(curr.charAt(i));
                            Backtrack(res,idx+1,sb,hsmp,digits);
                            sb.deleteCharAt(sb.length()-1);
                        }

    }
}