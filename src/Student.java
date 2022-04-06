public class Student extends Person {
	private String RALC;
	public String getRALC(){
		return this.RALC;
	}
	public void setRALC(String RALC){
		this.RALC = RALC;
	}
	public Student(String name, String surname, String RALC) {
		super(name, surname);
		this.setRALC(RALC);
	}

	// abstract void breathe(){
	// 	System.out.println('NO');
	// }

	public String showInfo(){
		return "Les dades son: "+this.getName()+" "+this.getSurname()+" "+this.getRALC();
	}
	@Override
	void breathe() {
		System.out.println("NO");
		
	}
}
