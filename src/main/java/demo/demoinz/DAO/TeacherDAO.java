package demo.demoinz.DAO;

import demo.demoinz.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
@Transactional
public class TeacherDAO {

    @Autowired
    private EntityManager entityManager;

    public Teacher getTeacherByUsername (String username){
        try{
          String sql = "SELECT t FROM " + Teacher.class.getName() + " t " + "WHERE t.username =: userName;";
          Query query = entityManager.createQuery(sql, Teacher.class);
          query.setParameter("userName", username);

          return (Teacher) query.getSingleResult();
        }catch (Exception e ){
            return null;
        }
    }
}
