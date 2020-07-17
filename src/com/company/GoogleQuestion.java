package com.company;

import java.util.ArrayList;

public class GoogleQuestion {

    public static void main(String[] args) {
        System.out.println(getValue("true|false&false|false|true&true"));
    }

    public static boolean getValue(String val){



        String[] orString = val.split("\\|");

//        System.out.println(orString.length);

        ArrayList<String> values = new ArrayList<>();
        String check = "true";
        for(int i =0;i<orString.length;i++){
            if(orString[i].equals("true") || orString[i].equals("false")){
                values.add(orString[i]);
//                System.out.println("value " + i + values.get(i));
            }

            else {
                String[] andArray = orString[i].split("&");
                for(int j=0; j<andArray.length-1;j++){
                     if (andArray[j].equals("true") && andArray[j+1].equals("true") && check.equals("true")){
                         check="true";
                     }
                     else {
                         check = "false";
                     }

                }
                values.add(check);
//                System.out.println("value " + i + values.get(i));

            }
        }

        boolean ans = Boolean.parseBoolean(values.get(0));



        for(int k=1;k<values.size();k++){
            if(Boolean.parseBoolean(values.get(k)) || ans){
                ans = true;
            }
            else {
                ans = false;
            }

        }
        return ans;

    }
}
