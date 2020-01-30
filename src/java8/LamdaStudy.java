package java8;

public class LamdaStudy {
		public static void main(String[] args) {
			
			LamdaStudy test = new LamdaStudy();
			
			MathOperation addition = new MathOperation() {
				@Override
				public int operation(int a, int b) {
					// TODO Auto-generated method stub
					return a+b;
				}
			};
			//type Á¸Àç
			MathOperation additionLamda = (int x,int y) -> x+y;
			
			System.out.println("non lamda addtion = " +  test.operate(1, 2, addition));
			System.out.println("lamda addtion = " +  test.operate(1, 2, additionLamda));
			System.out.println("=======================================================");
			
			MathOperation subtraction = new MathOperation() {
				@Override
				public int operation(int a, int b) {
					return a-b;
				}
			};
			
			//non type
			MathOperation subtractionLamda = (x,y) -> x-y;
			System.out.println("non lamda substraction = " +  test.operate(2, 1, subtraction));
			System.out.println("lamda substraction = " +  test.operate(2, 1, subtractionLamda));
			System.out.println("=======================================================");
			
			MathOperation matrix = new MathOperation() {
				@Override
				public int operation(int a, int b) {
					return a*b;
				}
			};
			
			//return statement
			MathOperation matrixLamda = (int x,int y) -> {return x*y;};
			System.out.println("non lamda matrix = " +  test.operate(3, 2, matrix));
			System.out.println("lamda matrix = " +  test.operate(3, 2, matrixLamda));
			System.out.println("=======================================================");
		
			//without parenthesis
			GreetingService greetService1 = message -> 
			System.out.println("hello" + message);
		
			//with parenthesis
			GreetingService greetService2 = (message) -> 
			System.out.println("hello" + message);
			
			greetService1.sayMessage("hello");
			greetService2.sayMessage("Test");
			System.out.println("=======================================================");
		
		}
				
		interface MathOperation{
			int operation(int a,int b);
		}
		
		interface GreetingService{
			void sayMessage(String message);
		}
		
		private int operate(int a,int b,MathOperation mathOperation) {
			return mathOperation.operation(a, b);
		}
}
