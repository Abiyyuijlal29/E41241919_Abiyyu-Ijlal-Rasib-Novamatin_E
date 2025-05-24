package WSIBDMinggu2Ke1;
public class Soal2ManagingPeople {
   public static void main(String[] args)
    {
        Soal2Person p1 = new Soal2Person("Arial",37);
        Soal2Person p2 = new Soal2Person("Joseph",15);
        
        if(p1.getAge()==p2.getAge())
        {
            System.out.println(p1.getName()+"is the same age as"+p2.getName());
        }
        else
        {
            System.out.println(p1.getName()+"is NOT the same age as"+p2.getName());
        } 
    }
}
