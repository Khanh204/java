package Phone;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("NguyenHuuKhanh", "099924249");
        pb.insertPhone("PhungVanVu", "0333425133");
        pb.insertPhone("NguyenVanVu", "066666414");
        pb.removePhone("BuiHoangGiang");
        for(String pl : pb.PhoneList){
            System.out.println(pl);
        }

    }
}
