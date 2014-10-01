package app.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import app.tests.Checkregistration;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import ejb.domain.User;
import ejb.service.UserServiceLocal;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

@SuppressWarnings("rawtypes")
public class Registration extends ActionSupport implements ModelDriven,
		Preparable {

	private static UserServiceLocal getUserService() throws NamingException {
		InitialContext context = new InitialContext();
		return (UserServiceLocal) context
				.lookup("java:global/USS-Battleship-681/UserServiceImpl!ejb.service.UserServiceLocal");
	}

	private static final long serialVersionUID = 1L;
	/*
	 * private final Logger logger =
	 * LogManager.getLogger(Registration.class.getName());
	 */
	private User user;
	// Game_stat_op game=new Game_stat_op();

	@Override
	public String execute() throws Exception {

		if (!getUserService().doesUserExist(user)) {

			getUserService().createNewUserInDb(user);

			System.out.println("User created: " + user.getEmail());

			// logger.info("successful registration :",Registration.class.getName());
			// logger.info("just log info");
			// logger.debug("just log debug");
			// logger.warn("just log warn");
			// should go to login.jsp
			addActionMessage("Registration successful!");
			addActionMessage("Please log in!");

			return "success";

		}

		else {
			addActionError("This email has already been registered");
			System.out.println("User existed.");
			return "input";	
		}

	}

	@Override
	public void validate() {

		if (user.getName() == null || user.getName().trim().equals("")) {
			addActionError("The name is required");
		}
		if ((user.getName() != null && !user.getName().trim().equals(""))
				&& (user.getName().length() < 2 || user.getName().length() > 15)) {

			System.out.println("inside");
			addActionError("name must be between 2 and 15 characters");

		}

		if (user.getPassword() == null || user.getPassword().trim().equals("")) {
			addActionError("The password is required");
		}
		if (user.getPassword2() == null
				|| user.getPassword2().trim().equals("")) {
			addActionError("The password is required");
		}

		if (user.getEmail() == null || user.getEmail().trim().equals("")) {
			addActionError("The email is required!");
		}

		if (user.getPassword() != null
				&& !user.getPassword().trim().equals("")
				&& user.getPassword2() != null
				&& !user.getPassword2().trim().equals("")
				&& !user.getPassword().trim()
						.equals(user.getPassword2().trim())) {
			// check passwords match if and only if password fields are neither
			// empty nor null
			System.out.println("pwds:" + user.getPassword() + ""
					+ user.getPassword2());
			addActionError("the passwords do not match");

		}

		if (user.getEmail() != null && !user.getEmail().trim().equals("")) {
			/*
			 * check email format if and only if email fields are neither empty
			 * nor null
			 */

			String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			CharSequence inputStr = user.getEmail();
			Pattern pattern = Pattern.compile(expression,
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputStr);
			if (!matcher.matches())

				addActionError("Invalid email address");

		}

	}

	@Override
	public User getModel() {
		user = new User();
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}