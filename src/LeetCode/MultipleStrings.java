package LeetCode;

public class MultipleStrings {


        public String multiply(String num1, String num2) {

            int m = num1.length();
            int n = num2.length();
            //size of the array will be the sum of the lengths of both string
            int[] res = new int[m+n];
            for(int i = m-1;i >=0;--i){
                for(int j = n-1;j>=0;--j){
                    // ASCII of 0 is 48, so I am subtracting ASCII value of current string to get the integer value
                    int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                    int sum = res[i+j+1] + mul;
                    // DON'T FORGET THE += because you are adding to the existing value
                    res[i+j] += sum/10;
                    // not adding to the updated value.
                    res[i+j+1] = sum%10;

                }
            }

            StringBuilder stringBuilder = new StringBuilder();

            for(int val : res){
                if( stringBuilder.length() >0 ||val !=0){
                    stringBuilder.append(val);
                }
            }


            return stringBuilder.length() == 0 ? "0" : stringBuilder.toString();
        }
    }

