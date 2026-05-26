package Model.DAO;

import Model.entites.Department;
import Model.entites.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
