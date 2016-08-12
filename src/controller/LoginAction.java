package controller;

import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "serial", "unused" })
public class LoginAction extends ActionSupport {
    public String username;
    public String password;
 
    public String execute() {
 
        if (this.username.equals("admin@ehr2ehr.com")
                && this.password.equals("admin@123")){
        	Map<String, Object> session = ActionContext.getContext().getSession();
        	session.put("logined","true");
        	            session.put("context", new Date());
        	            return "success";
        	        }
        	        return "error";
        	    }
    public String LogoutAction() throws Exception {
//      HttpSession session = ServletActionContext.getRequest().getSession();
//      session.removeAttribute("logined");
//      session.removeAttribute("context"); 
   Map<String, Object> session = ActionContext.getContext().getSession();
session.remove("logined");
      session.remove("context");
      return "success";
  }
        
//        		{
//            return "success";
//        } else {
//            addActionError(getText("error.login"));
//            return "error";
//        }
    
 
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

