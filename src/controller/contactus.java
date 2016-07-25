package controller;

import com.opensymphony.xwork2.ActionSupport;

public class contactus extends ActionSupport {
    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
    private String phone;
    private String message;
 
    public String execute() {
 
        if ( this.name.equals(" ")
                && this.phone.equals(" ")&& this.message.equals(" ")) {
        	addActionError(getText("error.login"));
            return "error";
        } else {
        	
        	System.out.println("text:"+name+email+message);
        	if(ehrmail.send(email, "info@ihdmtech.com", "new contact", message,name,phone)){
        	addActionError(getText("mail.success"));
            return "success";}
        	else
        	{
        		addActionError(getText("mail.error"));
                return "error";
        	}
        	
        }
    }
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

