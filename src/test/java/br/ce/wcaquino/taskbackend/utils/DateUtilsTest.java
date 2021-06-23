package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	/*
	 * Cenário 1:
	* */
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2022, 12, 5);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	/*
	 * Cenário 2:
	* */
	@Test
	public void deveRetornarTrueParaDatasPassadas() {
		LocalDate date = LocalDate.of(2020, 12, 5);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	}
	
	/*
	 * Cenário 3:
	* */
	@Test
	public void deveRetornarTrueParaDataAtual() {
		LocalDate date = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
}
