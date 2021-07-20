package edu.uptc.combination.model;

public class RunConbinations {
	public static void main (String [] args ){
		
		
		AnalysisCombination  ac = new AnalysisCombination  ((short)6, (short)2);
		System.out.println(ac.calcCombination ());
		ac.setGroups((short)0);
		System.out.println("fin");
		
	}


}
