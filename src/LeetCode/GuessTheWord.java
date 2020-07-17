package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class GuessTheWord {

    public static class Master{
        String word = "hbaczn";

        public int guess(String s){
            char[] a = word.toCharArray();
            char[] b = s.toCharArray();

            int counter=0;
            for(int i=0;i<a.length;i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == b[j]) {
                        counter++;
                    }
                }
            }



            if(counter < 0 ) return -1;
            return counter;
        }
    }

    public static void main(String[] args) {

        String[] strrrr = {"gaxckt","trlccr","jxwhkz","ycbfps","peayuf","yiejjw","ldzccp","nqsjoa","qrjasy","pcldos","acrtag","buyeia","ubmtpj","drtclz","zqderp","snywek","caoztp","ibpghw","evtkhl","bhpfla","ymqhxk","qkvipb","tvmued","rvbass","axeasm","qolsjg","roswcb","vdjgxx","bugbyv","zipjpc","tamszl","osdifo","dvxlxm","iwmyfb","wmnwhe","hslnop","nkrfwn","puvgve","rqsqpq","jwoswl","tittgf","evqsqe","aishiv","pmwovj","sorbte","hbaczn","coifed","hrctvp","vkytbw","dizcxz","arabol","uywurk","ppywdo","resfls","tmoliy","etriev","oanvlx","wcsnzy","loufkw","onnwcy","novblw","mtxgwe","rgrdbt","ckolob","kxnflb","phonmg","egcdab","cykndr","lkzobv","ifwmwp","jqmbib","mypnvf","lnrgnj","clijwa","kiioqr","syzebr","rqsmhg","sczjmz","hsdjfp","mjcgvm","ajotcx","olgnfv","mjyjxj","wzgbmg","lpcnbj","yjjlwn","blrogv","bdplzs","oxblph","twejel","rupapy","euwrrz","apiqzu","ydcroj","ldvzgq","zailgu","xgqpsr","wxdyho","alrplq","brklfk"};
        Master master = new Master();

        findSecretWord(strrrr, master);

    }

        static int val =0;
        public static  void findSecretWord(String[] wordlist, Master master) {

            System.out.println("Initial Word List" + wordlist.length);



            val = master.guess(wordlist[0]);
            if(val < 2){
                val = master.guess(wordlist[1]);

            }
            if(val < 3){
                val = master.guess(wordlist[2]);
            }
            if(val < 4){
                val = master.guess(wordlist[3]);
            }


            System.out.println("Value retrieved : " + val);

            ArrayList<String> updated = findSimilarCharacters(wordlist,val);


            for(String u : updated){

                System.out.println(master.guess(u));
            }


        }


        public static ArrayList<String> findSimilarCharacters(String[] wordlist, int n){
            char[] strArr = wordlist[0].toCharArray();

           // Arrays.sort(strArr);

            int counter=0;
            ArrayList<String> new_array = new ArrayList<String>();
            for(int i=1;i<wordlist.length;i++){
                char[] dummy = wordlist[i].toCharArray();
               // Arrays.sort(dummy);

                for(int j=0;j<dummy.length;j++){
                    for(int k =0;k<dummy.length;k++){
                        System.out.println("printing arrays " + dummy[j] + " " + strArr[k]);
                        if(dummy[j] == strArr[k])
                            System.out.println("printing arrays " + dummy[j] + " " + strArr[k]);
                            counter++;
                        System.out.println("counttttt" + counter);
                            break;
                    }

                }

                if(counter >=n){
                    new_array.add(wordlist[i]);
                }

                counter =0;



            }

            System.out.println("Final word list" + new_array.size());


            return new_array;
        }

}
