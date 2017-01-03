package cn.sc.java.xuxi;

public class study {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		xiaoqiang: for (int x = 0; x < 3; x++) {
			wangcai: for (int y = 0; y < 4; y++) {
				System.out.println("x=" + x);
				break xiaoqiang;
			}

		}
		// xiaoqiang:for (int x=0; x<3 ;x++ )
		// {
		// wangcai:for (int y=0; y<6 ; y++)
		// {
		// System.out.println("x="+x+"y="+y);
		// continue xiaoqiang;
		// }
		//
		// }
	}

}
