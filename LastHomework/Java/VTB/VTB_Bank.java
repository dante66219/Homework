package VTB;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class VTB_Bank {

    @Test
    public void test1() {
        Double Text;

        VTB_LessThan3 bank = open("https://www.vtb.ru/personal/platezhi-i-perevody/obmen-valjuty/", VTB_LessThan3.class);
        Configuration.holdBrowserOpen = true;

        String cash = bank.RurUsdSell("500");
        Double cash1 = bank.checkCourseRurUsdSell(500);

        Text = Double.parseDouble(cash);


        System.out.println(Text + " RUR - при покупке 500$");
        System.out.println(bank.CostOneDollarRurUsdSell() + " - Стоимость 1$ при покупке");
        System.out.println(cash1 + " ");

        // Сравниваем работу калькулятора

        Assert.assertTrue(Text.equals(cash1));
    }

    @Test
    public void test2() {
        Double Text;

        VTB_LessThan3 bank = new VTB_LessThan3();

        String cash = bank.RurUsdBuy("500");
        Double cash1 = bank.checkCourseRurRurUsdBuy(500);

        Text = Double.parseDouble(cash);


        System.out.println(Text + " RUR - при продаже 500$");
        System.out.println(bank.CostOneDollarRurUsdBuy() + " RUR - Стоимость 1$ при продаже");


        Assert.assertTrue(Text.equals(cash1));
    }

    @Test
    public void test3()
    {
        Double Text;

        VTB_Over3 bank = new VTB_Over3();

        String page = bank.RurUsdSell("30000");
        Text = Double.parseDouble(page);


        System.out.println(Text + " RUR - после покупки 30000$");
        System.out.println(bank.CostOneDollarRurUsdSell() + " RUR - Стоимость 1$ при покупке");


        Assert.assertTrue(Text.equals(bank.checkCourseRurUsdSell()));
    }

    @Test
    public void test4() {
        Double Text;

        VTB_Over3 bank = new VTB_Over3();
        String page = bank.RurUsdBuy("30000");

        Text = Double.parseDouble(page);
        System.out.println(Text + " RUR - при продаже 500$");
        System.out.println(bank.CostOneDollarRurUsdBuy() + " RUR - Стоимость 1$ при продаже" );


        Assert.assertTrue(Text.equals(bank.checkCourseRurRurUsdBuy()));

        Configuration.holdBrowserOpen = false;
    }



}
