package com.example.demo.copy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyController {

	@RequestMapping("/copy")
	public String moveFile() {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "fileCopyApplicationContext.xml");
        try {            
            try {
				Thread.sleep(2000);
				System.out.println("copying from -- " + System.getProperty("user.dir") + "/output/fileToCopy.properties");
				Properties prop = new Properties();
	            FileInputStream is = new FileInputStream(new File(System.getProperty("user.dir") + "/output/fileToCopy.properties"));
	            prop.load(is);
	            System.out.println(prop);
			} catch (Exception e) {
				e.printStackTrace();
			}
           
        } finally {
            context.close();
        }
		return "copying a file..!!";
		
	
	}
	
}
