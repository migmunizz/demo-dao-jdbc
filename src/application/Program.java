package application;

import Model.DAO.SellerDAO;
import Model.DaoFactory;
import Model.entites.Department;
import Model.entites.Seller;

import java.time.LocalDate;
import java.util.List;

public class Program {
    public static void main(String[] args){


        SellerDAO sellerDAO = DaoFactory.createSellerDao();
        System.out.println("=== Teste 1 : findByID ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("=== Teste 2 : findByDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDAO.findByDepartment(department);

        for (Seller a : list){
            System.out.println(a);
        }

        System.out.println("=== Teste 3 : findAll ===");
        list = sellerDAO.findAll();

        for (Seller a : list){
            System.out.println(a);
        }
    }
}
