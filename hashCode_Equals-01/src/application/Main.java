package application;

import entities.Client;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");

        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        //vai dar diferente pq a posicao na memoria é diferente
        System.out.println(c1 == c2);
    }
}