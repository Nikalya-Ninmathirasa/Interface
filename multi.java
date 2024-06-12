public class multi {

    

        public static void main(String[] args) {
            
         son inter = new son();
         inter.call();
         inter.talk();
         inter.walk();
         inter.run();
         
         
         
    
        }
    }
    
    
    
    
     interface Father {
        abstract void call();
        abstract void talk();
    
    
    }
    
    interface Mother {
        abstract void walk();
        abstract void run();
    
    
    }
    
    
    
    class son implements Mother{
    
       public void call(){
            System.out.println("calling");
            
        }
    
       public void talk(){
            System.out.println("Talking");
    
        }
        public void walk(){
            System.out.println("walking");
        }
    
       public void run(){
            System.out.println("running");
    
        }
    
        
    
    
    
    
    }
    

