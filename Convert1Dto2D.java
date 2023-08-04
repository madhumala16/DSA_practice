public class Convert1Dto2D {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=3;int m=2;
		if(m*n!=arr.length) {
			System.out.println("invalid array");
		}
		int arr2[][]=new int[n][m];
		int row=0;int col=0;
		for(int k=0;k<arr.length;k++) {
		
				arr2[row][col]=arr[k];
				col++;
				if(col==m) {
					col=0;
					row++;
				}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}

}
}
