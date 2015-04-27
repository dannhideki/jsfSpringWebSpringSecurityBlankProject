package com.dannhideki.controller;

import com.dannhideki.service.UserService;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author hideki
 */
@Controller
@RequestScoped
@Named
public class IndexController {
    
    @Autowired
    private UserService userService;
    
    public String printMsgFromSpring() {
		return userService.getMessage();
	}

    public String registerUser() {
        return "/public/register_user.xhtml";
    }
    public String login(){
          return "/public/login.xhtml";
   }
    
   public String index(){
          return "/public/index.xhtml";
   }
}

