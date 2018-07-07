package com.bm.rra.crm.config;

import org.springframework.util.Assert;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Razdelkin Ruslan
 */
public class TemplateInterceptor extends HandlerInterceptorAdapter
{

	private final static String DEFAULT_VIEW_KEY = "view";
	private final static String DEFAULT_LAYOUT_NAME = "main";

	private String viewKey = DEFAULT_VIEW_KEY;
	private String defaultLayoutName = DEFAULT_LAYOUT_NAME;

	public TemplateInterceptor()
	{

	}

	public TemplateInterceptor(String viewKey, String defaultLayoutName)
	{
		this.viewKey = viewKey;
		this.defaultLayoutName = defaultLayoutName;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
	{

		if (modelAndView == null || !modelAndView.hasView() ||
				isRedirectOrForward(modelAndView.getViewName()))
			return;

		modelAndView.addObject(viewKey, modelAndView.getViewName());
		modelAndView.setViewName(getLayoutName(handler));
	}

	private String getLayoutName(Object handler)
	{
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Layout layout = getMethodOrTypeAnnotation(handlerMethod);
		if (layout == null)
		{
			return this.defaultLayoutName;
		}
		else
		{
			return layout.value();
		}
	}

	private Layout getMethodOrTypeAnnotation(HandlerMethod handlerMethod)
	{
		Layout layout = handlerMethod.getMethodAnnotation(Layout.class);
		if (layout == null)
		{
			return handlerMethod.getBeanType().getAnnotation(Layout.class);
		}
		return layout;
	}

	private boolean isRedirectOrForward(String viewName)
	{
		return viewName.startsWith("redirect:") || viewName.startsWith("forward:");
	}

	public void setViewKey(String viewKey)
	{
		Assert.hasLength(viewKey);
		this.viewKey = viewKey;
	}

	public void setDefaultLayoutName(String defaultLayoutName)
	{
		Assert.hasLength(defaultLayoutName);
		this.defaultLayoutName = defaultLayoutName;
	}
}
