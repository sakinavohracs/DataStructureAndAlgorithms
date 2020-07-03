package LeetCode.JulyChallenge;

public class CoinArray {
    public static void main(String[] args) {
        arrangeCoins(5);
    }
    public static int arrangeCoins(int n) {

        int values = n;
        int inc = 1;
        while(values>0){
            values = values - inc;
            inc++;
            System.out.println(values + " " + inc);
        }
//         for(int i=1;i<=n;i++){
//             values = values + i;
//             if(values < n && values ==row ) row ++;

//         }

        return values<0 ? inc-2: inc-1;
    }
}


