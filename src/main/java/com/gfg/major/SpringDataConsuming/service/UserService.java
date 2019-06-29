package com.gfg.major.SpringDataConsuming.service;

import com.gfg.major.SpringDataConsuming.dao.CodeForcesDataReader;
import com.gfg.major.SpringDataConsuming.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    CodeForcesDataReader codeForcesDataReader;

    public UserInfo getUserInfo(String handle){
        return codeForcesDataReader.getUserInfo(handle);
    }

}
