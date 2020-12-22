package com.sahmed.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkaiIsImV4cCI6MTYwOTE4NzYzOSwiaWF0IjoxNjA4NTgyODM5fQ.hVsELC7SkhqqWZTPM4PgldbxRjbUmW02dnNH5_LjvCEIKzO3k0wchq26ZS5SULxo8Bhhn_E-pWb85Jz7wGmidw"
//    }


    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

