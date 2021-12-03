package util;

import java.text.DecimalFormat;

public class MyFormat {

	public String moneyFormat (int price) {

		DecimalFormat df = new DecimalFormat("#,##0.##");
		String yen = "\\" + df.format(price);

		return yen;
	}

}
