public class e4 {
    public static void balance(){
        int primarybalance=1000;
        for(int number=1;number<=3;number++){
            primarybalance=primarybalance+primarybalance*5/100;
            System.out.println(primarybalance);
        }
    }
    public static void main(String[] args){
        balance();
    }
}
