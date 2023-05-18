package workshop1;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
                int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        String[] list = new String[n];
        sc = new Scanner(System.in);
        for(int i = 0; i < n; i ++){
            System.out.print("Enter the name of students " + (i+1) + ": ");
            list[i] = sc.nextLine();
        }
        System.out.println("List of students after uppercase: ");
        for(int i = 0; i < n; i++){
            char[] a = list[i].toCharArray();
            for(int j = 0; j < a.length; j++){
                if(j == 0 || Character.isSpace(a[j-1])){
                    a[j] = Character.toUpperCase(a[j]);
                }
            } 
            list[i] = String.valueOf(a);
            System.out.println(list[i]);
        }
            
            
            
        }
    }