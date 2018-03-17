package com.evolution.login.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by u_kino07 on 2018. 3. 3..
 */
@Service
public class LoginService {
    Map<String, String> info = new HashMap<String, String>();

    @PostConstruct
    public void init() {
        info.put("ukino07", "123");
        info.put("asloud", "456111@@@#");
        info.put("SSay", "fyeifw1");
        info.put("billgates", "rkdoqw2");
    }

    public boolean login(String id, String pw) {
        String storedPw = info.get(id);
        if (storedPw == null) {
            return false;
        }

        return pw.equals(storedPw);
    }
}
