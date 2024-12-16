package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

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
        elementClick(getTendersTab());

    }

}

