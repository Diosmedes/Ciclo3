
package com.co;

import com.co.DAO.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorInicioTuristic {
    @Autowired
    private ClienteDAO clientesDao;
    @GetMapping("/")
    public String inicio(){
       return "index" ;
    }
    @GetMapping("/login")
    public String inciosesion()
    {
        return "iniciosesion";
    }
    @GetMapping("/loginadmin")
    public String loginAdmin(Model model)
    {
        var clientes= clientesDao.findAll();
        model.addAttribute("clientes", clientes);
        return "loginadmin";
    }
}
