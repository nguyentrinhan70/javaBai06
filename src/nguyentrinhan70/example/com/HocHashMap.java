package nguyentrinhan70.example.com;

import java.util.HashMap;

public class HocHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String > ds = new HashMap<>();
		ds.put(113, "Nguyễn Văn Tèo, quê Trường Sa");
		ds.put(114, "Trần Thị Mẹt, quê Hoàng Sa");
		ds.put(115, "Nguyễn Văn Tủn, quê Cà Mau");
		//Xuất thông tin theo mã
		String nv = ds.get(113);
		System.out.println(nv);
		System.out.println("Xuất toàn bộ nhân viên trong công ty");
		for(String ten: ds.values()) {
			System.out.println(ten);
		}
		
		ds.remove(115);
		System.out.println("Danh sách sau khi xóa là: ");
		for(String ten: ds.values()) {
			System.out.println(ten);
		}
	}

}
