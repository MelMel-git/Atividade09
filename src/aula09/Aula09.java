package aula09;

import java.util.Scanner;

public class Aula09 {

    public static void main (String[] args) {

        String user = "Melissa";
        String password = "12345";
        Scanner sc = new Scanner (System.in);
        String userInserir = "";
        String passwordInserir = "";

        do{
            if (!(userInserir.equals("") && passwordInserir.equals(""))) {
                System.out.println("ERRO: Digite o user e a senha novamente!\n");
            }

            System.out.println("Digite usuario:");
            userInserir = sc.next();
            System.out.println("Digite senha:");
            passwordInserir = sc.next();

        }while(!(passwordInserir.equals(password) && userInserir.equals(user)));
            System.out.println("Bem vindo "+user+"!!");

    }
}
