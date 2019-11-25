package java_20191122.bb;
// ���� �ٸ� ��Ű���� Ŭ������ ����ϱ� ���ؼ��� �ݵ�� import ������Ѵ�
import java_20191122.aa.Notice; //notice�� default���ٸ� ���� �߻� 


public class NoticeDemo2 extends Notice {

	public static void main(String[] args) {
		Notice c  = new Notice(); // main ���� notice�� ��� ���� x -> public�� ���� ����
		//n.number = 10;
		//n.title = "title";
		//n.hit = 100;
		//n.regdate = "2019-11-22";

		// Notice Ŭ������ ��ӹ��� NoticeDemo2 Ŭ������ ��ü�� ������ ��쿡��
		// protected ������ ������ 
		NoticeDemo2 nc = new NoticeDemo2(); // ��ӹ��� Ŭ������ ��ü�� �����ϴ� ��츸 protected ����
		nc.number = 10;
		nc.title = "title";
	}

}
 