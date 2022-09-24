
package com.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorInicioTuristic {
    
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
    public String loginAdmin()
    {
        return "loginadmin";
    }
}
