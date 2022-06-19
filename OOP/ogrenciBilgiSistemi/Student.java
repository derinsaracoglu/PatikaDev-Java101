package ogrenciBilgiSistemi;

public class Student {

	String name;
	int stuNo;
	String classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avarage;
	boolean  isPass;
	
	public Student(String name, int stuNo, String classes, Course mat, Course fizik, Course kimya) {
	
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.avarage = avarage;
	}
	
	public void calcAvarage() {
		this.avarage = (this.mat.note + this.fizik.note + this.kimya.note) / 3;
		
	}
	
	 public void isPass() {
	        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
	            System.out.println("Notlar tam olarak girilmemi�");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.avarage);
	            if (this.isPass) {
	                System.out.println("S�n�f� Ge�ti. ");
	            } else {
	                System.out.println("S�n�fta Kald�.");
	            }
	        }
	    }
	 
	 public void addBulkExamNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }

	        
	    }
	 
	 public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }
	
	public void printNote() {
		System.out.println("=========================");
        System.out.println("��renci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
		
	}
	
	

}
