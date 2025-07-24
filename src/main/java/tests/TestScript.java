public class TestScript {
    public static void main(String[] args) {
        // Set up WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Print page title
        System.out.println("Page title is: " + driver.getTitle());
        
        // Close the browser
        driver.quit();
    }
}
