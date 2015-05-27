package action.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

public class RegisterForm extends ActionForm {
    /**
	 * 
	 */
	private static final long serialVersionUID = 466970135486239988L;
	private String userId = null;
    private String password = null;
    
    public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String user = null;
    private String name = null;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void reset() {
        this.userId = null;
        this.password = null;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (getUserId().length() < 1) {
            errors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("ユーザIDを入力してください。"));
        }
        return errors;
    }
}