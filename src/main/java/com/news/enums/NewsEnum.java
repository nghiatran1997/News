package com.news.enums;

public class NewsEnum {
	
	public static enum CATEGORY {
		
		FINANCE(1,"Tài chính","FINANCE"),
		WOLRD(2,"Thế giới","WOLRD"),
		GOODS(3,"Hàng hóa","GOODS"),
		FOREX(4,"Forex","FOREX");
				
		private int code;
		private String display;
		private String name;
		
		private CATEGORY(int code, String display, String name) {
			this.code = code;
			this.display = display;
			this.name = name;
		}

		public int getCode() {
			return code;
		}

		public String getDisplay() {
			return display;
		}

		public String getName() {
			return name;
		}
		
		
	}
	
	public static enum SUBSTANCE {
		
		MAIN_TITLE(1,"Main tilte","MTITLE"),
		SUB_TITLE(2,"Title","STITLE"),
		MAIN_IMAGE(3,"Main image","MIMAGE"),
		SUB_IMAGE(4,"Sub image","SIMAGE"),
		CONTENT(5,"Content","CONTENT"),
		FOOTER(6,"Footer","FOOTER");
				
		private int code;
		private String display;
		private String name;
		
		private SUBSTANCE(int code, String display, String name) {
			this.code = code;
			this.display = display;
			this.name = name;
		}

		public int getCode() {
			return code;
		}

		public String getDisplay() {
			return display;
		}

		public String getName() {
			return name;
		}
		
		
		
	}
	
	
}
