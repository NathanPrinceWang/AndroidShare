package AndroidTest;

import java.io.IOException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class test extends UiAutomatorTestCase {
	public void testDemo() throws IOException, UiObjectNotFoundException {

		// 启应用
		Runtime.getRuntime().exec("am start com.dx168.epmyg/com.dx168.epmyg.activity.SplashActivity");
		sleep(10000);

		// 检查是否存在更新提示
		UiObject update_examine_text = new UiObject(new UiSelector().text("有新版本!"));
		// 检查更新弹窗【取消】按钮
		UiObject update_examine_abord = new UiObject(
				new UiSelector().resourceId("com.dx168.epmyg:id/tv_update_dismiss"));

		// 如果存在更新提示，点击【取消】
		if (update_examine_text.exists() == true) {
			update_examine_abord.click();
			System.out.println("点击新版本【取消】按钮");
			sleep(3000);
		}
		UiObject Popup_Close = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/ib_close"));
		if (Popup_Close.exists() == true) {
			Popup_Close.click();
			System.out.println("点击关闭【每日弹窗】");
			sleep(3000);
		}
		UiObject Gesture_guide = new UiObject(new UiSelector().resourceId("android:id/content"));
		UiObject account_detail = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/rl_account_detail"));
		if (Gesture_guide.exists() == true) {
			Gesture_guide.click();
			System.out.println("点击手势引导");
			sleep(3000);
			if (account_detail.exists() == true) {
				account_detail.click();
				System.out.println("点击账户详情手势引导");
				sleep(2000);
				System.out.println("手势引导点击完毕");
			} else {
				System.out.println("账户详情引导不存在--bug");
			}

		}

		// 点击抽屉图标
		UiObject locker = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/btn_slide"));
		locker.click();
		System.out.println("点击抽屉栏图标");
		sleep(2000);
		UiObject version_id = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_version2"));
		String edition_version = version_id.getText();
		System.out.println("当前设备版本号为：" + edition_version);

		// 点击【登录】按钮
		UiObject login = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/btn_login"));
		login.click();
		System.out.println("点击【登录】按钮");
		sleep(2000);

		// 填写交易账号
		UiObject Mid_Account = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/et_account"));
		Mid_Account.click();
		System.out.println("点击中盘登录框");
		sleep(1000);
		Mid_Account.setText("166000000000116");
		System.out.println("完成中盘账号输入");
		sleep(1000);

		// 填写密码
		UiObject Mid_Passwd = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/et_pwd"));
		Mid_Passwd.click();
		System.out.println("点击密码输入框");
		sleep(1000);
		Mid_Passwd.setText("Aa1111111" + "");
		System.out.println("输入密码");
		sleep(5000);
		UiDevice.getInstance().pressBack();

		// 点击【登录】按钮
		UiObject Press_login = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/btn_submit"));
		Press_login.click();
		System.out.println("点击登录按钮");
		sleep(5000);

		// 检查是否有弹窗
		if (Popup_Close.exists() == true) {
			Popup_Close.click();
			System.out.println("判断是否有每日弹窗，如果有点击关闭【每日弹窗】");
			sleep(3000);
		}

		// 点击【开盘】text 防止出现侧边栏导致中断执行
		UiObject Press_Silver_Open = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_silver_open"));
		Press_Silver_Open.click();
		System.out.println("点击侧边栏开盘按钮，这里是防止出现侧边栏出现bug导致无法检查到下面的元素");
		sleep(3000);

		// 点击[粤贵银]
		UiObject Press_YGY = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_tab_01"));
		Press_YGY.click();
		System.out.println("点击【粤贵银】");
		sleep(3000);

		// 点击[粤贵钯]
		UiObject Press_YGBA = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_tab_02"));
		Press_YGBA.click();
		System.out.println("点击【粤贵钯】");
		sleep(3000);

		// 点击[粤贵铂]
		UiObject Press_YGBO = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_tab_03"));
		Press_YGBO.click();
		System.out.println("点击【粤贵铂】");
		sleep(3000);

		// 点击[更多]
		UiObject Press_MORE = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_tab_05"));
		Press_MORE.click();
		System.out.println("点击【更多按钮】");
		sleep(3000);

		// 再次点击首页抽屉图标
		locker.click();
		sleep(2000);

		// 点击[设置]
		UiObject Press_SETTING = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/ll_setting"));
		Press_SETTING.click();
		System.out.println("点击【设置】按钮");
		sleep(3000);

		// 点击[退出登录]
		UiObject Press_LOGOUT = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_login_out"));
		Press_LOGOUT.click();
		System.out.println("点击【退出登录】按钮");
		sleep(3000);

		// 再次点击【开盘】text 防止出现侧边栏导致中断执行
		if (Press_YGY.exists() == false) {
			Press_Silver_Open.click();
			System.out.println("点击【开盘】侧边栏没有自动收起--bug");
			sleep(3000);
		}

		// 点击[粤贵银]
		Press_YGY.click();
		System.out.println("点击粤贵银");
		sleep(3000);

		// 点击[粤贵钯]
		Press_YGBA.click();
		System.out.println("点击粤贵钯");
		sleep(3000);

		// 点击[粤贵铂]
		Press_YGBO.click();
		System.out.println("点击粤贵铂");
		sleep(3000);
		System.out.println("游客状态检查，粤贵银锭是否出现");
		// 点击[粤贵银锭]
		UiObject Press_YGYD = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/tv_tab_04"));
		if (Press_YGYD.exists() == true) {
			Press_YGYD.click();
			sleep(3000);
			System.out.println("点击粤贵银锭完成");
		}
		// 点击[关闭] 关闭开户页面
		UiObject Press_Close = new UiObject(new UiSelector().resourceId("com.dx168.epmyg:id/rl_left"));
		System.out.println("点击关闭开户页面");
		Press_Close.click();
		sleep(3000);

		// 点击[更多]
		Press_MORE.click();
		System.out.println("点击【更多】按钮");
		sleep(3000);

		// 点击抽屉图标
		locker.click();
		System.out.println("点击抽屉栏图标");
		sleep(2000);
		
		System.out.println("本次用例执行完毕");
	}
}