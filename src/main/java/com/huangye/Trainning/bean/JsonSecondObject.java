package com.huangye.Trainning.bean;

import java.util.ArrayList;
import java.util.List;

public class JsonSecondObject {

	private int age = 83;

	private String name = "Clint Eastwood";

	private JsonThirdObject jsnTO = new JsonThirdObject();

	private List<String> messages;

	public JsonSecondObject() {

		this.messages = new ArrayList<String>() {

			{

				add("This is the AK-47 assault..");

				add("Are you feeling lucky..");

				add("When a naked man's chasing a..");

			}

		};

	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private List<String> getMessages() {
		return messages;
	}

	private void setMessages(List<String> messages) {
		this.messages = messages;
	}

	private JsonThirdObject getJsnTO() {
		return jsnTO;
	}

	private void setJsnTO(JsonThirdObject jsnTO) {
		this.jsnTO = jsnTO;
	}

}
