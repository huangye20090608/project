package com.huangye.Trainning.bean;

import java.util.ArrayList;
import java.util.List;

public class Json {

	private int age = 52;

	private String name = "Jim Carrey";

	private JsonFirstObject jsnFO = new JsonFirstObject();

	private List<String> messages;

	public Json() {

		this.messages = new ArrayList<String>() {

			{

				add("Hey, maybe I will give you..");

				add("Excuse me, I'd like to..");

				add("Brain freeze. Alrighty Then I just..");

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

	private JsonFirstObject getJsnFO() {
		return jsnFO;
	}

	private void setJsnFO(JsonFirstObject jsnFO) {
		this.jsnFO = jsnFO;
	}

}
