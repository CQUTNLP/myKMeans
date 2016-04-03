
public class myNumber {
	double[] arr =new double[35];
	int id;
	double dist;
	double dist_knn;
	int num;
	public double[] getArr() {
		return arr;
	}

	public void setArr(double[] arr) {
		this.arr = arr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}

	public double getDist_knn() {
		return dist_knn;
	}
	
	public void setDist_knn(double dist_knn) {
		this.dist_knn = dist_knn;
	}
	public myNumber(){
		//arr = null;
		//id = 0;
	}
	
	public void Out(myNumber num){
		System.out.print("随机质心：");
		for(int i=0;i<num.arr.length;i++){
			System.out.print("  "+num.arr[i]);
		}
		System.out.print("  id=  "+num.id);
		System.out.println("");
	}
}
