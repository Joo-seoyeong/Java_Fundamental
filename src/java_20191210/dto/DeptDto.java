package java_20191210.dto;

public class DeptDto {
	private int no; //dept테이블에 이미 deptno가 있기 때문에 그냥 no라고 해도됨 /자바에서는 클래스에 해당하는 이름을 변수에 할당하지 않음
	private String name;
	private String loc;
	public DeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	public int getNo() { // setter , getter 단축키 : alt + shift + s + r
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
