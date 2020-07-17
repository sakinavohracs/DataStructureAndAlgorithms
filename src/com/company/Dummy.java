package com.company;

public class Dummy {

    public static void main(String[] args) {

        int[][] matrix = new int[2][2];

        //[[1,3],[2,3]]

        matrix[0][0] = 1;
        matrix[0][1] = 3;

        matrix[1][0] = 2;
        matrix[1][1] = 3;

int[] a = new int[3];
int[] b = new int[3];

        for(int[] l : matrix){
            a[l[0]]++;
            System.out.println(a[l[0]]);
        }


    }
}
