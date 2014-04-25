package com.yonyou;


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

public abstract class BQHomePageActivity extends UMWindowActivity {

	protected UMWindow BQHomePage = null;
protected UMButton button0 = null;
protected UMButton button1 = null;
protected UMListViewBase listview0 = null;
protected XVerticalLayout viewPage0 = null;
protected UmpSlidingLayout slidingViewHome = null;
protected UmpSlidingLinearLayout mainWgt = null;
protected UMButton mainWgt_buttonUserInfo = null;
protected UMButton mainWgt_buttonSyset = null;
protected UMListViewBase mainWgt_listviewAnalysis = null;
protected UmpSlidingLinearLayout rightWgt = null;
protected XHorizontalLayout rightWgt_panel7 = null;
protected UMImage rightWgt_image3 = null;
protected XHorizontalLayout rightWgt_panel21 = null;
protected XVerticalLayout rightWgt_panel8 = null;
protected XHorizontalLayout rightWgt_panel10 = null;
protected UMLabel rightWgt_label4 = null;
protected XHorizontalLayout rightWgt_panel11 = null;
protected UMLabel rightWgt_label5 = null;
protected UMLabel rightWgt_label6 = null;
protected XHorizontalLayout rightWgt_panel9 = null;
protected UMImage rightWgt_image2 = null;

	
	protected final static int ID_BQHOMEPAGE = 1466625004;
protected final static int ID_BUTTON0 = 1686799857;
protected final static int ID_BUTTON1 = 772832692;
protected final static int ID_LISTVIEW0 = 1327227935;
protected final static int ID_VIEWPAGE0 = 1527200464;
protected final static int ID_SLIDINGVIEWHOME = 1868293740;
protected final static int ID_MAINWGT = 623098402;
protected final static int ID_MAINWGT_BUTTONUSERINFO = 2020794180;
protected final static int ID_MAINWGT_BUTTONSYSET = 571750971;
protected final static int ID_MAINWGT_LISTVIEWANALYSIS = 732673238;
protected final static int ID_RIGHTWGT = 1414373781;
protected final static int ID_RIGHTWGT_PANEL7 = 1183150862;
protected final static int ID_RIGHTWGT_IMAGE3 = 142803470;
protected final static int ID_RIGHTWGT_PANEL21 = 1879983589;
protected final static int ID_RIGHTWGT_PANEL8 = 1999813169;
protected final static int ID_RIGHTWGT_PANEL10 = 1729787352;
protected final static int ID_RIGHTWGT_LABEL4 = 2008737581;
protected final static int ID_RIGHTWGT_PANEL11 = 1266036429;
protected final static int ID_RIGHTWGT_LABEL5 = 1792001634;
protected final static int ID_RIGHTWGT_LABEL6 = 595259975;
protected final static int ID_RIGHTWGT_PANEL9 = 331564476;
protected final static int ID_RIGHTWGT_IMAGE2 = 102141049;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQHomePageController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.ufida.uap";
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
		  idmap.put("BQHomePage",ID_BQHOMEPAGE);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("slidingViewHome",ID_SLIDINGVIEWHOME);
  idmap.put("slidingViewHome",ID_SLIDINGVIEWHOME);
  idmap.put("mainWgt",ID_MAINWGT);
  idmap.put("mainWgt",ID_MAINWGT);
  idmap.put("mainWgt_buttonUserInfo",ID_MAINWGT_BUTTONUSERINFO);
  idmap.put("mainWgt_buttonSyset",ID_MAINWGT_BUTTONSYSET);
  idmap.put("mainWgt_listviewAnalysis",ID_MAINWGT_LISTVIEWANALYSIS);
  idmap.put("rightWgt",ID_RIGHTWGT);
  idmap.put("rightWgt",ID_RIGHTWGT);
  idmap.put("rightWgt_panel7",ID_RIGHTWGT_PANEL7);
  idmap.put("rightWgt_image3",ID_RIGHTWGT_IMAGE3);
  idmap.put("rightWgt_panel21",ID_RIGHTWGT_PANEL21);
  idmap.put("rightWgt_panel8",ID_RIGHTWGT_PANEL8);
  idmap.put("rightWgt_panel10",ID_RIGHTWGT_PANEL10);
  idmap.put("rightWgt_label4",ID_RIGHTWGT_LABEL4);
  idmap.put("rightWgt_panel11",ID_RIGHTWGT_PANEL11);
  idmap.put("rightWgt_label5",ID_RIGHTWGT_LABEL5);
  idmap.put("rightWgt_label6",ID_RIGHTWGT_LABEL6);
  idmap.put("rightWgt_panel9",ID_RIGHTWGT_PANEL9);
  idmap.put("rightWgt_image2",ID_RIGHTWGT_IMAGE2);

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
	
	
	
	public View getMainWgtView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {

//mainWgt
mainWgt = new UmpSlidingLinearLayout(context);
mainWgt.setId(ID_MAINWGT);
mainWgt.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
mainWgt.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
mainWgt.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
mainWgt.setBackgroundColor(Color.parseColor("#FFFFE0"));
mainWgt.setSlidingType(SlidingViewType.MAIN);
mainWgt.setOrientation(LinearLayout.VERTICAL);
mainWgt_buttonUserInfo = (UMButton)ThirdControl.createControl(new UMButton(context),ID_MAINWGT_BUTTONUSERINFO
,"halign","center"
,"width","fill"
,"font-pressed-color","#f2adb2"
,"pressed-color","#ff0000"
,"height","40.0"
,"color","#000040"
,"layout-type","relative"
,"font-size","17"
,"background","#ffffff"
,"value","用户信息"
,"font-family","default"
,"valign","center"
);
mainWgt_buttonUserInfo.setup();
mainWgt.addView(mainWgt_buttonUserInfo);
mainWgt_buttonSyset = (UMButton)ThirdControl.createControl(new UMButton(context),ID_MAINWGT_BUTTONSYSET
,"halign","center"
,"width","fill"
,"font-pressed-color","#f2adb2"
,"pressed-color","#ff0000"
,"height","44"
,"color","#000040"
,"layout-type","relative"
,"font-size","17"
,"background","#ffffff"
,"value","系统设置"
,"font-family","default"
,"margin-top","2"
,"valign","center"
);
mainWgt_buttonSyset.setup();
mainWgt.addView(mainWgt_buttonSyset);
mainWgt_listviewAnalysis = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_MAINWGT_LISTVIEWANALYSIS
,"halign","center"
,"height","360.0"
,"layout-type","linear"
,"layout","vbox"
,"width","320.0"
);
mainWgt_listviewAnalysis.setup();
mainWgt.addView(mainWgt_listviewAnalysis);

return mainWgt;
}
public View getRightWgt_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightWgt_panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTWGT_PANEL7
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","44"
,"valign","center"
);
rightWgt_panel7.setup();
rightWgt_image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_RIGHTWGT_IMAGE3
,"height","44"
,"layout-type","linear"
,"width","fill"
,"src","themes/ios7/designer/btn_fav.png"
);
rightWgt_image3.setup();
rightWgt_panel7.addView(rightWgt_image3);

return rightWgt_panel7;
}
public View getRightWgt_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightWgt_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTWGT_PANEL10
,"height","18"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","12"
,"valign","center"
);
rightWgt_panel10.setup();
rightWgt_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_RIGHTWGT_LABEL4
,"content","labej"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder rightWgt_label4_binder = new UMTextBinder((IUMContextAccessor)context);
rightWgt_label4_binder.setBindInfo(new BindInfo("telephone"));
rightWgt_label4_binder.setControl(rightWgt_label4);
binderGroup.addBinderToGroup(ID_RIGHTWGT_LABEL4, rightWgt_label4_binder);
rightWgt_label4.setup();
rightWgt_panel10.addView(rightWgt_label4);

return rightWgt_panel10;
}
public View getRightWgt_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightWgt_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTWGT_PANEL11
,"height","15"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
rightWgt_panel11.setup();
rightWgt_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_RIGHTWGT_LABEL5
,"content","label"
,"halign","left"
,"height","fill"
,"weight","142"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder rightWgt_label5_binder = new UMTextBinder((IUMContextAccessor)context);
rightWgt_label5_binder.setBindInfo(new BindInfo("name"));
rightWgt_label5_binder.setControl(rightWgt_label5);
binderGroup.addBinderToGroup(ID_RIGHTWGT_LABEL5, rightWgt_label5_binder);
rightWgt_label5.setup();
rightWgt_panel11.addView(rightWgt_label5);
rightWgt_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_RIGHTWGT_LABEL6
,"content","label"
,"halign","right"
,"height","fill"
,"weight","105"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder rightWgt_label6_binder = new UMTextBinder((IUMContextAccessor)context);
rightWgt_label6_binder.setBindInfo(new BindInfo("telephone"));
rightWgt_label6_binder.setControl(rightWgt_label6);
binderGroup.addBinderToGroup(ID_RIGHTWGT_LABEL6, rightWgt_label6_binder);
rightWgt_label6.setup();
rightWgt_panel11.addView(rightWgt_label6);

return rightWgt_panel11;
}
public View getRightWgt_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightWgt_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_RIGHTWGT_PANEL8
,"padding-right","8"
,"padding-top","12"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","12"
);
rightWgt_panel8.setup();
View rightWgt_panel10 = (View) getRightWgt_panel10View((UMActivity)context,binderGroup,configure);
rightWgt_panel8.addView(rightWgt_panel10);
View rightWgt_panel11 = (View) getRightWgt_panel11View((UMActivity)context,binderGroup,configure);
rightWgt_panel8.addView(rightWgt_panel11);

return rightWgt_panel8;
}
public View getRightWgt_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightWgt_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTWGT_PANEL9
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
rightWgt_panel9.setup();
rightWgt_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_RIGHTWGT_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","fill"
,"src","themes/ios7/designer/arrow.png"
);
rightWgt_image2.setup();
rightWgt_panel9.addView(rightWgt_image2);

return rightWgt_panel9;
}
public View getRightWgt_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightWgt_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTWGT_PANEL21
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","themes/ios7/designer/list_row_down3.png"
);
rightWgt_panel21.setup();
View rightWgt_panel8 = (View) getRightWgt_panel8View((UMActivity)context,binderGroup,configure);
rightWgt_panel21.addView(rightWgt_panel8);
View rightWgt_panel9 = (View) getRightWgt_panel9View((UMActivity)context,binderGroup,configure);
rightWgt_panel21.addView(rightWgt_panel9);

return rightWgt_panel21;
}
public View getRightWgtView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {

//rightWgt
rightWgt = new UmpSlidingLinearLayout(context);
rightWgt.setId(ID_RIGHTWGT);
rightWgt.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
rightWgt.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
rightWgt.getLayoutParams().height = 70;
rightWgt.setBackgroundColor(Color.parseColor("#ffffff"));
rightWgt.setSlidingType(SlidingViewType.RIGHT);
rightWgt.setOrientation(LinearLayout.HORIZONTAL);
View rightWgt_panel7 = (View) getRightWgt_panel7View((UMActivity)context,binderGroup,configure);
rightWgt.addView(rightWgt_panel7);
View rightWgt_panel21 = (View) getRightWgt_panel21View((UMActivity)context,binderGroup,configure);
rightWgt.addView(rightWgt_panel21);

return rightWgt;
}
public View getSlidingViewHomeView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {

//slidingViewHome
slidingViewHome = new UmpSlidingLayout(context);
slidingViewHome.setId(ID_SLIDINGVIEWHOME);
slidingViewHome.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
slidingViewHome.getLayoutParams().width = 320;
slidingViewHome.getLayoutParams().height = 460;
View mainWgt = (View) getMainWgtView((UMActivity)context,binderGroup,configure);
slidingViewHome.addView(mainWgt);
View rightWgt = (View) getRightWgtView((UMActivity)context,binderGroup,configure);
slidingViewHome.addView(rightWgt);
slidingViewHome.onInit(null);

return slidingViewHome;
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
View slidingViewHome = (View) getSlidingViewHomeView((UMActivity)context,binderGroup,configure);
viewPage0.addView(slidingViewHome);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQHomePage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQHOMEPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","BQHomePageController"
,"namespace","com.ufida.uap"
);
BQHomePage.setup();
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"width","fill"
,"font-pressed-color","#f2adb2"
,"pressed-color","#ff0000"
,"height","40.0"
,"color","#000040"
,"layout-type","linear"
,"font-size","17"
,"background","#ffffff"
,"value","用户信息"
,"font-family","default"
,"left","0.0"
,"valign","center"
,"top","0.0"
);
button0.setup();
BQHomePage.addView(button0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"width","fill"
,"font-pressed-color","#f2adb2"
,"pressed-color","#ff0000"
,"height","44"
,"color","#000040"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","17"
,"value","系统设置"
,"left","0.0"
,"font-family","default"
,"margin-top","2"
,"valign","center"
,"top","42.0"
);
button1.setup();
BQHomePage.addView(button1);
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"halign","center"
,"height","360.0"
,"layout-type","linear"
,"layout","vbox"
,"width","320.0"
,"left","0.0"
,"top","86.0"
);
listview0.setup();
BQHomePage.addView(listview0);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
BQHomePage.addView(viewPage0);

return (UMWindow)BQHomePage;
}

	
	

}
