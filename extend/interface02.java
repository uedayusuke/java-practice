package extend;

import extend.phone.MobilePhone;

//13章【継承を理解しよう】
public class interface02 {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		mobilePhone.powerOff();
	}
}
