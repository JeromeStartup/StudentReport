import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
	
	private String name;
	private int adNo;
	private Map<String, Integer> marksMap;
	
	Student(String name,int adNo){
		
		this.name=name;
		this.adNo=adNo;	
		this.marksMap=new HashMap<String, Integer>();
	}
	

	void putMarks(String subject,Integer marks){
		this.marksMap.put(subject, marks);
	}
	int total() {
		int totalMarks = 0;
		for(String itr:this.marksMap.keySet()) {
			totalMarks+=this.marksMap.get(itr);
		}
		return totalMarks;
	}
	
	int average() {
		return this.total()/this.marksMap.size();
	}
	
	void printDetails() {
		System.out.println("Student Name : "+ this.name);
		System.out.println("Admission Number : "+ this.adNo);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Subject \t\t"+"Marks");
		
		for(String itr:this.marksMap.keySet()) {
			System.out.println(itr+"\t\t\t"+this.marksMap.get(itr));
		}
		System.out.println("_________________________________");
		System.out.println("Total Marks : \t\t" + this.total());
		System.out.println("Average Marks :\t\t"+this.average());
		System.out.println("_________________________________");
		
		
	}
	
	String printDetailsString() {
		String str="";

		str+="Student Name : "+ this.name+"\n";
		str+="Admission Number : "+ this.adNo +"\n";
		str+="-----------------------------------------------";
		
		str+="Subject \t\t"+"Marks"+"\n";
		
		for(String itr:this.marksMap.keySet()) {
			str+=itr+"\t\t\t"+this.marksMap.get(itr)+"\n";
		}
		str+="_________________________________";
		str+="Total Marks : \t\t" + this.total()+"\n";
		str+="Average Marks :\t\t"+this.average()+"\n";
		str+="_________________________________";
		return str;
		
	}
	
	String printJSON() {
		String str="{";
		str+="studentName : "+ this.name+",";
		str+="admissionNumber :"+ this.adNo+",";
		str+="}";
		
		return str;
	}
	
	
	
	

}
