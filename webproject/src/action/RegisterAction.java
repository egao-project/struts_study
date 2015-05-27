package action;

import action.form.RegisterForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;

public class RegisterAction extends Action {

    public ActionForward execute(
        ActionMapping mapping,
        ActionForm form,
        HttpServletRequest request,
        HttpServletResponse response) {

        HttpSession session = request.getSession();
        ActionErrors errors = new ActionErrors();

        RegisterForm registerForm = (RegisterForm) form;

        // データベースへの登録処理
        // ....

        session.setAttribute("user", registerForm);

        return mapping.findForward("success");
    }
}