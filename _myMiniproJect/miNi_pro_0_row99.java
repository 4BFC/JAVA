package _myMiniproJect;

public class miNi_pro_0_row99 {
    //99단 만들기
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            System.out.printf("%d단 ::\n",i+1);
            for(int j = 0; j < 9; j++){
                System.out.printf("%d, ",(i+1)*(j+1));
            }
            System.out.println("");   
        }
    }
}
