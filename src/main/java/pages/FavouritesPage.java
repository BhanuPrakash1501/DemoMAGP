package pages;


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

    @FindBy(xpath = "//h6[normalize-space()='Tenders']")
    private WebElement tendersTab;

    @FindBy(xpath = "//div[@class='d-flex px-4 py-2 flex-wrap justify-content-between']//h2")
    private List<WebElement> favouritesManualList;

    @FindBy(xpath = "//div[@class='card-body an-card']//div[@class='d-flex justify-content-between align-items-start']/h2")
    private List<WebElement> favouritesTenderList;

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


}

