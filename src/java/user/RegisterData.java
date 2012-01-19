package user;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author nick
 */
public class RegisterData extends org.apache.struts.action.ActionForm {
    
    private String name;
    private String title;

    //additional error and welcome strings required

    private String error;
    private String welc;
    
    public String getWelc(){
        return(welc);
    }
    public void setWelc(){
        this.welc = "Welcome ";
    }
    public String getName() {
        return (name);
    }

    public void setName(String s1) {
        name = s1;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String s2){
        title = s2;
    }
    public String getError(){
        return(error);
    }
    
    public void setError(){
        this.error = "<span style='color:red'>Invalid Input</span>";
    }
            
}
