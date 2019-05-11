
public class Solution {
	
	
	static void minimumBribes(int[] q) {
		int noOfBribesForIteration =0; int totalnoOfBribes=0;
		if(q.length < 2) {
			return;
		} else {
			boolean isTooChaotic = false;
			for(int i=0; i<q.length-1;i++) {
				if(q[i] < q[i+1]) {
					continue; 
				} else {
					noOfBribesForIteration = q[i] - q[i+1];
					if(noOfBribesForIteration > 2) {
						isTooChaotic = true;
						System.out.println("Too Chaotic");
						break;
					} else {
						totalnoOfBribes = totalnoOfBribes + noOfBribesForIteration; 
						//System.out.println(noOfBribesForIteration);
					}
				}
			}
			if(!isTooChaotic) 
			System.out.println(totalnoOfBribes);
			
			
			/*while(q[i] < q[i+1]) {
				i++;
			}*/
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] q =  {2,1,6,3,4,5};
		Solution.minimumBribes(q);
		

	}

}
