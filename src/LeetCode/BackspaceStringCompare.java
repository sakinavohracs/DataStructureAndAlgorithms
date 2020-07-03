package LeetCode;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println( backspaceCompare("y#fo##f",
                "y#f#o##f"));
    }

    public static boolean backspaceCompare(String S, String T) {


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int counter = 0;
        for(char stringOne : S.toCharArray()){
            if(stringOne == '#' && sb1.length() ==0  )
                continue;
            else if(stringOne == '#'  && sb1.length() >= 1)
                sb1.setLength(sb1.length() - 1);
            else{sb1.append(stringOne);
                counter++;
            }

        }
        System.out.println(sb1.toString());
        counter =0;

        //"y#f#o##f"
        for(char stringTwo : T.toCharArray()){
            if(stringTwo == '#' && sb2.length() ==0 )
                continue;
            else if(stringTwo == '#' && sb2.length() >= 1)
                sb2.setLength(sb2.length() - 1);
            else {
                sb2.append(stringTwo);
                counter++;
            }



        }
        System.out.println(sb2.toString());
        counter=0;
        if(sb1.length() == 0 && sb2.length() == 0){
            return true;
        }
        return sb1.toString().equals(sb2.toString());

    }
}
