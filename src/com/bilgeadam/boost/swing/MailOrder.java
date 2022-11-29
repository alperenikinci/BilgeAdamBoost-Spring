package com.bilgeadam.boost.swing;

public class MailOrder implements IOdeme {

	@Override
	public String OdemeYap(Double tutar) {
		return "MailOrder ile " + tutar + " TL ödeme yapıldı...";
	}

}
