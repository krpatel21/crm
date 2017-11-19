package misty.crm.controller;

import misty.crm.model.User;
import misty.crm.model.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Controller
public class HomeController {

//    @Autowired
//    private SessionFactory sessionFactory;

    @RequestMapping("/")
    @SuppressWarnings("unchecked")
    public String home(Model model) {
//        Session session= sessionFactory.openSession();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//
//        CriteriaQuery<User> criteria = builder.createQuery(User.class);
//        criteria.from(User.class);
//        List<User> users = session.createQuery(criteria).getResultList();
//
//        CriteriaQuery<Worker> criteria2 = builder.createQuery(Worker.class);
//        criteria2.from(Worker.class);
//        List<Worker> workers = session.createQuery(criteria2).getResultList();
//
//        model.addAttribute("users", users);
//        model.addAttribute("workers", workers);
        return "hello world";
    }
}
