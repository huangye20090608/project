package com.huangye.Trainning.bean;

import java.util.ArrayList;
import java.util.List;

public class JsonFirstObject {
	private int age = 76;

	private String name = "Morgan Freeman";

	private JsonSecondObject jsnSO = new JsonSecondObject();

	private List<String> messages;

	public JsonFirstObject() {

		this.messages = new ArrayList<String>() {

			{

				add("I once heard a wise man say..");

				add("Well, what is it today? More..");

				add("Bruce... I'm God. Circumstances have..");

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

	private JsonSecondObject getJsnSO() {
		return jsnSO;
	}

	private void setJsnSO(JsonSecondObject jsnSO) {
		this.jsnSO = jsnSO;
	}

}
