package application;

import Model.DAO.SellerDAO;
import Model.DaoFactory;
import Model.entites.Department;
import Model.entites.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args){


        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);


    }
}
