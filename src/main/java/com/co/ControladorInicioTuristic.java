
package com.co;

import com.co.DAO.ClienteDAO;
import com.co.POJO.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


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
     @GetMapping("/crear")
    public String crear()
    {
        return "crear";
    }
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute  Cliente clientes)
    {
        clientesDao.save(clientes);
        return"redirect:/loginadmin";
    }
     @GetMapping("/editar/{idcliente}")
    public String editar(@PathVariable("idcliente") Integer idcliente, Model model){
        var clientes= clientesDao.findById(idcliente);
        model.addAttribute("clientes",clientes);
        return "modificar";
    }
    @GetMapping("/eliminar/{idcliente}")
    public String eliminar(@PathVariable("idcliente") Integer idcliente){
        clientesDao.deleteById(idcliente);
        return "redirect:/loginadmin";
    }
}
