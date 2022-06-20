package maasHesaplayici;

public class Employee {

	String name; // �al��an ad soyad
	double salary; // �al��an maa�
	int workHours; // Haftal�k �al��ma Saati
	int hireYear; // ��e Ba�lang�� Y�l�

	public Employee(String name, double d, int workHours, int hireYear) {

		this.name = name;
		this.salary = d;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (salary < 1000) {
			return salary;
		} else {
			double tax = salary * 0.03;
			return tax;
		}
	}

	public int bonus() {
		if (workHours > 40) {
			int bonus = (workHours - 40) * 30;
			return bonus;
		}
		return 0;
	}

	public double raiseSalary() {
		if (hireYear <= 0 || hireYear >= 2021) {
			System.out.println("Ge�ersiz y�l. L�tfen Tekrar Giriniz.");
		} else {
			int farkYil = 2021 - hireYear;
			double zam;

			if (farkYil > 0 && farkYil < 10) {
				zam = salary * 0.05;
				return zam;
			} else if (farkYil > 9 && farkYil < 20) {
				zam = salary * 0.1;
				return zam;
			} else if (farkYil > 19) {
				zam = salary * 0.15;
				return zam;
			} else if (farkYil == 0) {
				return 0;
			}
		}

		return 0;
	}

	public String toString() {

		double total = salary - tax() + bonus() + raiseSalary();
		double tot = salary + bonus() - tax();
		System.out.println("Ad� : " + name);
		System.out.println("Maa�� : " + salary);
		System.out.println("�al��ma Saati : " + workHours);
		System.out.println("Ba�lang�� Y�l� : " + hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maa� art��� : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maa� : " + tot);
		System.out.println("Toplam Maa� : " + total);

		return null;
	}
}
