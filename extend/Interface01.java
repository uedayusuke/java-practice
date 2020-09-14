package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	// 13章【継承を理解しよう】
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

		System.out.println("原話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
		mobilePhone.call("99-8888-7777");
		Interface01.classTakePicture(mobilePhone);
	}

	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}
}
