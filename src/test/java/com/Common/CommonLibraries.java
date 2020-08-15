package com.Common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import com.Pojo.PublisherIdBook_Pojo;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

public class CommonLibraries {
	
	static Properties Pro = new Properties();

	public static String File_Reader(String Filepath) {
		String strLine = "";
		try {
			FileInputStream fstream = new FileInputStream(Filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				System.out.println(strLine);
			}

			// Close the input stream
			fstream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strLine;

	}

	public static String Read_JSON_Request(String Requestpath) {
		String Request = "";
		try {
			Request = FileUtils.readFileToString(
					new File(".\\src\\test\\resources\\JSONRequest\\" + Requestpath.trim() + ".json"),
					StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Request;
	};

	public static Response JSON_POST(String Request, String Endpoint, Headers headers) {

		Response response = RestAssured.given().headers(headers).body(Request).post(Endpoint);
		System.out.println(response.asString());
		return response;

	}

	public static String Read_Endpoint(String Key) {
		String Value = "";
		try {
			FileReader reader = new FileReader(".\\src\\test\\resources\\EndPointConfig.Properties");
			Pro = new Properties();
			Pro.load(reader);
			Value = Pro.getProperty(Key);
			System.out.println("URL-------> " + Value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Value.trim();

	}

	public static Headers Commom_Headers() {
		Header Head1 = new Header("Content-Type", "application/json");
		Header Head2 = new Header("Host", "DESKTOP-VITDB25");
		List<Header> Headerlist = new ArrayList<Header>();
		Headerlist.add(Head1);
		Headerlist.add(Head2);
		Headers headerparams = new Headers(Headerlist);
		return headerparams;

	}

	public static Headers GetBook_Headers() {
		Header Head1 = new Header("Content-Type", "application/json");
		List<Header> Headerlist = new ArrayList<Header>();
		Headerlist.add(Head1);
		Headers headerparams = new Headers(Headerlist);
		return headerparams;

	}

	public String getReportConfigPath() {
		String reportConfigPath = Pro.getProperty("ReportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key: "
							+ reportConfigPath);
	}

	public static String Read_Excel(String Excel, String column) {
		String ExcelValue = "";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(".\\src\\test\\resources\\TestData\\" + Excel + ".xlsx");
			String strQuery = "Select * from Sheet1";
			Recordset recordset = connection.executeQuery(strQuery);

			while (recordset.next()) {
				ExcelValue = recordset.getField(column);
			}

			recordset.close();
			connection.close();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ExcelValue;

	}

	public static Response JSON_GET(String Endpoint, Headers headers, String Key, String value) {

		Response response = RestAssured.given().queryParam(Key, value).headers(headers).get(Endpoint);
		System.out.println(response.asString());
		return response;

	}

	public static Response JSON_GET(String Endpoint, Headers headers) {

		Response response = RestAssured.given().headers(headers).get(Endpoint);
		System.out.println(response.asString());
		return response;

	}

	public static String Simple_Date(String dateformat) {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(dateformat);
		String strDate = formatter.format(date);
		System.out.println(strDate);
		return strDate;

	}
	
	public static Response JSON_Delete(String Endpoint, Headers headers, String Key, String value) {
		Response response = RestAssured.given().queryParam(Key, value).headers(headers).delete(Endpoint);
		System.out.println(response.asString());
		return response;
	}


}
