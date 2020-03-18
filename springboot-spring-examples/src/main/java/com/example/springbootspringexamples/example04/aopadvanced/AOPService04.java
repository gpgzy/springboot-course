package com.example.springbootspringexamples.example04.aopadvanced;

import org.springframework.stereotype.Component;

@Component
@MyAuthority
public class AOPService04 {
    public void getUser() {
    }

    @MyAuthority(value = MyAuthority.MyAuthorityType.ADMIN)
    public void getAdmin() {
    }
}
