package com.gfg.major.SpringDataConsuming.dao;


import com.gfg.major.SpringDataConsuming.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CodeForcesDataReader {
    @Autowired
    private RestTemplate restTemplate;
    public UserInfo getUserInfo(String handle) {
        UserInfo userInfo = restTemplate.getForObject("https://codeforces.com/api/user.info?handles="+handle, UserInfo.class);
        return userInfo;
    }

}