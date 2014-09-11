package jsoupapi;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class constellation {
	public String[] monthHTML(String iAstro){
		String[] HTML = new String[4];
		//目前時間
		Date date = new Date();
		//設定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//進行轉換
		String dateString = sdf.format(date);
		 URL url = null;
	        Iterator iterator0,iterator1,iterator1_1,iterator2,iterator2_2,iterator3;
			try {
				url = new URL("http://astro.click108.com.tw/monthly.php?iAstro="+iAstro+"&iAcDay="+dateString+"&iType=2");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        /*
	         * 向網頁伺服發出請求，並將回應分析成document。
	         * 第一個參數是：請求位置與QueryString。
	         * 第二個參數是：連線時間(毫秒)，在指定時間內若無回應則會丟出IOException
	         */       
	        Document doc = null;
			try {
				doc = Jsoup.parse(url, 3000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				 System.out.println(e.toString());
			}
			
			Element body = doc.body();
			Elements all = body.select("dt[btype=all]");
			Element all_p = all.get(0).select("p").get(0); ;
			iterator0 = all_p.select("p").iterator();       
	        while(iterator0.hasNext())
	        {               
	        	HTML[0] =  iterator0.next().toString().trim();
	        }   
	        
	        Elements love = body.select("dt[btype=love]");
			Element love_p0 = love.get(0).select("p").get(0);
			Element love_p1 = love.get(0).select("p").get(1);
			iterator1 = love_p0.select("p").iterator(); 
			iterator1_1 = love_p1.select("p").iterator();
	        while(iterator1.hasNext())
	        {     
	        	HTML[1] =  iterator1.next().toString().trim();   
	        }  
	        while(iterator1_1.hasNext())
	        {     
	        	HTML[1] +=  iterator1_1.next().toString().trim();   
	        }     
	        
	        Elements work = body.select("dt[btype=work]");
			Element work_p0 = work.get(0).select("p").get(0); 
			Element work_p1 = work.get(0).select("p").get(1);
			iterator2 = work_p0.select("p").iterator();
			iterator2_2 = work_p1.select("p").iterator();
	        while(iterator2.hasNext())
	        {               
	        	HTML[2] =   iterator2.next().toString().trim();
	        }   
	        while(iterator2_2.hasNext())
	        {               
	        	HTML[2] +=   iterator2_2.next().toString().trim();
	        }   
	        
	        Elements money = body.select("dt[btype=money]");
			Element money_p = money.get(0).select("p").get(0); ;
			iterator3 = money_p.select("p").iterator();       
	        while(iterator3.hasNext())
	        {               
	        	HTML[3] =  iterator3.next().toString().trim();
	        }      
	        
		return HTML;
	}
	
	public int starcss(String iAstro,String cssString){
		int starnum = 1;
				//目前時間
				Date date = new Date();
				//設定日期格式
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				//進行轉換
				String dateString = sdf.format(date);
				 URL url = null;
			        Iterator iterator0,iterator1,iterator2,iterator3;
					try {
						url = new URL("http://astro.click108.com.tw/monthly.php?iAstro="+iAstro+"&iAcDay="+dateString+"&iType=2");
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        
			        /*
			         * 向網頁伺服發出請求，並將回應分析成document。
			         * 第一個參數是：請求位置與QueryString。
			         * 第二個參數是：連線時間(毫秒)，在指定時間內若無回應則會丟出IOException
			         */       
			        Document doc = null;
					try {
						doc = Jsoup.parse(url, 3000);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						 System.out.println(e.toString());
					}
					
					Element body = doc.body();
					 String imgstyle  = body.select("div[class=STAR_LIGHT]").html();
				        //System.out.println(imgstyle);
				        String[] imgarray = imgstyle.split("<img");			     
				        for(int i=0;i<imgarray.length;i++){
				        	if(imgarray[i].contains(cssString))
				        		starnum += 1;
				        }
					return starnum;
		
	}

}
