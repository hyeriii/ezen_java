package ch07;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandMa gm = new GrandMa();
		gm.gMethod();
		
		Parent p = new Parent();
		p.gMethod();

		//java���� �θ𿡴� ��� �ڽ� ��ü�� �ڵ� ����ȯ�Ǿ� ���Եȴ�.
		gm = p ;
		
		//������ ���� 
		//��ӿ����� �������� �θ� � �ڽ��� ���ԵǾ� �ִ��Ŀ� ���� ���� �޼ҵ������� ������ �Ǿ��ִ� �ڽ� �޼ҵ尡 ȣ��Ǹ鼭 �ٸ� ������ ��µǴ°��� �ǹ��Ѵ�. 
		gm.gMethod();
		
		//�ڽİ�ü�� �θ�Ÿ���� �������� �������� ��� �ش� �θ� Ÿ�� ������ �̿��Ͽ�
		//����Ҽ� �ִ� ����� ������ �ڽİ�ü�� �����ϰ��ִ� �θ� ��ü�����̴�
		//System.out.printn(gm.f);
		
	}

}
