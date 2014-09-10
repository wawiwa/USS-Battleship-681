package actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@SuppressWarnings("rawtypes")
public class Driver extends ActionSupport implements ModelDriven, ServletContextAware {

	//default serial id added to get rid of the warning message
	private static final long serialVersionUID = 1L;

//	private Student student;
//	private EmcFields emcFields;
//	private ServletContext servletContext;
//	private List<Student> allTakenSurveys;
//	private WinningResult winningResult;
//	private SearchFields searchFields;
//
//

	/**
	 * This method is called when the user clicks the button
	 * on the home page, this will bring the user to the 
	 * survey.jsp page.  There the user will be able to fillout
	 * the survey form. 
	 * 
	 * @return success message
	 */
	public String gotoDashboard() {
		System.out.println("gotoSurveyView method was called");
		return "success";
	}

	public String search() {
		System.out.println("Search method in Driver was called");
		//System.out.println(searchFields);
		return "success";
	}
	
	
	public String home() {
		System.out.println("Home page view");
		return "home";
	}

	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() {
		System.out.println("Driver Execute Method was called");
		return "success";
	}


	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	


}

	

