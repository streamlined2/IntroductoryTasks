package edu.tasks.task2;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

public class QuickSorter<K> {
	
	private final Comparator<? super K> comparator;
	private final Deque<Range> postponed;

	public QuickSorter(Comparator<? super K> comparator) {
		this.comparator=comparator;
		postponed=new ArrayDeque<>();
	}
	
	private static class Range {
		private final int left;
		private final int right;
		
		public Range(int left, int right){
			this.left=left;
			this.right=right;
		}
		
		public int getLeft(){ return left;}
		public int getRight(){ return right;}
		
		public int size() { return right-left+1;}
	}
	
	private void splitRange(Sequence<K> seq){
		
			Range range=postponed.pop();
			if(range.size()>=2) {
				
				int divisorIndex = (range.getLeft()+range.getRight())/2;
				K divisor=seq.getKey(divisorIndex);
				
				int leftCandidate=range.getLeft();
				int rightCandidate=range.getRight();
				do{
					while(leftCandidate<=rightCandidate && comparator.compare(seq.getKey(leftCandidate),divisor)<=0) { 
						leftCandidate++;
					}
					
					while(rightCandidate>=leftCandidate && comparator.compare(seq.getKey(rightCandidate),divisor)>0) {
						rightCandidate--;
					}
					
					if(leftCandidate<rightCandidate) {
						seq.swap(leftCandidate, rightCandidate);
						leftCandidate++; rightCandidate--;
					}
				}while(leftCandidate<=rightCandidate);
				
				if(range.getRight()==leftCandidate-1) {
					seq.swap(divisorIndex,range.getRight());
					postponed.push(new Range(range.getLeft(),range.getRight()-1));
				}else {
					postponed.push(new Range(range.getLeft(),leftCandidate-1));
				}

				if(range.getLeft()==leftCandidate) {
					seq.swap(divisorIndex,range.getLeft());
					postponed.push(new Range(range.getLeft()+1,range.getRight()));								
				}else {
					postponed.push(new Range(leftCandidate,range.getRight()));								
				}
			}
		}

		public void sort(Sequence<K> seq) {
			postponed.push(new Range(0,seq.size()-1));
			do {
				splitRange(seq);
			}while(!postponed.isEmpty());
		}
}
