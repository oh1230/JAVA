package step4;

import java.util.ArrayList;


class Item{
	private String itemName;
	private int price;

	public String getItemName(){
		return itemName;
	}

	public int getPrice(){
		return price;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public void setPrice(int price){
		this.price = price;
	}
}

public class PrintStackTraceTest1 {


    public static void main(String args[]) {

    	try{
	    	FileIn in = new FileIn();

	    	//ファイルのオープン
	    	if(!in.open("src/step4/data.csv")){
	    		System.out.println("ファイルが開けません。");
	    	}

	    	String line = null;
	    	ArrayList<Item> itemList = new ArrayList<Item>();
	    	String[] split = null;

	    	//ファイルの読み込み開始
	    	while((line = in.readLine()) != null ){
	    		split = line.split(",");
	    		Item item = new Item();
	    		item.setItemName(split[0]);
	    		item.setPrice(Integer.parseInt(split[1]));
	    		itemList.add(item);
	     	}

	    	//読み込んだデータをコンソール画面に出力
	    	int sumPrice = 0;
	    	for(Item item : itemList){
	    		System.out.println("商品名: "+item.getItemName()+"\t価格: "+item.getPrice());
	    		sumPrice += item.getPrice();
	    	}

	    	System.out.println("合計金額は"+sumPrice+"円です。");

    	}catch(Exception e){
    		System.out.println("エラーが発生しました！");
    		e.printStackTrace();
    	}
    }
}