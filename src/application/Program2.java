package application;

import Model.DAO.DepartmentDao;
import Model.DAO.SellerDAO;
import Model.DaoDepartmentFactory;
import Model.DaoSellerFactory;
import Model.entites.Department;
import Model.entites.Seller;

import java.util.List;

public class Program2 {
    public static void main(String[] args){

        DepartmentDao departmentDao = DaoDepartmentFactory.createDepartmentDao();
        System.out.println("=== Teste 1 : findByID ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("=== Teste 2 : findByALl ===");
        List<Department> list = departmentDao.findAll();
        for (Department a : list){
            System.out.println(a);
        }

        System.out.println("=== Teste 3 : insert ===");
        Department dep = new Department(null,"Air fryer");
        departmentDao.insert(dep);
        System.out.println("Successful insert");

        System.out.println("=== Teste 4 : update ===");
        dep = departmentDao.findById(8);
        dep.setName("Mister Box");
        departmentDao.update(dep);
        System.out.println("Successful update");

        System.out.println("=== Teste 5 : delete ===");
        departmentDao.deleteById(9);
        System.out.println("Successful delete");



    }
}
