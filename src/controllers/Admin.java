package controllers;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Admin {

    public static void main(String[] args) {
        new Admin().handleDelete();
    }

    static Scanner scanner = new Scanner(System.in);

    public void handleCreate(){
        System.out.print("Input title : ");
        String movieTitle = scanner.nextLine();

        System.out.print("\nInput show time : ");
        String showTime = scanner.nextLine() + " WIB";

        System.out.print("\nInput amount of regular tickets : ");
        int regAmount = -1;
        try {
            regAmount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number bruh : " + e);// TODO: handle exception
            scanner.next();
        }
        
        System.out.print("\nInput amount of vip tickets : ");
        int vipAmount = -1;
        try {
            vipAmount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number bruh : " + e);// TODO: handle exception
        }

        // this will be create movie method
        if ( regAmount != -1 && vipAmount != -1){
            System.out.printf("\ntitle : %s\ntime : %s\nreg : %d\nvip : %d",movieTitle,showTime,regAmount,vipAmount);
        } else {
            System.out.println("Do u understand english ? ");
        }
    }

    public void handleDelete(){
        System.out.println("Input id movie to delete : ");
        int idDel = -1;
        try {
            idDel = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number bruh : " + e);// TODO: handle exception
        }

        if ( idDel != -1) {
            System.out.print("Movie with id : " + idDel + " will be deleted");
            // delete method will be executed here
        } else {
            System.out.println("Do u understand Endlish ?");
        }
    }
}
