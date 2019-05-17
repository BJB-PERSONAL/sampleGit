class Runner{
  public void greet1(){System.out.println("TEST .......");}	
  public void greet2(){System.out.println("TEST .......");}
  public void greet3(){System.out.println("TEST .......");}  
  public static void main(String ...a){
    System.out.println("sample file is show here !!!:)");
	BiPredicate<String,String> predicateFn = (firstName,lastName)-> firstName.length() > lastName.length();
	predicateFn.apply("BIJO","JACOB");

	BiPredicate<String,String> predicateFn = (firstName,lastName)-> firstName.length() > lastName.length();
	predicateFn.apply("BIJO","JACOB");

	BiPredicate<String,String> predicateFn = (firstName,lastName)-> firstName.length() > lastName.length();
	predicateFn.apply("BIJO","JACOB");
  }  
}
