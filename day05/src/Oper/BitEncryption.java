package Oper;
// 4번 : 비트 연산자를 이용한 암화와 복호화

public class BitEncryption {
	public static void main(String[] args) {
		int originalMsg = 42;  // 원본 메시지
		int key = 99;  // 비트 마스크(암, 복호화에 사용)
		
		int encryptionMsg = originalMsg ^ key; // xor 연산을 통한 암호화
		System.out.println("암호화된 매시지 : " +  encryptionMsg);
		
		int decryptionMsg = encryptionMsg ^ key;
		System.out.println("복호화된 메시지 : " + decryptionMsg);
		
		int decryptedMsg = encryptionMsg ^ key;
		System.out.println("복호화된 메시지 : " + decryptionMsg);
	}
}
