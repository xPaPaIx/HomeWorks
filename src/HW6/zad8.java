package HW6;


public class zad8 {
    public static void main(String[] args) {
        String s = "sddsdwdw awdasdsdhh d f d hdhhfhdhfdgfwygsys dsdolkoregrigr";
        String[] slovaStroki = s.split(" ");
        int max = 0;
        for (int i = 0; i < slovaStroki.length; i++) {
            if (max < slovaStroki[i].length()) {
                max = slovaStroki[i].length();
            }
        }
        for (int i = 0; i < slovaStroki.length; i++) {
            if (max == slovaStroki[i].length()) {
                System.out.println(slovaStroki[i]);
                break;
            }
        }
    }
}
