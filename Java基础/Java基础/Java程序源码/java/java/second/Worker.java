package second;

import java.util.List;

public class Worker {
		
		private String name;
		private int age;
		private double salary;
		
		 

		public Worker(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
			
		}

		@Override
		public String toString() {
			return "Worker [name=" + name + ", age=" + age + ", salary="
					+ salary + "]";
		}

		
		
		 
}
