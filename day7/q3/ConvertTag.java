package tagpro;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ConvertTag extends SimpleTagSupport
{
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	public void doTag() throws JspException, IOException{
		String word[] = this.val.split(" ");
		String one;
		String two;
		String toggled = "";
		JspContext context = getJspContext();
		for(int i = 0; i<word.length; i++)
		{
			one  = word[i].substring(0,1);
			two = word[i].substring(1);
			toggled += one.toLowerCase()+two.toUpperCase()+" ";
		}
		context.getOut().write(toggled);
	}
}
