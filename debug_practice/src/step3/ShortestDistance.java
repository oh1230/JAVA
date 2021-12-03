package step3;

class City{
	String city;	//市
	int totalDistance;	//最短時間
	City from;	//移動前の市

	City(String city){
		this.city = city;
		totalDistance = 0;
	}

	City(String city, City from){
		this(city);
		this.from = from;
	}
}

class Route{
	City city1;	//市1
	City city2;	//市2
	int distance;		//市1と市2の距離

	Route(City city1,City city2,int distance){
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
	}
}

public class ShortestDistance {

	public static void main(String[] args){

		//ダミーのCityオブジェクトを格納（スタート地点の判定で仕様）
		City start = new City("start");

		//市リスト
		City[] cityList = {new City("A市",start),new City("B市"),new City("C市"),new City("D市"),new City("E市"),new City("F市")};


		//市間の距離リスト
		Route[] routeList =
		{
				new Route(cityList[0],cityList[1],10),	/*A市→B市*/
				new Route(cityList[0],cityList[2],14),	/*A市→C市*/
				new Route(cityList[0],cityList[3],12),	/*A市→D市*/
				new Route(cityList[1],cityList[3],14),	/*B市→D市*/
				new Route(cityList[1],cityList[4],8),	/*B市→E市*/
				new Route(cityList[2],cityList[3],8),	/*C市→D市*/
				new Route(cityList[3],cityList[4],12),	/*D市→E市*/
				new Route(cityList[4],cityList[5],9)	/*E市→F市*/
		};

		//最短距離の探索
		while(true){
			boolean cont = false;
			for(int i=0;i<routeList.length;i++){
				City src = routeList[i].city1;
				City dst = routeList[i].city2;

				if(src.from == null){
					continue;
				}

				if(dst.from == null || src.totalDistance + routeList[i].distance <  dst.totalDistance){
					dst.from = src;
					dst.totalDistance = src.totalDistance + routeList[i].distance;
					cont = true;
				}
			}
			if(!cont)break;
		}

		//最短距離の出力
		System.out.println("A市からF市までの最短距離は"+cityList[5].totalDistance+"kmです。");

	}
}
