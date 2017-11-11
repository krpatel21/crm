package misty.crm.controller;

import misty.crm.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/")
    @SuppressWarnings("unchecked")
    public String home(Model model) {
        Session session= sessionFactory.openSession();
        List<User> users = session.createCriteria(User.class).list();

        model.addAttribute("users", users);
        return "home";
    }
}
