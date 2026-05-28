package Model;

import Model.DAO.SellerDAO;
import Model.DAO.impl.SellerDaoJDBC;
import db.DB;

public class DaoSellerFactory {
    public static SellerDAO createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
