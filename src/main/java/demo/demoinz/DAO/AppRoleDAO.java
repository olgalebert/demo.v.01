package demo.demoinz.DAO;

import java.util.*;

import demo.demoinz.model.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
@Transactional
public class AppRoleDAO {

    @Autowired
    private EntityManager entityManager;

    public List<String> getRolesNames(Long userId){
        String  sql = "Select ur.appRole.name from " +AppRoleDAO.class.getName() + " ur " + "where ur.appUser.userId =: userId";

        Query query = entityManager.createQuery(sql, AppRole.class);
        query.setParameter("userId", userId);

        return query.getResultList();
    }

}
