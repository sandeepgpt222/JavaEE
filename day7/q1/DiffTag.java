package tagpro;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DiffTag extends SimpleTagSupport
{
	private int first;
	private int second;
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void doTag() throws JspException, IOException {
		int diff = this.first-this.second;
		getJspContext().getOut().write("Difference is : " + diff);
	}
}
