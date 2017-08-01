package meg.ostomia.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private String user;
	private String password;

	public String login() {
		if (this.user != null && this.user != "" && 
			this.password != null && this.password != "") {
			
			this.session.put("LOGIN", true);
			return Action.SUCCESS;
		} else {
			return Action.LOGIN;
		}
	}

	@SuppressWarnings("rawtypes")
	public String logout() {
		if (session instanceof org.apache.struts2.dispatcher.SessionMap) {
		    try {
		        ((org.apache.struts2.dispatcher.SessionMap) session).invalidate();
		    } catch (IllegalStateException e) {
		        e.printStackTrace();
		    }
		}
		return SUCCESS;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
