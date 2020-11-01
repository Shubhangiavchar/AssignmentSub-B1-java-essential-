package com.Odd;

public class Main {

    public static void main(String[] args) {
     int arr[]={1,2,5,6,7};
        System.out.println("Odd numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
