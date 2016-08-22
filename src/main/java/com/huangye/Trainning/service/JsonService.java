/*package com.huangye.Trainning.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.huangye.Trainning.bean.Json;

import net.sf.json.JSONObject;

public class JsonService {

	public static void main(String[] args) {
		son jsonObj = new Json();

		JSONObject json;

		System.out.println("Convert Java object to JSON format and save to file");

		try (FileWriter writer = new FileWriter("c:\\json-lib.json")) {

		          json = JSONObject.fromObject(jsonObj);

		          json.write(writer);

		} catch (IOException e) {

		}
		
		System.out.println("Read JSON from file, convert JSON string back to object");

		try (BufferedReader reader = new BufferedReader(new FileReader("c:\\json-lib.json"))) {

		          jsonObj = (Json) JSONObject.toBean(JSONObject.fromObject(reader), Json.class);

		} catch (IOException ex) {

		}
	}

}
*/