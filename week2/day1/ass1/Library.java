package week2.day1.ass1;

public class Library {

	public String addBook(String bookTitle){
		System.out.println("The book title is "+bookTitle);
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook(){
		System.out.println("Book issued successfully");
		
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Library lb = new Library();
		lb.addBook("Ikigai");
		lb.issueBook();
		

	}

}
