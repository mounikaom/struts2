package controller;

 
//import java.awt.event.ActionEvent;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LogoutAction extends ActionSupport {
public String execute() throws Exception { 
Map<String, Object> session = ActionContext.getContext().getSession();
session.remove("logined"); 
session.remove("context");
    return "success";
    }
}
