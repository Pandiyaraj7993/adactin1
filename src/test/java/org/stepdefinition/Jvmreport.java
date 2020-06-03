package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
	public static void generateJvmReports(String json) {
		File f =new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\jvmreport");
		Configuration con =new Configuration(f, "Adactin Hotel");
		con.addClassifications("Platform", "Window");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser Version", "83.0");
		con.addClassifications("Sprint", "19");
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(json);
		ReportBuilder report= new ReportBuilder(jsonFiles,con);
		report.generateReports();
		
		
		
	}

}
