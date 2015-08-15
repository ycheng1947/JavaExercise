package com.exercise.json;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
	 
        private int age = 52;

        private String name = "Jim Carrey";

        private JsonFirstObject jsnFO = new JsonFirstObject();

        private ArrayList<String> messages;

        public JsonTest() {

          this.messages = new ArrayList<String>() {

                  {

                            add("Hey, maybe I will give you..");

                            add("Excuse me, I'd like to..");

                            add("Brain freeze. Alrighty Then I just..");

                            }

                  };

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

		public JsonFirstObject getJsnFO() {
			return jsnFO;
		}

		public void setJsnFO(JsonFirstObject jsnFO) {
			this.jsnFO = jsnFO;
		}

		public ArrayList<String> getMessages() {
			return messages;
		}

		public void setMessages(ArrayList<String> messages) {
			this.messages = messages;
		}

        // Getter and setter

}