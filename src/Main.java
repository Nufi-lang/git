import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int factorial(int num){
        if(num ==0 || num==1){
            return 1;
        }
        return num*factorial(num - 1);
    }
    public static boolean isPalindrome(String str){
         int left=0;
         int right = str.length()-1;
         while(left < right){
             if (str.charAt(left) != str.charAt(right)){
                 return false;
             }
             left++;
             right--;

         }
         return true;
    }

    public static boolean sum_target(){
        int[] num={1,2,34,5};
        int target = 4;
        Arrays.sort(num);
        int left = 0,right = num.length-1;
        while(left < right){
            int sum = num[left] +num[right];
            if(sum == target){
                System.out.println("pair found "+num[left]+","+num[right]);
                return true;
            } else if (sum>target) {
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println("{-1,-1}");
        return false;
    }
    public static void main(String[] args) {
        int num =5;
        System.out.println("Factorial of :"+num + "is"+factorial(num));
        System.out.println("Palindrome or not:"+isPalindrome("pap"));
        sum_target();
    }
}

