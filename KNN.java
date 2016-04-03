import java.util.ArrayList;


<<<<<<< HEAD
public class KNN {
=======
public class KNN {/***/
>>>>>>> d59d535537623f450469ec2e33147105dd444415
	int k=10;
	int id;
	myProgramStructure p = new myProgramStructure();
	ArrayList mynum = new ArrayList<myNumber>();
	myNumber max = new myNumber();
	ArrayList ol = new ArrayList<myNumber>();
	
	public KNN(){
		p.ProgramStructure();
		for(int i=0;i<p.distince.rc.num.size();i++){
			myNumber m = p.distince.rc.num.get(i);
			mynum.add(m);
		//	System.out.println("............."+((myNumber)mynum.get(i)).dist_knn);	
		}
	}
	public void Knn_start(myNumber xl){
		
		for(int i=0;i<mynum.size();i++){
			double x =0;
			for(int j=0;j<xl.arr.length;j++){
				x += (((myNumber)mynum.get(i)).arr[j]-xl.arr[j])*(((myNumber)mynum.get(i)).arr[j]-xl.arr[j]);
			//	System.out.println("..........???"+x);
			}
			((myNumber)mynum.get(i)).dist_knn = x;
		//	System.out.println(".......,,,,,,,,,,,,,,,,,,,"+((myNumber)mynum.get(i)).dist_knn);
		}
	}
	
<<<<<<< HEAD
	//给ol付出之
=======
	//缁檕l浠樺嚭涔�
>>>>>>> d59d535537623f450469ec2e33147105dd444415
	
	public void knn_maxstate(){
		for(int i=0;i<k;i++){
			myNumber m = new myNumber();
			m.setArr(((myNumber)mynum.get(i)).arr);
			m.setDist_knn(((myNumber)mynum.get(i)).dist_knn);
			m.setDist(((myNumber)mynum.get(i)).dist);
			m.setId(((myNumber)mynum.get(i)).id);
			ol.add(m);
		
		}
	}
	
	public int Knn_max(){
		
		//knn_maxstate();
		int d=0;
		max.dist_knn = ((myNumber)ol.get(0)).dist_knn;
		max.setArr(((myNumber)ol.get(0)).arr);
		
		for(int j=0;j<k;j++){
			//System.out.print("..........???"+((myNumber)ol.get(j)).dist_knn);
			if(((myNumber)ol.get(j)).dist_knn>max.dist_knn){
				//System.out.print("..........???"+d);
				max.dist_knn = ((myNumber)ol.get(j)).dist_knn;
				max.setArr(((myNumber)ol.get(j)).arr);
				d = j;
			}
		}
		//System.out.print("..........???"+d);
		return d;
	}
	
	public void diedai(){
		
		for(int i=k;i<mynum.size();i++){
			int x = Knn_max();
			
			if(((myNumber)mynum.get(i)).dist_knn < max.dist_knn){
				
				double[] arr = ((myNumber)mynum.get(i)).arr;
				double d = ((myNumber)mynum.get(i)).dist_knn;
				double dd = ((myNumber)mynum.get(i)).dist;
				int ddd = ((myNumber)mynum.get(i)).id;
				((myNumber)ol.get(x)).setArr(arr);
				((myNumber)ol.get(x)).dist_knn = d;
				((myNumber)ol.get(x)).dist = dd;
				((myNumber)ol.get(x)).id = ddd;
				
				/*((myNumber)mynum.get(x)).setArr(((myNumber)mynum.get(i)).arr);
				((myNumber)mynum.get(x)).setDist_knn(((myNumber)mynum.get(i)).dist_knn);
				((myNumber)mynum.get(x)).setDist(((myNumber)mynum.get(i)).dist);
				((myNumber)mynum.get(x)).setId(((myNumber)mynum.get(i)).id);*/
			}
		}
	}
	
	public void knn_liver(){
		int[] klin = {0,0,0};
		for(int i=0;i<p.distince.rc.k;i++){
			for(int j=0;j<k;j++){
				if(((myNumber)ol.get(j)).id == i){
					klin[((myNumber)ol.get(j)).id]++;
				}
			}
		}
<<<<<<< HEAD
		System.out.println("距离该向量最近的"+k+"个向量的id为：");
=======
		System.out.println("璺濈璇ュ悜閲忔渶杩戠殑"+k+"涓悜閲忕殑id涓猴細");
>>>>>>> d59d535537623f450469ec2e33147105dd444415
		for(int i=0;i<10;i++){
			System.out.print("   "+((myNumber)ol.get(i)).id);
		}
		System.out.println();
	//	System.out.print(",,,"+klin[0]);
	//	System.out.print(",,"+klin[1]);
	//	System.out.print(",,"+klin[2]);
		 id = 0;
		 int max=klin[0];
		for(int i=1;i<p.distince.rc.k;i++){
		 //id = i;
		// int max=klin[i];
			if(klin[i]>max){
				max = klin[i];
				id = i;
			}
		}
<<<<<<< HEAD
		System.out.print("该向量的类别为："+id);
=======
		System.out.print("璇ュ悜閲忕殑绫诲埆涓猴細"+id);
>>>>>>> d59d535537623f450469ec2e33147105dd444415
	}
}
