public class Main {


	public static void main(String[] args) {
		
		Student ram= new Student("Ram",1234);
		
		ram.putMarks("science",67);
		ram.putMarks("Maths", 78);
		ram.putMarks("English", 90);
		
		ram.printDetails();
		
		System.out.println(ram.printJSON());

	}

}
