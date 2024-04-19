package mx.utng.sesion25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.utng.sesion25.IUserService;


@Controller
public class UserController {
    //Inyectamos una dependencia del servicio
    @Autowired
    private IUserService userService;

    @GetMapping ()
    public String list(Model model){
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", userService.list());
        return "list";

    }
}
