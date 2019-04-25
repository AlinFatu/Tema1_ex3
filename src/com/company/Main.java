package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=5;
        int par=0;
        int[] array=new int[]{4,20,5,88,2};
        int aux=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                par++;
            }
            else{
                if(array[i]>aux){
                    aux=array[i];
                }
            }
        }
        if(par==n){
            System.out.println("no");
        }
        else {
            System.out.println(aux);
        }
    }
}
