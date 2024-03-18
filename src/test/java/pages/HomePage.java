package pages;


import static constant.constant.clickElement;
import static constant.constant.openUrl;

public class HomePage {

    public static String hamburguer_menu_xpath = "//*[@id='menuToggle']/input";
    public static String signIn_link_LinkText = "Sign In Portal";

    public static void open_url() throws InterruptedException{
        openUrl("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }
    public static void click_hamburguer_menu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            clickElement("xpath",hamburguer_menu_xpath);
        } catch (InterruptedException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
    public static void click_signIn_link() throws InterruptedException {
        try {
            Thread.sleep(2000);
            clickElement("link text",signIn_link_LinkText);
        } catch (InterruptedException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }


}
