
public class BDD {
	public void Login() throws IOException

	{

	Properties prop=new Properties();

	FileInputStream fis=new FileInputStream("C:\\Workspace\\Framework\\src\\testngFiles\\datadriven.properties");

	prop.load(fis);

	System.out.println(prop.getProperty("username"));

	if(prop.getProperty("browser").equals("firefox"))

	{

	driver =new FirefoxDriver();

	}

	else if(prop.getProperty("browser").equals("chrome"))

	{

	driver =new ChromeDriver();

	}

	else

	{

	driver =new InternetExplorerDriver();

	}

	driver.get(prop.getProperty("url"));

	driver.findElement(By.xpath:').sendkeys(username)

	}
}
