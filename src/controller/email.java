package controller;

import com.opensymphony.xwork2.ActionSupport;

public class email extends ActionSupport {
    /**
	 * 
	 */
	
	public static final long serialVersionUID = 1L;
	public String email;
    public String subject;
    public String noise;
 
    public String execute() {
 
        if (this.email.equals(" ")&& this.subject.equals(" ")&& this.noise.equals(" ")) {
        	addActionError(getText("error.login"));
            return "error";
        } else {
        	
        	System.out.println("text:"+email);
      	if(multiplemail.send("admin@ehr2ehr.com", email, "Subject", noise)){
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
 
    public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
}

