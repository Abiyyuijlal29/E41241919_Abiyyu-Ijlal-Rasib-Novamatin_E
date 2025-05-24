package WSIBDMinggu3ke2;

public class soal1 {
    
        public static void main(String[] args) {

        String[] nama = {"Abiyyu", "Ijlal", "Rasib"};
        
        StringBuilder fullName = new StringBuilder();
        for (String bagian : nama) {
            fullName.append(bagian).append(" ");
        }
        
        if (fullName.length() > 0) {
            fullName.setLength(fullName.length() - 1);
        }
        
        System.out.println(fullName.toString());
    }
    
}
