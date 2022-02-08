package ColorGamePracto;
import java.util.*;
class ColorGame{
    static properties b,i,s,f,sk,a,bl;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String item="";
        Set<properties> Lists = new HashSet<properties>();
        Iterator value = Lists.iterator();
        
        while(true){
            item=sc.nextLine();
            if(item.charAt(0)=='+'){
                System.out.println("subscribed");
                item=item.substring(1,item.length());
                
                switch(item){
                case "banana":properties banana = new banana(); 
                              Lists.add(banana);
                              b=banana;
                              break;
                case "ink" :properties ink = new ink();
                            Lists.add(ink);
                            i=ink;
                            break;
                case "salt":properties salt = new salt();
                            Lists.add(salt);
                            s=salt;
                            break;
                case "frog":properties frog = new frog();
                            Lists.add(frog);
                            f=frog;
                            break;
                case "blood":properties blood = new blood();
                            Lists.add(blood);
                            bl=blood;
                            break;
                case "sky": properties sky=new sky();
                            Lists.add(sky);
                            sk=sky;
                            break;
                case "apple":properties apple = new apple();
                            Lists.add(apple);
                            a=apple;
                            break;
                }
            }
            if(item.charAt(0)=='-'){
                System.out.println("unsubscribed");
                item=item.substring(1,item.length());
                
                switch(item){
                case "banana":Lists.remove(b);break;
                case "ink" :Lists.remove(i);break;
                case "salt":Lists.remove(s);break;
                case "frog":Lists.remove(f);break;
                case "blood":Lists.remove(bl);break;
                case "sky":Lists.remove(sk);break;
                case "apple":Lists.remove(a);break;
                }
            }
            if(item.equals("list")){ 
                   System.out.print("[");
                for(properties list:Lists){
                    System.out.print(list.getClass().getSimpleName()+" ");
                };
                  System.out.println("]");

            }
            if(item.equals("exit"))break;
            switch(item){
                case "green" :for(properties list:Lists){
                    if(item.equals(list.getcolor1())||item.equals(list.getcolor2())){
                        list.sometime("green");
                    }

                }
                break;
                case "yellow" :for(properties list:Lists){
                    if(item.equals(list.getcolor1())||item.equals(list.getcolor2())){
                        if(list.equals(f))list.today("yellow");
                        else
                        list.sometime("yellow");
                    }
                };break;
                case "red":for(properties list:Lists){
                    if(item.equals(list.getcolor1())||item.equals(list.getcolor2())){
                        list.sometime("red");
                    }
                }break;
                case "black":for(properties list:Lists){
                    if(item.equals(list.getcolor1())||item.equals(list.getcolor2())){
                        list.sometime("black");
                    }
                }break;
                case "white":for(properties list:Lists){
                    if(item.equals(list.getcolor1())||item.equals(list.getcolor2())){
                        list.sometime("white");
                    }
                }break;
                case "blue":for(properties list:Lists){
                    if(item.equals(list.getcolor1())||item.equals(list.getcolor2())){
                        if(list.equals(f))list.today("blue");
                        else
                        list.sometime("blue");
                        
                    }
                }break;
            }
        }
    }
    public interface properties{
        public String getcolor1();
        public String getcolor2();
        public default void sometime(String color){
            System.out.println(String.format(" Hi I'm %s! I'm sometimes %s!",getClass().getSimpleName(),color));
        }
        public default void today(String color){
            System.out.println(String.format("Heloo I'm %s! I'm %s today!",getClass().getSimpleName(),color));
        }
    }
    public static class banana implements properties{
        public String getcolor1(){
            return "green";
        }
        public String getcolor2(){
            return "yellow";
        }
    }
    public static class ink implements properties{
        
        public String getcolor1(){
            return "red";
        }
        public String getcolor2(){
            return "black";
        }
    }
    public static class salt implements properties{
        public String getcolor1(){
            return "white";
        }
        public String getcolor2(){
            return "white";
        }
    }
    public static class frog implements properties{
        public String getcolor1(){
            return "blue";
        }
        public String getcolor2(){
            return "yellow";
        }
    }
    public static class blood implements properties{
        public String getcolor1(){
            return "red";
        }
        public String getcolor2(){
            return "red";
        }
        
    }
    public static class sky implements properties{
        public String getcolor1(){
            return "blue";
        }
        public String getcolor2(){
            return "black";
        }
    }
    public static class apple implements properties{
        public String getcolor1(){
            return "green";
        }
        public String getcolor2(){
            return "red";
        }
    }
    
    
}
