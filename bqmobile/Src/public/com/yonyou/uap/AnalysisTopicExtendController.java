package com.yonyou.uap;

import java.util.*;
import org.json.*;

import com.yonyou.uap.um.context.util.*;
import com.yonyou.uap.um.controller.*;
import com.yonyou.uap.um.gateway.exception.*;
import com.yonyou.uap.um.gateway.service.*;

public class AnalysisTopicExtendController extends AnalysisTopicController
{ 
    @Override
    public String load(String args) {
        // TODO finish the method body
    	 JSONObject mobj;
		try {
			// some child row
			JSONArray children = new JSONArray();
			for (int i = 0; i < 5; ++i)
			{
				JSONObject obj = new JSONObject();
				obj.put("id", "10000"+i);
				obj.put("name", "成本分析_"+i);
				obj.put("note", "AAAAA");
				children.put(obj);
			}
			// one row
			 mobj = new JSONObject(super.load(args));
			 mobj.put("id", "1000");
	         mobj.put("name", "成本分析");
	         mobj.put("note", "");
	         mobj.put("childrows", children);
	        // dataset
	         JSONArray marr = new JSONArray();
	         marr.put(mobj);

	         JSONObject rtnobj = new JSONObject();
	         rtnobj.put("topics", marr);
	         return rtnobj.toString();
		} catch (UmControllerException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
         
         
        return "";
       
    }

    @Override
    public String save(String args) {
        // TODO finish the method body
        return super.save(args);
    }

    // TODO finish your special method
}
