package com.lambdaschool.zoos.service;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.data.domain.AuditorAware;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserAuditing implements AuditorAware<String>
{

    @Override
    public Optional<String> getCurrentAuditor()
    {

        String uname = "SYSTEM";
        return Optional.of(uname);

//        String uname;
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null)
//        {
//            uname = authentication.getName();
//        }
//        else
//        {
//            uname = "SYSTEM";
//        }
//        return Optional.of(uname);
    }

}