
	package actions;

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;

	public interface actionsinterface {
		
		//Added all user actions abstract methods to achieve Abstraction  
			public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);
			public void click(By by, WebDriver driver);
//			public boolean isDisplayed(By by, ThreadLocal<RemoteWebDriver> driver);
			public boolean type(By by , WebDriver driver, String text);
			public boolean findElement(By by,WebDriver driver);
			public  List<WebElement> findElements(By by, WebDriver driver);
//			public boolean isSelected(By by, ThreadLocal<RemoteWebDriver> driver);
			public boolean isEnabled(By by, WebDriver driver);
			public boolean selectBySendkeys(String value,By by);
			public boolean selectByIndex(WebElement element, int index);
			public boolean selectByValue(WebElement element,String value);
			public boolean selectByVisibleText(String visibletext, WebElement ele);
			public boolean mouseHoverByJavaScript(WebElement locator);
			public boolean JSClick(WebDriver driver, WebElement ele) throws Exception;
			public boolean switchToFrameByIndex(WebDriver driver,int index);
			public boolean switchToFrameById(WebDriver driver,String idValue);
			public boolean switchToFrameByName(WebDriver driver,String nameValue);
			public boolean switchToDefaultFrame(WebDriver driver);
			public void mouseOverElement(WebDriver driver,WebElement element);
			public boolean moveToElement(WebDriver driver, WebElement ele);
			public boolean mouseover(WebDriver driver, WebElement ele);
			public boolean draggable(WebDriver driver,WebElement source, int x, int y);
			public boolean draganddrop(WebDriver driver,WebElement source, WebElement target);
			public boolean slider(WebDriver driver,WebElement ele, int x, int y);
			public boolean rightclick(WebDriver driver,WebElement ele);
			public boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count);
			public boolean switchToNewWindow(WebDriver driver);
			public boolean switchToOldWindow(WebDriver driver);
			public int getColumncount(WebElement row);
			public int getRowCount(WebElement table);
			public boolean Alert(WebDriver driver);
			public boolean launchUrl(WebDriver driver,String url);
			public boolean isAlertPresent(WebDriver driver);
			public String getCurrentURL(WebDriver driver);
			public String getTitle(WebDriver driver);
			public String getText(By by,WebDriver driver); // i edit
			public boolean click1(WebElement locator, String locatorName);
			public void fluentWait(WebDriver driver,WebElement element, int timeOut);
			public void implicitWait(WebDriver driver, int timeOut);
			public void explicitWait(WebDriver driver, WebElement element, int timeOut);
			public void pageLoadTimeOut(WebDriver driver, int timeOut);
			public void screenShot(WebDriver driver, String filename);
			public byte[] screenShotAllure(WebDriver driver);
			public String getCurrentTime();
			public void clear(By by, WebDriver driver);
			public String getPlaceholderAttribute(By by, WebDriver driver);


	}

