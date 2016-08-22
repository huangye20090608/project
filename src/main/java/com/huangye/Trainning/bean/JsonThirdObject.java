package com.huangye.Trainning.bean;

import java.util.ArrayList;
import java.util.List;

public class JsonThirdObject {
	private int age = 81;

	private String name = "Michael Caine";

	private List<String> messages;

	public JsonThirdObject() {

		this.messages = new ArrayList<String>() {

			{

				add("You wouldn't hit a man with no trousers..");

				add("At this point, I'd set you up with a..");

				add("You know, your bobby dangler, giggle stick,..");

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

}