package zjoy.research.design_pattern.single_pattern;


public enum SinglePatternWithEnum {

	one("1"),two,three;
	
	private String number;
	
	private SinglePatternWithEnum(){
		
	}
	
	private SinglePatternWithEnum(String number){
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	
}
