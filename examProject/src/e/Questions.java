package e;

import java.util.Arrays;

public class Questions
{	private String que;
private String option;
private String answ;

public String getOption() {
	return option;
}

public void setOption(String option) {
	this.option = option;
}

public String getAnsw() {
	return answ;
}

public void setAnsw(String answ) {
	this.answ = answ;
}

public String getQue() {
	return que;
}

public void setQue(String que) {
	this.que = que;
}

public Questions(String que,String option, String answ) {
	super();
	this.que = que;
	this.option=option;
	this.answ = answ;
	
}


}
