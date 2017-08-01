package meg.ostomia.struts.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CargarDatosAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
	
	@Override
	public String execute() throws Exception {
		this.name = "Maxi";
		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
