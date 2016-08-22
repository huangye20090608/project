/**
 * 
 */
package com.huangye.Trainning.enumService;

/**
 * @author huangye
 *
 */
public enum EnumDemo {
	
	MALLL1("1","1"),
	MALLLE2("2","2"),
	MALLLR3("3","3"),
	MALLLT4("4","4"),
	MALLLY5("5","5"),
	MALLLU6("6","6");
	
//	TITLE("TITLE","标题相关"),
//    TRADE("TRADE","交易相关"),
//    DOMAIN("DOMAIN","域名相关"),
//    SYSTEM("SYSTEM","系统相关"),
//    PAYMENT("PAYMENT","交易相关"),
//    COPYRIGHT("COPYRIGHT","版权相关"),
//    MALL("MALL","商城相关");
	
	
	private EnumDemo(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
