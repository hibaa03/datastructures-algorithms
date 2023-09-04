/*import java.util.ArrayList;
public class towers {
    private ArrayList<Integer> disks;

    public Tower(int ndisks){
        disks = new ArrayList<Integer>();
        for (int d=ndisks; d>=1;d--){
            disks.add(d);
        }
    }
    public int remove(){
        return disks.remove(disks.size()-1);
    }
    public void add(int size){
        if (disks.size()>0 && disks.get(disks.size()-1)<size){
            throw new IllegalArgumentException("disk is too large");
        }
    }
    public static void main(String[] args) {
        
    }
}
*/