package streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest02 {
	public static void main(String[] args) {
		String[] names = {"짱구", "철수", "훈이", "맹구", "유리"};
		// 배열로 스트림 생성
		// Array.stream()
		// Stream.of()
		
		Arrays.stream(names).forEach(System.out::println);
		
		// 범위스트림(숫자범위)
		// IntStream, LongStream, DoubleStream의 range
		// rangeClosed()
		
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
	}
}
