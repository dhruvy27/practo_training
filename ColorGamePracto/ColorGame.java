package ColorGamePracto;
import java.util.*;
class ColorGame{
    static thing b,i,s,f,sk,a,bl;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st="";
        Set<thing> Lists = new HashSet<thing>();
        Iterator value = Lists.iterator();
        
        while(true){
            st=sc.nextLine();
            if(st.charAt(0)=='+'){
                System.out.println("subscribed");
                st=st.substring(1,st.length());
                
                switch(st){
                case "banana":thing banana = new banana(); 
                              Lists.add(banana);
                              b=banana;
                              break;
                case "ink" :thing ink = new ink();
                            Lists.add(ink);
                            i=ink;
                            break;
                case "salt":thing salt = new salt();
                            Lists.add(salt);
                            s=salt;
                            break;
                case "frog":thing frog = new frog();
                            Lists.add(frog);
                            f=frog;
                            break;
                case "blood":thing blood = new blood();
                            Lists.add(blood);
                            bl=blood;
                            break;
                case "sky": thing sky=new sky();
                            Lists.add(sky);
                            sk=sky;
                            break;
                case "apple":thing apple = new apple();
                            Lists.add(apple);
                            a=apple;
                            break;
                }
            }
            if(st.charAt(0)=='-'){
                System.out.println("unsubscribed");
                st=st.substring(1,st.length());
                
                switch(st){
                case "banana":Lists.remove(b);break;
                case "ink" :Lists.remove(i);break;
                case "salt":Lists.remove(s);break;
                case "frog":Lists.remove(f);break;
                case "blood":Lists.remove(bl);break;
                case "sky":Lists.remove(sk);break;
                case "apple":Lists.remove(a);break;
                }
            }
            if(st.equals("list")){ 
                   System.out.print("[");
                for(thing list:Lists){
                    System.out.print(list.getClass().getSimpleName()+" ");
                };
                  System.out.println("]");

            }
            if(st.equals("exit"))break;
            switch(st){
                case "green" :for(thing list:Lists){
                    if(st.equals(list.getcolor1())||st.equals(list.getcolor2())){
                        list.sometime("green");
                    }

                }
                break;
                case "yellow" :for(thing list:Lists){
                    if(st.equals(list.getcolor1())||st.equals(list.getcolor2())){
                        if(list.equals(f))list.today("yellow");
                        else
                        list.sometime("yellow");
                    }
                };break;
                case "red":for(thing list:Lists){
                    if(st.equals(list.getcolor1())||st.equals(list.getcolor2())){
                        list.sometime("red");
                    }
                }break;
                case "black":for(thing list:Lists){
                    if(st.equals(list.getcolor1())||st.equals(list.getcolor2())){
                        list.sometime("black");
                    }
                }break;
                case "white":for(thing list:Lists){
                    if(st.equals(list.getcolor1())||st.equals(list.getcolor2())){
                        list.sometime("white");
                    }
                }break;
                case "blue":for(thing list:Lists){
                    if(st.equals(list.getcolor1())||st.equals(list.getcolor2())){
                        if(list.equals(f))list.today("blue");
                        else
                        list.sometime("blue");
                        
                    }
                }break;
            }
        }
    }
    public interface thing{
        public String getcolor1();
        public String getcolor2();
        public default void sometime(String color){
            System.out.println(String.format("I'm %s! I'm sometimes %s!",getClass().getSimpleName(),color));
        }
        public default void today(String color){
            System.out.println(String.format("I'm %s! I'm %s today!",getClass().getSimpleName(),color));
        }
    }
    public static class banana implements thing{
        public String getcolor1(){
            return "green";
        }
        public String getcolor2(){
            return "yellow";
        }
    }
    public static class ink implements thing{
        
        public String getcolor1(){
            return "red";
        }
        public String getcolor2(){
            return "black";
        }
    }
    public static class salt implements thing{
        public String getcolor1(){
            return "white";
        }
        public String getcolor2(){
            return "white";
        }
    }
    public static class frog implements thing{
        public String getcolor1(){
            return "blue";
        }
        public String getcolor2(){
            return "yellow";
        }
    }
    public static class blood implements thing{
        public String getcolor1(){
            return "red";
        }
        public String getcolor2(){
            return "red";
        }
        
    }
    public static class sky implements thing{
        public String getcolor1(){
            return "blue";
        }
        public String getcolor2(){
            return "black";
        }
    }
    public static class apple implements thing{
        public String getcolor1(){
            return "green";
        }
        public String getcolor2(){
            return "red";
        }
    }
    
    
}