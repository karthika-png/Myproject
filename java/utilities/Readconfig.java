package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties	pro;
	
public Readconfig()
{
	File src= new File("./Configuration/config.properties");
	try {
		FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
		pro.load(fis);
	}
	catch (Exception e) {
		System.out.println("Exception is" +e.getMessage());
	}
	
	
}

public String getApplicationURL()
{
	String url = pro.getProperty("baseURL");
			return url;
	}

public String getusername()
{
	String un = pro.getProperty("username"); //creating method & storing in a variable
			return un;
	}

public String getpwd()
{
	String pwd = pro.getProperty("password");
			return pwd;
	}

public String getchrome()
{
	String chrome = pro.getProperty("chromepath");
			return chrome;
	}

}
