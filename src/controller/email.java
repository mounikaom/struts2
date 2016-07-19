package controller;

import com.opensymphony.xwork2.ActionSupport;

public class email extends ActionSupport {
    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String email;
    private String phone;
    private String noise;
 
    public String execute() {
 
        if (this.email.equals(" ")
                && this.phone.equals(" ")&& this.noise.equals(" ")) {
        	addActionError(getText("error.login"));
            return "error";
        } else {
        	
        	System.out.println("text:"+noise);
        	if(MailgunMailer.send(email, "info@ihdmtech.com", "New contact form", noise)){
        	addActionError(getText("mail.success"));
            return "success";}
        	else
        	{
        		addActionError(getText("mail.error"));
                return "error";
        	}
        	
        }
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String username) {
        this.email = username;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String password) {
        this.phone = password;
    }

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
}

