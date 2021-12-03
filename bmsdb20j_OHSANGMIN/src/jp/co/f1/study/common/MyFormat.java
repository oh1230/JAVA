package jp.co.f1.study.common;

import java.text.DecimalFormat;

public class MyFormat {
	
	public String moneyFormat (int price) {
		DecimalFormat df = new DecimalFormat("\u00A5###,##0.00");
		return df.format(price);
	}

}
