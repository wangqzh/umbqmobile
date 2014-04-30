package com.yonyou.uap;


import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class BQDetailAnalysisContentPageActivity extends UMWindowActivity {

	protected UMWindow BQDetailAnalysisContentPage = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMImageButton imagebuttonBack = null;
protected UMImageButton imagebutton1 = null;
protected UMLabel label0 = null;
protected UMImageButton imagebutton4 = null;

	
	protected final static int ID_BQDETAILANALYSISCONTENTPAGE = 1649847611;
protected final static int ID_VIEWPAGE0 = 664032994;
protected final static int ID_TOOLBAR0 = 1579838210;
protected final static int ID_IMAGEBUTTONBACK = 844571590;
protected final static int ID_IMAGEBUTTON1 = 2039175011;
protected final static int ID_LABEL0 = 1948922469;
protected final static int ID_IMAGEBUTTON4 = 1125152825;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQDetailAnalysisContentPageController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.yonyou.uap";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		UMDslConfigure configure = new UMDslConfigure();
		this.getContainer();
		new Thread() {
			public void run() {
				UMPDebugClient.startServer();
			}
		}.start();
		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup,configure);
this.setContentView(currentPage);

		registerControl();
	}
	
	private void registerControl() {
		  idmap.put("BQDetailAnalysisContentPage",ID_BQDETAILANALYSISCONTENTPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("imagebuttonBack",ID_IMAGEBUTTONBACK);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton4",ID_IMAGEBUTTON4);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		
	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getToolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR0
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","tabbar"
);
toolbar0.setup();
imagebuttonBack = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTONBACK
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","themes/ios7/designer/tool_forward.png"
,"icon-pressed-image","themes/ios7/designer/tool_forward_touch.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
imagebuttonBack.setup();
toolbar0.addView(imagebuttonBack);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","tool_edit"
,"icon-pressed-image","tool_edit_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
imagebutton1.setup();
toolbar0.addView(imagebutton1);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"content","所有主题"
,"halign","center"
,"weight","1"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
label0.setup();
toolbar0.addView(label0);
imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON4
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","tool_del"
,"icon-pressed-image","tool_del_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
imagebutton4.setup();
toolbar0.addView(imagebutton4);

return toolbar0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#F5F5F5"
,"width","fill"
);
viewPage0.setup();
View toolbar0 = (View) getToolbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(toolbar0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQDetailAnalysisContentPage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQDETAILANALYSISCONTENTPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","BQDetailAnalysisContentPageController"
,"namespace","com.yonyou.uap"
);
BQDetailAnalysisContentPage.setup();
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
BQDetailAnalysisContentPage.addView(viewPage0);

return (UMWindow)BQDetailAnalysisContentPage;
}

	
	public void actionOnBackForward(View control, UMEventArgs args) {
    String actionid = "onBackForward";
  this.dataCollect();
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onBackForward",args);
}


}
