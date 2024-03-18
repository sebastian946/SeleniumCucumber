package pages;


import static constant.constant.assertContent;

public class LogininPage {
    public static String productcateogry_formalshoes = "//*[text()='Formal Shoes']";

    public static String productcateogry_sportsshoes = "//*[text()='Sports']";

    public static String productcateogry_sneakers = "//*[text()='Sneakers']";

    public static void visibility_product_formalshoes() throws InterruptedException, IllegalAccessException {
        assertContent("Formal Shoes",productcateogry_formalshoes,"xpath");
    }
    public static void visibility_product_sportshoes() throws InterruptedException, IllegalAccessException{
        assertContent("Sports",productcateogry_sportsshoes,"xpath");
    }
    public static void visibility_product_sneakers() throws InterruptedException, IllegalAccessException{
        assertContent("Sneakers",productcateogry_sneakers,"xpath");
    }
}
