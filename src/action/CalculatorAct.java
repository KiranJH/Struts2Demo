package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;

public class CalculatorAct extends ActionSupport {
	
	private int fn;
	private int sn;
	private int re;
	
	public int getFn() {
		return fn;
	}
	@IntRangeFieldValidator(max="99999", min="1",message="first number should be between 1 to 99999")
	public void setFn(int fn) {
		this.fn = fn;
		System.out.println("setting fn " +getFn());
	}
	public int getSn() {
		return sn;
	}
	@IntRangeFieldValidator(max="99999", min="1",message="second number should be between 1 to 99999")
	public void setSn(int sn) {
		this.sn = sn;
		System.out.println("setting sn " +getSn());
	}
	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
	}
	
	
	public String add() throws Exception {
		re=fn+sn;
		return "success";
	}
	
	public String sub() throws Exception {
		re=fn-sn;
		return "success";
	}
	public String mul() throws Exception {
		re=fn*sn;
		return "success";
	}
	public String div() throws Exception {
		re=fn/sn;
		return "success";
	}


}
