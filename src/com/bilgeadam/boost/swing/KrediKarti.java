package com.bilgeadam.boost.swing;

public class KrediKarti implements IOdeme {

	@Override
	public String OdemeYap(Double tutar) {
		return "Kredi Kartı ile " + tutar + " TL ödeme yapıldı...";
	}
}