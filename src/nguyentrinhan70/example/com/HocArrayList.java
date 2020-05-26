package nguyentrinhan70.example.com;

import java.util.ArrayList;

public class HocArrayList {

	public static void main(String[] args) {

		ArrayList ds1 = new ArrayList<>();
		ds1.add("An");
		ds1.add("Bình");
		ds1.add("Giải");
		ds1.add("Thoát");
		ds1.add(2,"TÈO");
		for(int i=0; i<ds1.size();i++) {
			String x = ds1.get(i)+"";
			System.out.println(x);
		}
		System.out.println("============================");
		for(Object data: ds1) {
			System.out.println(data);
			
		}
		//ArrayList kiểu tường minh
		ArrayList<Double> ds2 = new ArrayList<Double>();
		for(int i=0;i<10; i++)
		{
			ds2.add(i*2.0);
			
		}
		System.out.println("Xuất thông tin");
		for(double x: ds2) {
			System.out.print(x +"\t");
		}
		System.out.println();
		//Kiểu float
		ArrayList<Float> ds3 = new ArrayList<Float>();
		ds3.add(1.5f);
		ds3.add(12.45f);
		System.out.println("Số phần tử trong ds3 là: "+ds3.size());
		ds3.add(113.115f);
		System.out.println("Số phần tử trong ds3 sau khi thêm là: "+ ds3.size());
		ds3.remove(0);
		System.out.println("Số phần tử trong ds3 sau khi xóa là: "+ds3.size());
		System.out.println("Xuất các phần tử trong ds3");
		for(float x: ds3) {
			System.out.print(x +"\t");
		}
		System.out.println();
		ds3.set(0,1.11f);
		System.out.println("Các phần tử trong ds3 sau khi thêm là:");
		for(float x: ds3) {
			System.out.print(x +"\t");
		}
	}

}
