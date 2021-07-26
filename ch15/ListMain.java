package ch15;

import java.util.ArrayList;
import java.util.List;


public class ListMain {

	public static void main(String[] args) {
		//List �������̽��� ����ϴ� �÷��� �����ӿ�ũ
		
		//1. ArrayList Ŭ����
		//�ʱ� �뷮 10�̸� �ʰ��� �ڵ����� ����
		//���׸��� ����Ͽ� ��ü ������ ����Ÿ���� ������
		ArrayList<String> sList = new ArrayList<>();
		List<String> listInterface = sList;

		//list�� ��ü �߰� �޼ҵ�
		
		//list�� �� �ڿ� ���� �߰�		
		listInterface.add("1��° ����");
		//sList�� ���ǵ� add�żҵ带 �̿��� "1��° ����"���� �ִ´�.
		listInterface.add("2��° ����");
		listInterface.add("3��° ����");
		
		String value1 = listInterface.get(0);
		//0�ε����� ����� String ��ü�� �����´� 
		String value2 = listInterface.get(1);
		String value3 = listInterface.get(2);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//Ư�� �ε����� ���� �߰�, ���� �ִ� ���ҵ��� �ڷ� �ϳ��� �и���
		listInterface.add(1,"4��° ����");
		value2 = listInterface.get(1);
		System.out.println(value2);
		
		value3 = listInterface.get(2);
		System.out.println(value3);
		
		
		//Ư�� �ε����� ���Ұ� ����
		listInterface.set(1, "5��° ����");
		
		value2 = listInterface.get(1);
		System.out.println(value2);
		
		value3 = listInterface.get(2);
		System.out.println(value3);
		
		
		
		//list���� ��ü �˻� 
		//contains(E e)
		boolean result = listInterface.contains("1��° ����");
		System.out.println(result);
		
		
		//isEmplty() - �÷����� ��������� true
		result = listInterface.isEmpty();
		System.out.println(result);
		
		//size() - �÷����� ���� ������ ��ȯ 
		int size = listInterface.size();
		System.out.println(size);
		
		//clear() - �÷����� ����ִ� �޼ҵ�
		listInterface.clear();
		//Ȯ��
		size = listInterface.size();
		System.out.println(size);
		
		
		
		//list�� �� �ڿ� ���� �߰�		
		listInterface.add("1��° ����");
		listInterface.add("2��° ����");
		listInterface.add("3��° ����");
		listInterface.add("3��° ����");
		listInterface.add("4��° ����");
		
		//remove(int i) - �ش� �ε��� ������ ������ �����ϰ� ������ ��������ȯ
		//�÷����� �߰��� �����Ͱ� ������� �ڿ��� ������ �翩�� ��ĭ���� ����
		Systrem.out.println("*********");
		String removeObj = listInterface.remove(1);
		System.out.println(removeObj);
		System.out.println(listInterface.get(1));
		
		//remove(E e) - �ش� ��ü�� �����ϸ� �������� true, false ��ȯ
		//�ߺ��Ǵ� ��� �տ������� ���� ��ü�� �����ϰ� �ڿ��� ������ ����ش�.
		result = listInterface.remove("3��° ����");
		if(result) {
			System.out.println(listInterface.get(1));
			System.out.println(listInterface.get(2));
		}
	
		
		
		
	}

}
