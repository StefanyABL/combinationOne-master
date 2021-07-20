package edu.uptc.combinations.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uptc.combination.model.AnalysisCombination;

public class AnalysisCombinationTest {
	 private AnalysisCombination ac;
	 private void  setupEscenarieOne(){
		 ac= new AnalysisCombination ((short)4,(short) 2);
	 }
	@Test
	public void testCalcCombination() {
		setupEscenarieOne();
		assertEquals (6,ac.calcCombination());
		ac.setNumberElemnts((short)5);
		//assertEquals (6, ac.calcCombination());
	}

}
