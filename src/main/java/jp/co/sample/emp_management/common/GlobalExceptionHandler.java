package jp.co.sample.emp_management.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * エラーページへの遷移.
 * 
 * @author yuyayokoyama
 *
 */
@Component
public class GlobalExceptionHandler implements HandlerExceptionResolver{

	
	private static final Logger LOGGER
	= LoggerFactory.getLogger(GlobalExceptionHandler.class);

	
	@Override
	public ModelAndView resolveException(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object obj, 
			Exception e) {
		LOGGER.error("システムエラーが発生しました！", e);
		return null; // ←500エラーが発生したら自動的にerror/500.htmlに遷移してくれる
	}
}
