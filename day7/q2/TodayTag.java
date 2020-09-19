package tagpro;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TodayTag extends SimpleTagSupport{
	public void doTag() throws JspException, IOException{
		JspContext context = getJspContext();
		Date d = new Date();
		context.getOut().write("Today is : " + d.toString());
	}
}
