package autowring_byType;



public class A {
B b;// by name - means class also b(class-reference) xml also b(bean_id)
          // by type - means class canbe b(class-reference) xml can be b1(bean_id)
	
	A(){
		System.out.println("a is created");
		}  
	
	public B getB() {  
	    return b;  
	}  
	
	public void setB(B b) { 
		
	    this.b = b;  
	} 
	
	
	void print(){
		System.out.println("hello a");
		}
	
	void display(){  
	    print();  
	    b.print();  
	}  
}
