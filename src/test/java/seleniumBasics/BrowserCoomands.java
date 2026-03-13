package seleniumBasics;

public class BrowserCoomands extends Base {

	
	public void verifyBrowserCommands() {
		
	//	System.out.println(driver.getTitle());
		String Title= driver.getTitle();
		System.out.println(Title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
		public void verifyNavigationCommands() {
			driver.navigate().to("https://www.amazon.in/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
			
			
			
			
		}
		
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCoomands browser = new BrowserCoomands();
		browser.initilizeBrowser();
		browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
	//	browser.closeAndQuit();
	}

}
