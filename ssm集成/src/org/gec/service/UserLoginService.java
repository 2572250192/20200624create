package org.gec.service;

import org.apache.ibatis.annotations.Param;
import org.gec.pojo.User;

public interface UserLoginService {
    public User userLogin( String username ,String password);
}
