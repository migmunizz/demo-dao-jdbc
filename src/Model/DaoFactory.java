package Model;

import Model.DAO.SellerDAO;
import Model.DAO.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDAO createSellerDao(){
        return new SellerDaoJDBC();
    }
}
