package com.dayseven.Artify;

public interface IPurchasable {
	boolean purchase(Buyer buyer);

	void license(LicenseType licenseType);
}
