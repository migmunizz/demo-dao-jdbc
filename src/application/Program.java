package application;

import Model.DAO.SellerDAO;
import Model.DaoFactory;
import Model.entites.Department;
import Model.entites.Seller;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        System.out.println("=== Teste 4 : insert ===");
        Seller seller1 = new Seller(null,"roberto","robert@gmail.com", Timestamp.valueOf(LocalDateTime.now()),2000.0,department);
        sellerDAO.insert(seller1);
        System.out.println("Inserted new id = "+ seller1.getId());
    }
}
