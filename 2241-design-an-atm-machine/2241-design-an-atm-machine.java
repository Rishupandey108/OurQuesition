class ATM {
        HashMap<Integer,Integer> hsmp;
    public ATM() {

        hsmp = new HashMap<>();
        hsmp.put(20,0);
        hsmp.put(50,0);
        hsmp.put(100,0);
        hsmp.put(200,0);
        hsmp.put(500,0);
    }
    
    public void deposit(int[] banknotesCount) {

        hsmp.put(20,hsmp.get(20)+banknotesCount[0]);
        hsmp.put(50,hsmp.get(50)+banknotesCount[1]);
        hsmp.put(100,hsmp.get(100)+banknotesCount[2]);
        hsmp.put(200,hsmp.get(200)+banknotesCount[3]);
        hsmp.put(500,hsmp.get(500)+banknotesCount[4]);

    }
    
    public int[] withdraw(int amount) {
        
            int result[] = new int[5];

            int notes[] ={20,50,100,200,500};

            for(int i=4;i>=0;i--){

                int note = notes[i];
                int count = Math.min(amount/note,hsmp.get(note));

                result[i] = count;
                amount -= note*count;
            }


            if(amount >0){
                return new int[]{-1};
            }

            for(int i=0;i<5;i++){

                    hsmp.put(notes[i],hsmp.get(notes[i])-result[i]);
            }

            return result;
        
        }

    }


/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */