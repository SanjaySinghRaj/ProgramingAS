package august10;

public class Students {
		String name;
		int number;
		int id;
		int age;
		public Students(String name, int number, int id, int age) {
			super();
			this.name = name;
			this.number = number;
			this.id = id;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Students [name=" + name + ", number=" + number + ", id=" + id + ", age=" + age + "]";
		}
		
}
