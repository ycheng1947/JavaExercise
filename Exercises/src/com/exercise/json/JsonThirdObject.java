package com.exercise.json;

import java.util.ArrayList;
import java.util.List;

public class JsonThirdObject {

	  private int age = 81;
	  
      private String name = "Michael Caine";

      private List<String> messages;

      public JsonThirdObject() {

        this.setMessages(new ArrayList<String>() {

                {

                          add("You wouldn't hit a man with no trousers..");

                          add("At this point, I'd set you up with a..");

                          add("You know, your bobby dangler, giggle stick,..");

                          }

                });

      }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

      // Getter and setter

}

