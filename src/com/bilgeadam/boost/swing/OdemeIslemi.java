package com.bilgeadam.boost.swing;

public class OdemeIslemi {

	private KrediKarti krediKarti;
	
	public OdemeIslemi(KrediKarti krediKarti) {
		this.krediKarti = krediKarti;
	}

	public String Ode (double tutar) {
		return krediKarti.OdemeYap(tutar);
	}
}

