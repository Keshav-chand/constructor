public class contructor {
    public contructor(){
        System.out.println("default constructor");
    }
    public contructor(int a,float f, String s ,char c){
        System.out.println("Parameterised  contructor");
    	System.out.println("The sqaure of interger value is:"+a*a);		
    	System.out.println("The sqaure of float value is:"+f*f);
    	System.out.println("The string you inputted is:"+s);
    	System.out.println("The Charachter that you entered:"+c);	
    }
    public void obervations(){
        System.out.println("inside obervations method");
    }
    public static void main(String[] args) {
        System.out.println("from object creation method 1:");
        contructor obj =new contructor();
        contructor obj1=new contructor(5,0.5f,"hello learner",'2');
        System.out.println("\n from object creation method 2");
        contructor obj2= new contructor();
        contructor obj3=new contructor(15, 2.5f, "hi learner", 'w');
        obj.obervations();
    }

    }

    
       