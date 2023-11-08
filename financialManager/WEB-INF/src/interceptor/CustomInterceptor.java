package interceptor;

import utils.AccountHelper;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

public class CustomInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory
			.getLogger(CustomInterceptor.class);

	@Override
	public void destroy() {
		log.info("Teste:Destroy");
	}

	@Override
	public void init() {
		log.info("Teste:init");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		log.info("DEVMEDIA::INVOKE BEGIN");

		String result = invocation.invoke();

		AccountHelper.calculate();

		log.info("BALANCE:");
		log.info(String.valueOf(AccountHelper.getBalance()));
		log.info("DEVMEDIA::INVOKE END");

		return result;
	}

}
