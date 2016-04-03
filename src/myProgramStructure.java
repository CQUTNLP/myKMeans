import java.util.ArrayList;

public class myProgramStructure {

	public static double LIMIT = 0.01;
	public static double time = 100;
	myDistince distince = new myDistince();
	ArrayList myCent = new ArrayList<myCenter>();
	ArrayList _myCent = new ArrayList<myCenter>();
	double limit;
	
	
	
	public void ProgramStructure(){	  
			distince.myStateCen();
			int i=0;
			int t=0;
			do{
				distince.Cosine_similarity();
				//distince.Distince();
				//distince.Show1();
				myCent = distince.AverageCenter();
				
				_myCent=distince.CopyCent(myCent);
				//distince.Show1();
				limit=distince.RangeDifference(myCent,_myCent);
				//limit = distince.RangeDifference();
				System.out.println("此次各个簇心移动距离平方和为: "+limit);
				t++;
			
		    }while(limit>LIMIT && t<time);
			distince.Show();
			System.out.println("。。。。。。。。循环次数为："+t);
		
			}
	public static void main(String[] args){
		//myProgramStructure ps = new myProgramStructure();
		//ps.ProgramStructure();
		KNN knn = new KNN();
		myNumber par = new myNumber();
		System.out.println("判断该向量的类别：");
		double[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10};
		
		par.setArr(arr);
		par.setDist(0);
		par.setId(0);
		par.setDist_knn(0);
		
		for(int i=0;i<arr.length;i++)
			System.out.print("  "+par.arr[i]);
		System.out.println("");
		knn.Knn_start(par);	
		knn.knn_maxstate();
		knn.diedai();
		knn.knn_liver();
	}

}
