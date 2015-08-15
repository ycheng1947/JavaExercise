package com.exercise.json;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JsonSecondObject getJsnSO() {
		return jsnSO;
	}

	public void setJsnSO(JsonSecondObject jsnSO) {
		this.jsnSO = jsnSO;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter and setter

}