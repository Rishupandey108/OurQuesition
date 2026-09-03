class ParkingSystem {

    int b,m,s;

    public ParkingSystem(int big, int medium, int small) {
        this.b = big;
        this.m = medium;
        this.s = small;
    }
    
    public boolean addCar(int carType) {
        
        if(carType==1 && b>0){
            b-=1;
            return true;
        }else if(carType==2 && m>0){
            m-=1;
            return true;
        }else if(carType==3 && s>0){
            s-=1;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */