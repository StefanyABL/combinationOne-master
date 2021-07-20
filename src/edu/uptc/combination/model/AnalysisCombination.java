package edu.uptc.combination.model;

public class AnalysisCombination {
	
	short numberElemnts;
	short groups;
		
	public void AnalysisCombination(){
		
	}
	public AnalysisCombination(short numberElemnts, short groups) {
		this.numberElemnts = numberElemnts;
		this.groups = groups;
		calcAsserts();
	}
	public short getNumberElemnts() {
		return numberElemnts;
	}
	public void setNumberElemnts(short numberElemnts) {
		this.numberElemnts = numberElemnts;
		calcAsserts();
	}
	public short getGroups() {
		return groups;
	}
	public void setGroups(short groups) {
		this.groups =groups ;
		calcAsserts();
	}
	private long calcFactorial  (short a){
		long facto= 1;
		while (a!=0) {
			facto= facto*a;
			a--;
		
		}
	
		return facto;
	}
	public short   calcCombination(){
		short combination = (short)(calcFactorial(numberElemnts)/(calcFactorial(groups)*calcFactorial((short)(numberElemnts-groups))));
		return  combination;
	}
	private void  calcAsserts (){
		assert numberElemnts>0:"número de elemntos inválido";
		assert groups>0:"número de grupos inválidos";
		
	}

}
