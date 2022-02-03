package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class AutoQuote extends BaseClass {
	@Test
	public void finalTest() throws InterruptedException {
		productPages.autoFieldMethod(cm);
		Thread.sleep(3000);
		productPages.zipCodeFieldMethod(cm);
		Thread.sleep(3000);
        productPages.getQuoteButtonMethod(cm);
		Thread.sleep(3000);
		productPages.zipCodeBoxMethod(cm);
		Thread.sleep(3000);
		productPages.startMyQuoteTabMethod(cm);
		Thread.sleep(3000);
	}

}
