package ch10;

public class ResourceMain {

	public static void main(String[] args) {
		//�ڵ� ���ҽ� �ݱ� ��� ���� 
		try(FileInputStream file = new FileInputStream()) {
		
		
		//file ���� �о���̴� �κ�...
		
		//file.close();    -> try catch�� �̿����� ������ �ش� ���ҽ��� �����ڰ� ���� ��������� �Ѵ�.
		}catch(Exception e) {
			System.out.println("���� �߻� ");
		}
		//���ҽ� ��ü�� �����Ϳ� ����¿� �����ϴ� ��ü�� �ǹ��ϸ� �ش� ���״� ����� �Ϸ�� �� close�� ȣ���ؾ��Ѵ�.
		//�̶� try() ���ʿ��� ���ҽ� ��ü�� �������ָ� try- catch ���� ����� �� �ڵ����� close�� ȣ�����ְ� �̶�
		//�ݵ�� �ش� ���ҽ� ��ü��  AutoCloseable �������̽��� ���� Ŭ���������Ѵ�.
		
		}
		

}
