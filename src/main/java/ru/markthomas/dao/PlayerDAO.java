package ru.markthomas.dao;

import org.hibernate.Session;
import ru.markthomas.model.Player;
import ru.markthomas.util.HibernateUtil;

import java.util.List;

public class PlayerDAO {
    public List<Player> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Player> result = (List<Player>)session.createSelectionQuery("from TEST").list();
        session.getTransaction().commit();

        return result;
    }
}
