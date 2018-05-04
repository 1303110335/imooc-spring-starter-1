package com.imooc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class IMoocExceptionHandler {
	public static final String IMOOC_ERROR_VIEW = "error";
	
	/*@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request, 
			HttpServletResponse response, Exception e) throws Exception {
		e.printStackTrace();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", request.getRequestURL());
		mav.setViewName(IMOOC_ERROR_VIEW);
		return mav;
	}*/

    @ResponseBody
    @ExceptionHandler
    public String processException(Exception e) {
        System.out.println("全局异常处理器捕捉到异常！");
        e.printStackTrace();
        return "异常信息：" + e.getMessage();
    }
}
