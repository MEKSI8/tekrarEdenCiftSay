import java.sql.Array;

public class Main {

    static boolean isContain(int[] list, int say){
        for (int i:list){
            if (i==say){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,22,33,44,55,66,22,10};

        int[] yeniList = new int[list.length];
        int index=0;

        for (int i=0; i<list.length;i++){
            for (int j=0; j<list.length;j++){
                if (j==i){

                }
                else {
                    if (list[j]==list[i]){
                        if (isContain(yeniList,list[i])){

                        }
                        else {
                            if (list[i]%2==0){
                                yeniList[index]=list[i];
                                index++;
                            }
                        }
                    }
                }
            }
        }

        for (int i : yeniList){
            System.out.print(i+" ");
        }



    }
}