package com.yash.springiocAssignment6;

public class Engine {
	private String  engineType;
	private String enginePower; 
	private String engineName;
	
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public Engine(String engineType, String enginePower, String engineName) {
		super();
		this.engineType = engineType;
		this.enginePower = enginePower;
		this.engineName = engineName;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", enginePower=" + enginePower + ", engineName=" + engineName + "]";
	}

	
}
