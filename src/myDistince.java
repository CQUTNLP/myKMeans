import java.awt.List;
import java.util.ArrayList;


public class myDistince {
	
	public static double LIMIT = 0.01;
	//ArrayList dist = new ArrayList<myDistinceData>() ;
	ArrayList OldNewCent = new ArrayList<myDistinceData>() ;
	myRandomCenter rc = new myRandomCenter();
	//ArrayList myCent = new ArrayList<myCenter>();
	//ArrayList _myCent = new ArrayList<myCenter>();
		
	public void myStateCen(){
		rc.RandomCenter();
	}
	
	public void Distince(){	
		
		//迭代归置节点id
	
		for(int i=0;i<rc.number;i++){//...............
			
			ArrayList dist = new ArrayList<myDistinceData>() ;
			for(int numCenter = 0;numCenter<rc.k;numCenter++){
				
				double d = 0.0;
				for(int j=0;j<rc.center.get(numCenter).cen.arr.length;j++){//
					//System.out.println("length=  "+rc.num.get(i).arr.length);
					//System.out.println("........  "+rc.center.get(numCenter).cen.arr.length);
					//System.out.println("...."+j);
					d +=(rc.num.get(i).arr[j] -rc.center.get(numCenter).cen.arr[j])*
							(rc.num.get(i).arr[j] -rc.center.get(numCenter).cen.arr[j]);
					//System.out.println("...."+j);
				}
				//System.out.println(""+d);
				
				myDistinceData distA = new myDistinceData();
				distA.setDis(d);
				distA.setId(numCenter);
				dist.add(distA); //...d...????????????????/
				//System.out.println(""+((myDistinceData)dist.get(numCenter)).dis);
			}
			//�ȽϽڵ㵽ÿ�����ĵľ��룬��ȡ��������С�ľ��룬��ǽڵ��id
			int id = 0;
			double min = ((myDistinceData)(dist.get(0))).dis;
			for(int x=1;x<rc.k;x++){
				if(((myDistinceData)dist.get(x)).dis<min){
				    min = ((myDistinceData)dist.get(x)).dis;
					rc.num.get(i).dist = min;
					
					id = ((myDistinceData)dist.get(x)).id;
					//System.out.println("id...."+id);
				}
			}
			rc.num.get(i).id = id;
			//System.out.println(",,,,,,,"+rc.num.get(i).id);
			rc.center.get(id).numNode++;			
		}
	}
	
	
	public void Cosine_similarity(){
		//迭代归置节点id
		
			for(int i=0;i<rc.number;i++){//...............
				
				ArrayList dist = new ArrayList<myDistinceData>() ;
				for(int numCenter = 0;numCenter<rc.k;numCenter++){
					
					double dz = 0.0;
					double dm1 = 0.0;
					double dm2 = 0.0;
					double dm = 0.0;
					double cos = 0.0;
					for(int j=0;j<rc.center.get(numCenter).cen.arr.length;j++){//
				
						dz +=(rc.num.get(i).arr[j]) * (rc.center.get(numCenter).cen.arr[j]);
						dm1 += (rc.num.get(i).arr[j])*(rc.num.get(i).arr[j]);
						dm2 += (rc.center.get(numCenter).cen.arr[j])*(rc.center.get(numCenter).cen.arr[j]);
						
					}
					//System.out.println(""+d);
					//System.out.println("...."+dz);
					dm =Math.sqrt(dm1*dm2);
					//System.out.println(""+dm);
					if(dm!=0)
						cos = dz/dm;
					else
						cos = 1;
					//System.out.println(".........."+dm);
					myDistinceData distA = new myDistinceData();
					distA.setDis(cos);
					distA.setId(numCenter);
					dist.add(distA); //...d...????????????????/
					//System.out.println(""+((myDistinceData)dist.get(numCenter)).dis);
				}
				//�ȽϽڵ㵽ÿ�����ĵľ��룬��ȡ��������С�ľ��룬��ǽڵ��id
				int id = 0;
				double max = ((myDistinceData)(dist.get(0))).dis;
				for(int x=1;x<rc.k;x++){
					if(((myDistinceData)dist.get(x)).dis>max){
					    max = ((myDistinceData)dist.get(x)).dis;
						rc.num.get(i).dist = max;
						
						id = ((myDistinceData)dist.get(x)).id;
						//System.out.println("id...."+id);
					}
				}
				rc.num.get(i).id = id;
				//System.out.println(",,,,,,,"+rc.num.get(i).id);
				rc.center.get(id).numNode++;			
			}
		
	}

	public double RangeDifference(ArrayList<myCenter> myCent, ArrayList<myCenter> _myCent){
		double ds = 0.0;
		
		for(int numCenter = 0;numCenter<rc.k ;numCenter++){
			//新旧簇心移动距离平方和
			
			for(int j=0;j<rc.center.get(numCenter).cen.arr.length;j++){
				
				ds +=(((myCenter)_myCent.get(numCenter)).cen.arr[j] - ((myCenter)myCent.get(numCenter)).cen.arr[j])*
				(((myCenter)_myCent.get(numCenter)).cen.arr[j] - ((myCenter)myCent.get(numCenter)).cen.arr[j]);
			}
		}
		//System.out.print("......."+ds);
		if(ds<LIMIT){
			System.out.println("最终簇心为：");
			for(int numCenter = 0;numCenter<rc.k ;numCenter++){
				for(int j=0;j<rc.center.get(numCenter).cen.arr.length;j++){
					System.out.print("  "+((myCenter)myCent.get(numCenter)).cen.arr[j]);		
				}
				System.out.println("");
			}	
		}
		return ds;
	}
	
	public ArrayList<myCenter> AverageCenter(){
		double ds = 0;
		double limit=0;
		ArrayList myCent = new ArrayList<myCenter>();
		for(int numCenter = 0;numCenter<rc.k ;numCenter++){	
			
			myCenter center = new myCenter();						
			myNumber array = new myNumber();
			
			for(int i = 0;i<rc.center.get(numCenter).cen.arr.length;i++){
				ds = 0;
				
				for(int t=0;t<rc.number;t++){
					if( rc.num.get(t).id == numCenter){
						//求平均簇心
						ds+= rc.num.get(t).arr[i];
					}
				}
				double c;
				if(rc.center.get(numCenter).numNode==0)
					c = 0;
				else
					c= ds/rc.center.get(numCenter).numNode;
					array.arr[i]= c;
					//System.out.println("...."+c);
				}
			array.id = numCenter;
			array.dist = rc.center.get(numCenter).cen.dist;
			center.setCen(array);
			center.numNode = rc.center.get(numCenter).numNode;
			myCent.add(center);
		}
		return myCent;
		
	/*	for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				
				System.out.print(""+((myCenter)myCent.get(i)).cen.arr[j]);
				//System.out.print("node."+((myCenter)myCent.get(i)).numNode);
			}
			System.out.println("....");
		}*/
}
			
	public ArrayList<myCenter> CopyCent(ArrayList<myCenter> myCent){
		ArrayList _myCent = new ArrayList<myCenter>();
		for(int i=0;i<rc.k;i++){
			myCenter mc = new myCenter();
			myNumber my = new myNumber();
			//for(int j=0;j<((myCenter)myCent.get(i)).cen.arr.length;j++){
				my.setArr(rc.center.get(i).cen.arr);
				my.id = rc.center.get(i).cen.id;
				my.dist =  rc.center.get(i).cen.dist;
				mc.setCen(my);
				//mc.cen.arr[j]=rc.center.get(i).cen.arr[j] ;
				
			//}
			_myCent.add(mc);//旧的
		}
		//System.out.println("..................................");
		//Show1();
		for(int i=0;i<rc.k;i++){
			
			for(int j=0;j<((myCenter)myCent.get(i)).cen.arr.length;j++){
				rc.center.get(i).cen.arr[j]=((myCenter)myCent.get(i)).cen.arr[j];
				 //?????????????????????////////////num.cen.arr变化的原因？？
			}
			System.out.println();
		}
		//Show1();
		return _myCent;
	}
	
		/*public double Comparison(){
		//�Ƚϴ����ƶ����룬�ҳ����ֵ����ֵ�Ƚ�
		
		double limit = OldNewCent[0].dis;
		for(int i=0;i<rc.k;i++){
			if(OldNewCent[i].dis>limit)
				limit = OldNewCent[i].dis;
		
		}
		return limit;
	}*/	
	public void Show(){
		for(int numCenter=0;numCenter<rc.k;numCenter++){
			System.out.println("属于第"+numCenter+"簇的成员向量有：");
			for(int i=0;i<rc.number;i++){
				if(rc.num.get(i).id==numCenter){
					for(int j=0;j<rc.num.get(i).arr.length;j++){
						System.out.print(rc.num.get(i).arr[j]+"  ");
					}
					System.out.print("  num = "+rc.num.get(i).num);
					System.out.println("");
				}
				
			}
			System.out.println("");
		}
	}
	
	public void Show1(){
		for(int j=0;j<rc.number;j++){
			for(int i=0;i<10;i++){
				System.out.print(" "+rc.num.get(j).arr[i]);	
			}
		    System.out.print("......id= "+rc.num.get(j).id);
			System.out.println();
		}
	}
}
