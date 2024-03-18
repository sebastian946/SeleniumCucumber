package pages;

import static constant.constant.clickElement;
import static constant.constant.sendKeys;

public class LoginPage {
    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn_xpath ="//*[@id='second_form']/input";
    public static String newregister_btn_id ="NewRegistration";

    public static String send_username = "Scott.gale@gmail.com";
    public static String send_password = "P@sword!";

    public static void sendKeys_username() throws InterruptedException, IllegalAccessException {
        sendKeys("id",username_text_id,send_username);
    }
    public static void sendKeys_password() throws InterruptedException, IllegalAccessException{
        sendKeys("id",password_text_id,send_password);
    }
    public static void click_login_btn() throws IllegalAccessException {
        clickElement("xpath",login_btn_xpath);
    }
    public static void click_newregister_btn() throws InterruptedException, IllegalAccessException {
        clickElement("id",newregister_btn_id);
    }
}
