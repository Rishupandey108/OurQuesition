class OrderedStream {

    String[] arr;
     
      
    
    public OrderedStream(int n) {
        arr = new String[n+1];
        arr[0] = "st";

    }
    
    public List<String> insert(int idKey, String value) {
        List<String> result  = new ArrayList<>();
        arr[idKey] = value;
        if(arr[idKey-1]==null){

            return result;

        }else{

            int temp = idKey;

            while(temp>=1){
                if(arr[temp]==null){
                    return  result;
                }
                temp--;
            }
            for(int i=idKey;i<arr.length;i++){
                if(arr[i]==null){
                    break;
                }else{
                    result.add(arr[i]);
                }
            }
        }

        return result;


    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */