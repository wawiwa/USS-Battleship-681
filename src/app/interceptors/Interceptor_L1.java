package app.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptor_L1 extends ActionSupport implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() is called...");	
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println(" init() is called...");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" ready to go1");
		Map<String,Object> sessionAttributes=invocation.getInvocationContext().getSession();
		if(sessionAttributes==null||sessionAttributes.get("logedin")==null){
			return "log_in";
		}else{
			if(!((String)sessionAttributes.get("logedin")).equals(null)){
				System.out.println(" ready to go2");
				addActionMessage("Log in successfull!");//can go away. along with actionsupport
				return invocation.invoke();
			}else{
				return "log_in";
			}
		}
		
	}

}