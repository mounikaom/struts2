package controller;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    public String username;
    public String password;
 
    public String execute() {
 
        if (this.username.equals("admin@ehr2ehr.com")
                && this.password.equals("admin@123")) {
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}

