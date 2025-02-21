package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

import java.util.List;

public class FavouritesPage extends BaseClass {
    // WebDriver instance for interacting with the browser
    private WebDriver _driver;

    public FavouritesPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Locates the "Manuals" tab in the UI
    @FindBy(xpath = "//h6[normalize-space()='Manuals']")
    private WebElement manualsTab;

    // Locates the "Favourites" section link in the UI
    @FindBy(xpath = "//a[normalize-space()='Favourites']")
    private WebElement favourites;

    // Locates the "Tenders" tab in the UI
    @FindBy(xpath = "//h6[normalize-space()='Tenders']")
    private WebElement tendersTab;

    // Getter method to retrieve the WebElement representing the tender favorite button
    public WebElement getClickTenderFav() {
        return clickTenderFav;
    }

    // Locates the favorite button/icon for a tender in the UI
    @FindBy(xpath = "(//div[@class='card-body an-card']//img[@class='icon me-2'])[1]")
    private WebElement clickTenderFav;

    // Locates the list of favorite manuals displayed on the page
    @FindBy(xpath = "//div[@class='d-flex px-4 py-2 flex-wrap justify-content-between']//h2")
    private List<WebElement> favouritesManualList;

    // Locates the list of favorite tenders displayed on the page
    @FindBy(xpath = "//a[@class='card my-4']")
    private List<WebElement> favouritesTenderList;

    // Getter method to retrieve the WebElement representing the "General" tab
    public WebElement getGeneralTab() {
        return generalTab;
    }

    // Locates the "General" tab in the UI
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

    // Scrolls to the "Manuals" tab on the page
    public void clickManualTab() {
        scrollToElement(getManualsTab());
    }

    // Scrolls to the "Tenders" tab and clicks it using JavaScript
    public void clickTenderTab() {
        scrollToElement(getTendersTab());
        clickUsingJavaScript(getTendersTab());
    }

    // Prints the list of favorite manuals if available, otherwise prints a message indicating no favorites
    public void favManualList() {
        int count = getFavouritesManualListList().size();

        if (count > 0) {
            // Iterates through the list of favorite manuals and prints their text
            for (int i = 0; i < getFavouritesManualListList().size(); i++) {
                String txt = getFavouritesManualListList().get(i).getText();
                System.out.println(txt);
            }
        } else {
            System.out.println("No Favourites found for Manuals");
        }
    }

    // Prints the list of favorite tenders if available, otherwise prints a message indicating no favorites
    public void favTenderList() {
        int count = getFavouritesTenderList().size();

        if (count > 0) {
            // Iterates through the list of favorite tenders and prints their text
            for (int i = 0; i < getFavouritesTenderList().size(); i++) {
                String txt = getFavouritesTenderList().get(i).getText();
                System.out.println(txt);
            }
        } else {
            System.out.println("No Favourites Found for tenders");
        }
    }

    // Clicks on a favorite tender and verifies if it appears in the favorites list
    public void clickfavTender() throws InterruptedException {
        // Scrolls to the "General" tab
        scrollToElement(getGeneralTab());

        // Finds the first tender element and retrieves its name
        WebElement expected = findElementByXpath("(//div[@class='card-body an-card']//h1[@class='an-title-text text-black '])[1]");
        String name = elementGetText(expected);
        System.out.println(name);

        // Retrieves the source attribute of the favorite tender icon
        String val = getClickTenderFav().getAttribute("src");
        System.out.println(val);

        try {
            // Clicks the favorite button if the icon is inactive
            if (val.contains("inactive")) {
                clickUsingJavaScript(getClickTenderFav());
            }
        } catch (Exception ignored) {
            // Exception is ignored to handle cases where the button might not be interactable
        }

        // Clicks on the "Favourites" section
        elementClick(getFavourites());

        // Scrolls to the "Tenders" tab and clicks it to navigate to the tenders section
        scrollToElement(getTendersTab());
        clickUsingJavaScript(getTendersTab());

        // Refreshes the page and clicks on the "Tenders" tab again to ensure data is loaded
        _driver.navigate().refresh();
        clickUsingJavaScript(getTendersTab());
        Thread.sleep(2000);

        // Retrieves the list of tenders displayed after refresh
        List<WebElement> actual = _driver.findElements(By.xpath("//div[@class='d-flex justify-content-between align-items-start']//h2"));

        // Verifies if the selected tender appears in the favorites list
        for (WebElement title : actual) {
            String tenderName = title.getText();
            if (name.contains(tenderName)) {
                System.out.println("Passed");
                break;
            } else {
                System.out.println("Failed");
            }
        }
    }



}

