package application;

import Model.entites.Department;
import Model.entites.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args){
        Department obj = new Department(1,"Books");

        Seller seller = new Seller(12,"bob@gmail.com","Bob", LocalDate.now(),2000.0,obj);
        System.out.println(seller);
    }
}
