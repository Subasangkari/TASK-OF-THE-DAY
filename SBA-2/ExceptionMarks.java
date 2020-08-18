   package sbA;
	class InvalidMarksException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InvalidMarksException() {
		super("Invalid marks");
		}
		}

		class studentMarks
		{
		void stumar(int marks)throws InvalidMarksException
		{
		if(marks>=0 && marks<=100)
			System.out.println(marks +" is a valid marks.");

		else 
			throw new InvalidMarksException();
		}

		}


		public class ExceptionMarks {

		public static void main(String[] args) {
		studentMarks b=new studentMarks();

		try{
		b.stumar(6);
		}
		catch (InvalidMarksException e) {
			e.printStackTrace();
			
		}
		try{
			b.stumar(90);
			}
			catch (InvalidMarksException e) {
				e.printStackTrace();
			}
		studentMarks b1=new studentMarks();
		try{
			b1.stumar(120);
			}
			catch (InvalidMarksException e) {
				e.printStackTrace();
			}
		
		
		}

		}
