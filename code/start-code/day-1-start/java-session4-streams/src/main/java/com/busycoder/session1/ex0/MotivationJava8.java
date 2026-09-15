package com.busycoder.session1.ex0;

import java.util.stream.LongStream;

class PrimeNumbers{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}
public class MotivationJava8 {
	
	public static void main(String[] args) {

//		long numOfPrimes = LongStream.rangeClosed(2, 100_000)
//				.filter(PrimeNumbers::isPrime)
//				.count();
//		System.out.println(numOfPrimes);
		
		/*
		 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 DemoTakingAdvOfParallelProcessingwithOutPhd

		 */
	}

}
