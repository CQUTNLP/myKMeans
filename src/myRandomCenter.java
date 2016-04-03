import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

class myRandomCenter{
	//ԭʼ������ݴ��
	public static int k = 3;//������??????????????????????????
	public static int number = 45;//�ı���������
	
	//public myNumber[] num;
	public ArrayList<myNumber> num= new ArrayList<myNumber>();

	ArrayList<myCenter> center = new ArrayList<myCenter>();
	
	public void RandomCenter(){
		
		 double[] list1={2,2,2,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0};
		 double[] list2={2,5,1,1,0,3,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list3={1,0,0,2,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list4={2,2,0,1,0,1,0,1,1,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0};
		 double[] list5={1,3,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list6={2,2,1,0,2,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
		 double[] list7={0,0,6,2,1,0,5,1,0,0,5,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0};
		 double[] list8={2,1,2,0,1,0,0,1,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list9={2,0,2,1,1,0,2,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0};
		 double[] list10={0,2,0,1,1,1,0,2,5,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
		 double[] list11={0,0,7,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list12={0,0,1,2,1,1,1,2,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0};
		 double[] list13={0,0,2,1,1,1,0,0,1,0,0,2,0,4,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0};
		 double[] list14={3,0,4,0,1,2,5,0,0,1,1,0,0,1,0,0,0,3,0,2,1,0,0,3,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list15={0,0,0,0,0,0,0,0,0,0,2,0,1,0,1,0,1,1,0,0,0,0,0,0,0,0,2,0,0,0,0,0,1,0,0};
		 double[] list16={0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,1,1,0,2,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0};
		 double[] list17={0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,1,3,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list18={0,0,0,0,0,0,1,1,0,0,2,1,0,1,0,3,1,4,3,2,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0};
		 double[] list19={0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,1,0,1,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list20={0,0,1,0,0,0,0,0,0,1,1,1,0,1,3,1,1,1,0,2,0,1,3,0,1,0,0,1,0,0,0,0,1,0,0};
		 double[] list21={0,0,0,0,0,0,0,0,0,0,2,0,0,1,0,2,0,1,1,2,2,0,0,0,0,0,1,0,0,0,0,0,1,0,0};
		 double[] list22={0,0,0,2,0,0,0,3,0,0,2,1,1,0,0,4,1,0,2,2,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list23={0,0,0,0,0,0,0,0,0,1,0,3,0,1,1,3,3,5,0,2,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0};
		 double[] list24={0,0,0,0,0,0,0,0,0,0,2,1,1,1,0,1,1,0,4,0,0,4,0,0,0,1,0,0,0,1,0,1,0,0,0};
		 double[] list25={0,0,0,0,2,0,0,1,0,1,0,0,0,5,3,0,1,3,1,2,0,3,0,0,0,0,0,0,0,1,0,0,0,0,0};
		 double[] list26={0,0,0,1,0,0,0,1,0,1,0,1,1,6,1,2,1,5,0,2,0,4,0,0,0,0,1,0,0,0,1,0,0,1,0};
		 double[] list27={0,0,0,0,0,0,0,0,0,0,1,2,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 double[] list28={0,0,0,1,0,0,0,0,0,0,3,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0};
		 double[] list29={0,0,0,0,1,0,0,2,0,0,1,0,0,0,0,2,0,0,0,0,0,0,4,0,1,0,4,0,1,3,0,1,1,0,0};
		 double[] list30={0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,2,1,0,1,0,1,0,2,0,0,0,1,0,0};
		 double[] list31={0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,2,0,1,1,1,0,0,2,0,1,0,0,0};
		 double[] list32={0,0,0,0,0,0,0,0,0,3,1,0,0,0,0,4,0,0,0,0,0,1,2,0,4,2,0,0,1,1,1,0,1,0,0};
		 double[] list33={0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0};
		 double[] list34={0,0,0,1,0,0,0,0,1,0,0,2,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,3,2,0,2,0,0,0,0};
		 double[] list35={0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,2,0,1,1,0,1,2,0};
		 double[] list36={0,0,0,2,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,2,1,1};
		 double[] list37={0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,1,1,0,1,0,2,2,2,0,0,1,1,1};
		 double[] list38={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,1,0,0,1,0,0,1,1,1,0};
		 double[] list39={0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,1,1,0,0,0,0,1,0};
		 double[] list40={0,0,0,2,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,2,2,0,0,1,0,5,0,3,0,1,0,1};
		 double[] list41={0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,2,0,0,0,2,0,2,1,0,1,0};
		 double[] list42={0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,2,1,0,1,0,1,0,1,0,0,0,1,0,0};
		 double[] list43={0,0,0,3,0,0,0,3,0,1,0,0,0,0,0,1,0,0,0,0,2,0,2,0,2,0,1,0,0,0,0,1,0,0,0};
		 double[] list44={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,2,0};
		 double[] list45={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,2,0,1,0,0,0,1,0,1,0,2,0};
		
		//num.get(0).setArr(list1);
		myNumber num1 = new myNumber();
		myNumber num2 = new myNumber();
		myNumber num3 = new myNumber();
		myNumber num4 = new myNumber();
		myNumber num5 = new myNumber();
		myNumber num6 = new myNumber();
		myNumber num7 = new myNumber();
		myNumber num8 = new myNumber();
		myNumber num9 = new myNumber();
		myNumber num10 = new myNumber();
		myNumber num11 = new myNumber();
		myNumber num12 = new myNumber();
		myNumber num13 = new myNumber();
		myNumber num14 = new myNumber();
		myNumber num15 = new myNumber();
		myNumber num16 = new myNumber();
		myNumber num17 = new myNumber();
		myNumber num18 = new myNumber();
		myNumber num19= new myNumber();
		myNumber num20 = new myNumber();
		myNumber num21= new myNumber();
		myNumber num22= new myNumber();
		myNumber num23 = new myNumber();
		myNumber num24= new myNumber();
		myNumber num25= new myNumber();
		myNumber num26= new myNumber();
		myNumber num27= new myNumber();
		myNumber num28= new myNumber();
		myNumber num29= new myNumber();
		myNumber num30= new myNumber();
		myNumber num32= new myNumber();
		myNumber num31= new myNumber();
		myNumber num33= new myNumber();
		myNumber num34= new myNumber();
		myNumber num35= new myNumber();
		myNumber num36= new myNumber();
		myNumber num37= new myNumber();
		myNumber num38= new myNumber();
		myNumber num39 = new myNumber();
		myNumber num40 = new myNumber();
		myNumber num41= new myNumber();
		myNumber num42= new myNumber();
		myNumber num43 = new myNumber();
		myNumber num44= new myNumber();
		myNumber num45= new myNumber();
		
		
		num1.arr= list1;
		
		num.add(num1);
		
		num2.arr = list2;
		num.add(num2);
		
		num3.arr = list3;
		num.add(num3);
		
		num4.arr = list4;
		num.add(num4);
		
		num5.arr = list5;
		num.add(num5);
		
		num6.arr = list6;
		num.add(num6);
		
		num7.arr = list7;
		num.add(num7);
		
		num8.arr = list8;
		num.add(num8);
		
		num9.arr = list9;
		num.add(num9);
		
		num10.arr = list10;
		num.add(num10);
		
		num11.arr = list11;
		num.add(num11);
		
		num12.arr = list12;
		num.add(num12);
		
		num13.arr = list13;
		num.add(num13);
		num14.arr = list14;
		num.add(num14);
		num15.arr = list15;
		num.add(num15);
		num16.arr = list16;
		num.add(num16);
		num17.arr = list17;
		num.add(num17);
		num18.arr = list18;
		num.add(num18);
		num19.arr = list19;
		num.add(num19);
		num20.arr = list20;
		num.add(num20);
		num21.arr = list21;
		num.add(num21);
		num22.arr = list22;
		num.add(num22);
		num23.arr = list23;
		num.add(num23);
		num24.arr = list24;
		num.add(num24);
		num25.arr = list25;
		num.add(num25);
		num26.arr = list26;
		num.add(num26);
		num27.arr = list27;
		num.add(num27);
		num28.arr = list28;
		num.add(num28);
		num29.arr = list29;
		num.add(num29);
		num30.arr = list30;
		num.add(num30);
		num31.arr = list31;
		num.add(num31);
		num32.arr = list32;
		num.add(num32);
		num33.arr = list33;
		num.add(num33);
		num34.arr = list34;
		num.add(num34);
		num35.arr = list35;
		num.add(num35);
		num36.arr = list36;
		num.add(num36);
		num37.arr = list37;
		num.add(num37);
		num38.arr = list38;
		num.add(num38);
		num39.arr = list39;
		num.add(num39);
		num40.arr = list40;
		num.add(num40);
		num41.arr = list41;
		num.add(num41);
		num42.arr = list42;
		num.add(num42);
		num43.arr = list43;
		num.add(num43);
		num44.arr = list44;
		num.add(num44);
		num45.arr = list45;
		num.add(num45);
		
		for(int i=0;i<num.size();i++){
			num.get(i).num = i;
		}

		System.out.println("最初向量有： ");
		for(int p=0;p<number;p++)
		{
			for(int g=0;g<num.get(p).arr.length;g++){
				
				System.out.print("  "+num.get(p).arr[g]);
			}
			System.out.print("  id=  "+num.get(p).id);
			System.out.print("      num="+num.get(p).num);
		//	System.out.print(" length="+num.get(p).arr.length);
			System.out.println("");
		}
		
		//������k�����Ĳ����
	    /* Random ran=new Random();
	   
		int[] randomData = new int[k];
		for(int i=0;i<k;i++){
			randomData[i]=Math.abs(ran.nextInt())%6;//��������
			//System.out.println("random[i]= "+randomData[i]);
		}
		//System.out.println("Len"+num.size());
		for(int i=0;i<k;i++){
			myCenter forting = new myCenter();
			//forting.cen = num.get(randomData[i]);//........?????..................
			//forting.setCen(num.get(randomData[i]));
			//num.get(randomData[i]).id = i;
			
			//System.out.println("random.id = "+num.get(randomData[i]).id);
			for(int y=0;y<num.get(randomData[i]).arr.length;y++){
				//System.out.println("random.id = "+forting.cen);
				//System.out.println("random.id = "+num.get(randomData[i]));
				forting.setCen(num.get(randomData[i]));
			    double o= num.get(randomData[i]).arr[y];
			    forting.cen.arr[y] = o;
			}
			forting.cen.id = i;
			forting.numNode = 0;
			
			//System.out.println(".....forting = "+forting.cen.arr.length);
			center.add(forting);
			}*/
		int r = 0;
		for(int i=0;i<number;i+=15){
	    	myCenter foo = new myCenter();
	    	foo.setCen(num.get(i));
	    	foo.cen.id = r;
	    	center.add(foo);
	    	r++;
	    }
	    //输出随机选取的重心
		for(int i=0;i<center.size();i++)
			center.get(i).cen.Out(center.get(i).cen);	
	}
	
}
