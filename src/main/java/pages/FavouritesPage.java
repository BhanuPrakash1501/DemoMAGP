package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

import java.util.List;

public class FavouritesPage extends BaseClass {
    private WebDriver _driver;

    public FavouritesPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h6[normalize-space()='Manuals']")
    private WebElement manualsTab;

    @FindBy(xpath = "//a[normalize-space()='Favourites']")
    private WebElement favourites;

    @FindBy(xpath = "//h6[normalize-space()='Tenders']")
    private WebElement tendersTab;

    public WebElement getClickTenderFav() {
        return clickTenderFav;
    }

    @FindBy(xpath = "(//div[@class='card-body an-card']//img[@class='icon me-2'])[1]")
    private WebElement clickTenderFav;


    @FindBy(xpath = "//div[@class='d-flex px-4 py-2 flex-wrap justify-content-between']//h2")
    private List<WebElement> favouritesManualList;

    @FindBy(xpath = "//a[@class='card my-4']")
    private List<WebElement> favouritesTenderList;

    public WebElement getGeneralTab() {
        return generalTab;
    }

    @FindBy(xpath = "//h6[normalize-space()='General']")
    private WebElement generalTab;

    public WebElement getFavourites() {
        return favourites;
    }

    public void clickFavouritesTab() {
        elementClick(getFavourites());
    }

    public List<WebElement> getFavouritesManualListList() {
        return favouritesManualList;
    }

    public List<WebElement> getFavouritesTenderList() {
        return favouritesTenderList;
    }

    public WebElement getManualsTab() {
        return manualsTab;
    }

    public WebElement getTendersTab() {
        return tendersTab;
    }

    public void clickManualTab() {
        scrollToElement(getManualsTab());

    }

    public void clickTenderTab() {
        scrollToElement(getTendersTab());
        clickUsingJavaScript(getTendersTab());

    }

    public void favManualList() {
        int count = getFavouritesManualListList().size();

        if (count > 0) {

            for (int i = 0; i < getFavouritesManualListList().size(); i++) {
                String txt = getFavouritesManualListList().get(i).getText();
                System.out.println(txt);
            }
        } else {
            System.out.println("No Favourites found for Manuals");

        }

    }

    public void favTenderList() {

        int count = getFavouritesTenderList().size();

        if (count > 0) {

            for (int i = 0; i < getFavouritesTenderList().size(); i++) {
                String txt = getFavouritesTenderList().get(i).getText();
                System.out.println(txt);
            }
        } else {
            System.out.println("No Favourites Found for tenders");

        }


    }

    public void clickfavTender() throws InterruptedException {

        scrollToElement(getGeneralTab());
        WebElement expected = findElementByXpath("(//div[@class='card-body an-card']//h1[@class='an-title-text text-black '])[1]");
        String name = elementGetText(expected);
        System.out.println(name);
        String val = getClickTenderFav().getAttribute("src");
        System.out.println(val);
        try{
            if(val.contains("inactive")) {
                clickUsingJavaScript(getClickTenderFav());
            }
        } catch (Exception ignored) {

        }


        elementClick(getFavourites());

        scrollToElement(getTendersTab());
        clickUsingJavaScript(getTendersTab());
        _driver.navigate().refresh();
        clickUsingJavaScript(getTendersTab());
        Thread.sleep(2000);
        List<WebElement> actual = _driver.findElements(By.xpath("//div[@class='d-flex justify-content-between align-items-start']//h2"));

        for (WebElement title : actual) {

            String tenderName = title.getText();
            if (name.contains(tenderName)) {
                System.out.println("passed");
                break;
            } else {
                System.out.println("Failed");
            }
        }


    }


}

