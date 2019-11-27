package java_20191127;

public class ImplementClass implements InterA {

	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("mB");
	}

	@Override
	public void mC() {  // interB에서 디폴트로 선언햇다고 해서 여기서도 public을 안하면 안된다 
		// TODO Auto-generated method stub
		System.out.println("mC");
	}

	@Override
	public void mA() {
		// TODO Auto-generated method stub
		System.out.println("mA");
	}

	
}
