package ex_06;

/*
 * - ���� catch
 *   try ��� ���δ� �پ��� ������ ���ܰ� �߻��� �� ����
 *   �� ��� �߻��Ǵ� ���ܺ��� ���� ó�� �ڵ� �ٸ��� �ۼ� �ʿ�
 *   
 *   catch ����� ���� Ŭ���� Ÿ���� try ��Ͽ��� �߻��� ������ ������ ���ϴµ�,
 *   try ��Ͽ��� �ش� Ÿ���� ���ܰ� �߻��ϸ� catch ����� �����ϵ��� �Ǿ� ����
 *   
 *   catch ����� ���� ���� ������ �� �ϳ��� catch ��ϸ� �����
 */
public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
