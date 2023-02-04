package LibraryMngmnt;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter the number of books to insert : ");
        int a = getInput.nextInt();
        System.out.println("Enter the book name : ");
        for(int i=0; i<a; i++){
            String S2 = Input.readLine();
            list1.add(S2);
            Collections.sort(list1);
        }
        System.out.println("\nMenu : 1) Available Books\n       2) Issue Books\n       3) Deposit Books\n       4) Exit");
        for(int j=0; j<4; j--){
            System.out.println("\nEnter the Need : ");
            int x = getInput.nextInt();
            switch(x){
                case (1):
                    System.out.println("Enter the number of books want to check : ");
                    int b = getInput.nextInt();
                    for (int k=0; k<b; k++) {
                        System.out.println("Enter the book name : ");
                        String S3 = Input.readLine();
                        if (list1.contains(S3)) {
                            System.out.println("The book is available");
                        }
                        else{
                            System.out.println("The book is not available");
                        }
                    }
                    break;
                case (2):
                    System.out.println("Enter the Number of books want to issue : ");
                    int c = getInput.nextInt();
                    for (int l = 0; l < c; l++) {
                        System.out.println("Enter the book name : ");
                        String S4 = Input.readLine();
                        if (list1.contains(S4)){
                            list1.remove(S4);
                            list2.add(S4);
                            System.out.println("Your book is Issued");
                        }else{
                            System.out.println("The book is not available");
                        }
                    }
                    break;
                case (3):
                    System.out.println("Enter the Number of books want to deposit : ");
                    int d = getInput.nextInt();
                    for (int n = 0; n < d; n++) {
                        System.out.println("Enter the book name : ");
                        String S5 = Input.readLine();
                        if (list2.contains(S5)){
                            list1.add(S5);
                            System.out.println("Your book is deposited");
                        }
                        else{
                            System.out.println("Invalid book");
                        }
                    }
                    break;
                case (4):
                    return;
                default:
                    System.out.println("Invalid Option !");
            }
        }
    }
}