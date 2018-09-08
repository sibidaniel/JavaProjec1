package com.company;

public class Main{

    public static void main(String []args){
        int a[]  = {1, 2, 6,2,3,4,5,2,9,11,3};
        int sum = 0;
        int n =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==6){
                for(int j=0;j<a.length;j++){
                    if(a[j]==9){
                        n = j;
                    }
                }
                i = n;
                continue;
            }
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
