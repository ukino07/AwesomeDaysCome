package com.evolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by u_kino07 on 2018. 3. 3..
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest httpServletRequest) {
        String id = httpServletRequest.getParameter("id");
        String pw = httpServletRequest.getParameter("pw");

        if (loginService.login(id, pw)) {
            HttpSession httpSession = httpServletRequest.getSession();
            httpSession.setAttribute("userId", id);
            return "login";
        }
        return "index";
    }
}
