package methods;

public class G_Marathon {
	
	public int[] FindSmallest(int[] arr){
		int index = 0;
	    int min = arr[index];
	    for (int i = 0; i < arr.length; i++) {
	    	if (arr[i] < min ) {
	    		min = arr[i];
	    		index = i;
	    	}
		}
	    int[] record = new int[3];
	    record[0] = index;
	    record[1] = min/60;
	    record[2] = min%60;
			       
	    return record;
	}
		
	public static void main(String[] args) {
		
		String [] names = {"초코", "해피", "또또", "양파", "계피", "소금", "감자", "쫑쫑", "메리",
				"냥냥", "야옹", "냐옹", "시츄", "포메", "요키", "말티"};
		
		int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334,
		412, 393, 299, 343, 317, 265};	
		
		G_Marathon newM = new G_Marathon();
		int[] record = newM.FindSmallest(times);
		System.out.println(names[record[0]]+ ": " + record[1]  + " hours " + record[2] + " minutes ");
		
		}

}
