package controllers;

import java.util.Scanner;

import object.Ticket;

// import java.util.ArrayList;
import java.util.InputMismatchException;

public class Admin {
    static Scanner scanner = new Scanner(System.in);
    static Connect connect = new Connect();

    public static void main(String[] args) {
        System.err.println("Movie Lists : ");
        for(int i=0; i<connect.getAllData().size(); i++){
            System.out.println((i+1) + ". " + connect.getAllData().get(i));
        }
        new Admin().handleCreate();
    }


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
            System.out.println("Input number bruh : " + e);
            scanner.next();
        }
        
        System.out.print("\nInput amount of vip tickets : ");
        int vipAmount = -1;
        try {
            vipAmount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input number bruh : " + e);
        }

        if ( regAmount != -1 && vipAmount != -1){
            System.out.printf("\ntitle : %s\ntime : %s\nreg : %d\nvip : %d\n",movieTitle,showTime,regAmount,vipAmount);
            Ticket newMovie = new Ticket(movieTitle, showTime, regAmount, vipAmount);
            
            // save movie to database
            connect.addToDB(newMovie.toString());
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
            System.out.println("Input number bruh : " + e);
        }

        if ( idDel != -1) {
            System.out.print("Movie with id : " + idDel + " will be deleted");
            // delete method will be executed here
        } else {
            System.out.println("Do u understand Endlish ?");
        }
    }
}
