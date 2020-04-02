package cn.wfc.security.controller;

import cn.wfc.security.bean.User;
import cn.wfc.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping({"/","/index"})
    public String index(Model model){
        User user = userService.findUserByName("wfc");
        model.addAttribute("user", user);
        return "index";
    }
}
