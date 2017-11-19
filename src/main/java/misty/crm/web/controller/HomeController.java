package misty.crm.web.controller;

import misty.crm.dao.InvoiceDao;
import misty.crm.dao.UserDao;
import misty.crm.model.Invoice;
import misty.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @RequestMapping({"/"})
    public String taskList(Model model) {
        Iterable<User> users = userDao.findAll();
        Iterable<Invoice> invoices = invoiceDao.findAll();
        model.addAttribute("users",users);
        model.addAttribute("invoices", invoices);
        return "home";
    }
}
