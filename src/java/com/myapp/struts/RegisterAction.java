package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author nick
 */

public class RegisterAction extends org.apache.struts.action.Action {
   
    private static final String SUCCESS = "success";
    //additional required string in order to describe an erratic case
    private static final String FAILURE = "failure";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        user.RegisterData fBean = (user.RegisterData)form;
        String name = fBean.getName();
        String title = fBean.getTitle();

        //Check whether the title and name fields are empty

        if ((name == null) ||  title == null  || name.equals("") || title.equals("")){

          //initialize the error string in RegisterData Class in order to print the error message
 
	  fBean.setError();
	  return mapping.findForward(FAILURE);
        }

	//initialize the welcome string in order to be printed the Welcome string
        fBean.setWelc();
        return mapping.findForward(SUCCESS);
    }
}
