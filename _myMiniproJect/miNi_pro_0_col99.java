package _myMiniproJect;

public class miNi_pro_0_col99 {
    //99단 만들기
    public static void main(String[] args) {
        System.out.printf("1단   2단   3단   4단   5단   6단   7단   8단   9단");
        for(int i = 0; i < 10; i++){
            System.out.println(""); 
            for(int j = 0; j < 9; j++){
                System.out.printf("  %d   ",(i+1)*(j+1));
            }
            
        }

        //int[] row = new int[9];

    }
}
