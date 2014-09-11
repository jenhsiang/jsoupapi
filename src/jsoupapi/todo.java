package jsoupapi;
import jsoupapi.constellation;
/*import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;*/



public class todo {

	public static void main(String[] args) {
		constellation cc = new constellation();
		String[] HTML = cc.monthHTML("00");
		for(int i=0;i<HTML.length;i++){
			System.out.println(HTML[i]);
		}
		int star = cc.starcss("00", "daily_images/SUB_ALL/icon00.png");
		System.out.println(star);
	/*//目前時間
		Date date = new Date();
		//設定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//進行轉換
		String dateString = sdf.format(date);
		System.out.println(dateString);
		// TODO Auto-generated method stub
		//URL 以yahoo股票為測試
        URL url = null;
        Iterator iterator0,iterator1,iterator2,iterator3;
		try {
			url = new URL("http://astro.click108.com.tw/monthly.php?iAstro=00&iAcDay=2014-09-01&iType=2");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        /*
         * 向網頁伺服發出請求，並將回應分析成document。
         * 第一個參數是：請求位置與QueryString。
         * 第二個參數是：連線時間(毫秒)，在指定時間內若無回應則會丟出IOException
         */       
      /*  Document doc = null;
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
            System.out.println("all" + ": " + iterator0.next().toString().trim());
        }   
        
        Elements love = body.select("dt[btype=love]");
		Element love_p = love.get(0).select("p").get(0); ;
		iterator1 = love_p.select("p").iterator();       
        while(iterator1.hasNext())
        {               
            System.out.println("love" + ": " + iterator1.next().toString().trim());
        }      
        
        Elements work = body.select("dt[btype=work]");
		Element work_p = work.get(0).select("p").get(0); ;
		iterator2 = work_p.select("p").iterator();       
        while(iterator2.hasNext())
        {               
            System.out.println("work" + ": " + iterator2.next().toString().trim());
        }   
        
        Elements money = body.select("dt[btype=money]");
		Element money_p = money.get(0).select("p").get(0); ;
		iterator3 = money_p.select("p").iterator();       
        while(iterator3.hasNext())
        {               
            System.out.println("money" + ": " + iterator3.next().toString().trim());
        }      
        
        String imgstyle  = body.select("div[class=STAR_LIGHT]").html();
        //System.out.println(imgstyle);
        String[] imgarray = imgstyle.split("<img");
        int checkstar = 0;
        for(int i=0;i<imgarray.length;i++){
        	if(imgarray[i].contains("daily_images/SUB_ALL/icon00.png"))
        		checkstar += 1;
        }
        System.out.println(checkstar);
		 
        
		 
		
		/*Element head = doc.head();
		 String aa = head.select("meta[name=description]").attr("content");
		 String bb = head.select("title").html();
		    
			 System.out.println( aa);
			 System.out.println( bb);*/
         
        //取回所center下所有的table
     /*   Elements tables = doc.select("center>table");
        
        Iterator iterator;
        
        //print all table 
        /*
        for(Element table : tables)
        {
            //get td Iterator
         iterator = table.select("td").iterator();           
           
            while(iterator.hasNext())
            {               
                System.out.println("data" + ": " + iterator.next().text().trim());
            }          
        } 
        */        
     /*   System.out.println("--------------------------------------------------");        
        Element  table;
        
        //取標頭
        table = tables.get(1).select("table").get(0);        
        iterator = table.select("th").iterator();       
        while(iterator.hasNext())
        {               
            System.out.println("data" + ": " + iterator.next().toString().trim());
        } 
        
        System.out.println("--------------------------------------------------");  
        
        //取內容        
        //取索引1的table
        table = tables.get(1).select("table").get(1);
        
        //get td Iterator
        iterator = table.select("td").iterator();       
        while(iterator.hasNext())
        {               
            System.out.println("data" + ": " + iterator.next().toString().trim());
        }  */  
	}

}
