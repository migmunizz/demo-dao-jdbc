package Model;

import Model.DAO.DepartmentDao;
import Model.DAO.impl.DepartmentDaoJDBC;
import db.DB;

public class DaoDepartmentFactory {
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
