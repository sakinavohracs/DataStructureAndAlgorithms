package CrackingTheCodingInterview;


//too bad solution
public class URLify {
    public static void main(String[] args) {
        System.out.println(urlify("Mr   3ohn Smith"));
    }

    public static String urlify(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length(); i++){
            if((i+1)!= str.length()) {
                if (str.charAt(i) == ' ' & str.charAt(i + 1) == ' ') {
                    continue;
                }
                else if(str.charAt(i) == ' '){
                    sb.append("%20");
                }
                else sb.append(str.charAt(i));

            } else {
                 if(str.charAt(i) == ' '){
                    sb.append("%20");
                }
            }


        }


       return sb.toString();

    }
}
