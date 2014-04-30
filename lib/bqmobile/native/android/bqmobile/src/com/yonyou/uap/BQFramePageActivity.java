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

public abstract class BQFramePageActivity extends UMWindowActivity {

	protected UMWindow BQFramePage = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMLabel widget0_label0 = null;
protected UMImageButton widget0_imagebutton1 = null;
protected UMImageButton widget0_imagebutton4 = null;
protected UMListViewBase widget0_listview0 = null;
protected XHorizontalLayout widget0_listview0_childWgt0 = null;
protected XHorizontalLayout widget0_listview0_childWgt0_panel7 = null;
protected UMImage widget0_listview0_childWgt0_image3 = null;
protected XHorizontalLayout widget0_listview0_childWgt0_panel21 = null;
protected XVerticalLayout widget0_listview0_childWgt0_panel8 = null;
protected XHorizontalLayout widget0_listview0_childWgt0_panel10 = null;
protected UMLabel widget0_listview0_childWgt0_label4 = null;
protected XHorizontalLayout widget0_listview0_childWgt0_panel11 = null;
protected UMLabel widget0_listview0_childWgt0_label5 = null;
protected UMLabel widget0_listview0_childWgt0_label6 = null;
protected XHorizontalLayout widget0_listview0_childWgt0_panel9 = null;
protected UMImage widget0_listview0_childWgt0_image2 = null;
protected XVerticalLayout widget0_widget0 = null;
protected XHorizontalLayout widget0_widget0_toolbar0 = null;
protected UMLabel widget0_widget0_label0 = null;
protected UMImageButton widget0_widget0_imagebuttonSelf = null;
protected UMLabel widget0_widget0_label1 = null;
protected UMImageButton widget0_widget0_imagebuttonAll = null;
protected UMLabel widget0_widget0_label2 = null;

	
	protected final static int ID_BQFRAMEPAGE = 1439677247;
protected final static int ID_VIEWPAGE0 = 68227427;
protected final static int ID_PANEL0 = 1465713383;
protected final static int ID_WIDGET0 = 391003347;
protected final static int ID_WIDGET0_TOOLBAR0 = 1171542763;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 1349747304;
protected final static int ID_WIDGET0_LABEL0 = 221412132;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 562872268;
protected final static int ID_WIDGET0_IMAGEBUTTON4 = 317146655;
protected final static int ID_WIDGET0_LISTVIEW0 = 301193860;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0 = 218621950;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL7 = 364441589;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_IMAGE3 = 1738053143;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL21 = 1683930030;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL8 = 733094902;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL10 = 93532633;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL4 = 501980992;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL11 = 408346326;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL5 = 939149339;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL6 = 2011409734;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL9 = 1684285127;
protected final static int ID_WIDGET0_LISTVIEW0_CHILDWGT0_IMAGE2 = 2057270186;
protected final static int ID_WIDGET0_WIDGET0 = 1565515665;
protected final static int ID_WIDGET0_WIDGET0_TOOLBAR0 = 335890983;
protected final static int ID_WIDGET0_WIDGET0_LABEL0 = 1570439149;
protected final static int ID_WIDGET0_WIDGET0_IMAGEBUTTONSELF = 2034199252;
protected final static int ID_WIDGET0_WIDGET0_LABEL1 = 467882348;
protected final static int ID_WIDGET0_WIDGET0_IMAGEBUTTONALL = 151590566;
protected final static int ID_WIDGET0_WIDGET0_LABEL2 = 259360627;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQFramePageController";
	}
	
	@Override
	public String getContextName() {
		return "AnalysisTopic";
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
		  idmap.put("BQFramePage",ID_BQFRAMEPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_label0",ID_WIDGET0_LABEL0);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);
  idmap.put("widget0_imagebutton4",ID_WIDGET0_IMAGEBUTTON4);
  idmap.put("widget0_listview0",ID_WIDGET0_LISTVIEW0);
  idmap.put("widget0_listview0_childWgt0",ID_WIDGET0_LISTVIEW0_CHILDWGT0);
  idmap.put("widget0_listview0_childWgt0_panel7",ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL7);
  idmap.put("widget0_listview0_childWgt0_image3",ID_WIDGET0_LISTVIEW0_CHILDWGT0_IMAGE3);
  idmap.put("widget0_listview0_childWgt0_panel21",ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL21);
  idmap.put("widget0_listview0_childWgt0_panel8",ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL8);
  idmap.put("widget0_listview0_childWgt0_panel10",ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL10);
  idmap.put("widget0_listview0_childWgt0_label4",ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL4);
  idmap.put("widget0_listview0_childWgt0_panel11",ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL11);
  idmap.put("widget0_listview0_childWgt0_label5",ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL5);
  idmap.put("widget0_listview0_childWgt0_label6",ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL6);
  idmap.put("widget0_listview0_childWgt0_panel9",ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL9);
  idmap.put("widget0_listview0_childWgt0_image2",ID_WIDGET0_LISTVIEW0_CHILDWGT0_IMAGE2);
  idmap.put("widget0_widget0",ID_WIDGET0_WIDGET0);
  idmap.put("widget0_widget0_toolbar0",ID_WIDGET0_WIDGET0_TOOLBAR0);
  idmap.put("widget0_widget0_label0",ID_WIDGET0_WIDGET0_LABEL0);
  idmap.put("widget0_widget0_imagebuttonSelf",ID_WIDGET0_WIDGET0_IMAGEBUTTONSELF);
  idmap.put("widget0_widget0_label1",ID_WIDGET0_WIDGET0_LABEL1);
  idmap.put("widget0_widget0_imagebuttonAll",ID_WIDGET0_WIDGET0_IMAGEBUTTONALL);
  idmap.put("widget0_widget0_label2",ID_WIDGET0_WIDGET0_LABEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //widget0_listview0 - onLoadData
    UMEventArgs args = new UMEventArgs(BQFramePageActivity.this);
    actionOnLoadData(widget0_listview0,args);

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
	
	
	
	public View getWidget0_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_TOOLBAR0
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","tabbar"
);
widget0_toolbar0.setup();
widget0_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON0
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
,"icon-background-image","tool_fav"
,"icon-pressed-image","tool_fav_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
widget0_imagebutton0.setup();
widget0_toolbar0.addView(widget0_imagebutton0);
widget0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL0
,"content","我的工作区"
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
widget0_label0.setup();
widget0_toolbar0.addView(widget0_label0);
widget0_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON1
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
widget0_imagebutton1.setup();
widget0_toolbar0.addView(widget0_imagebutton1);
widget0_imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON4
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
widget0_imagebutton4.setup();
widget0_toolbar0.addView(widget0_imagebutton4);

return widget0_toolbar0;
}
public View getWidget0_listview0_childWgt0_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0_panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL7
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","44"
,"valign","center"
);
widget0_listview0_childWgt0_panel7.setup();
widget0_listview0_childWgt0_image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_IMAGE3
,"height","44"
,"layout-type","linear"
,"width","fill"
,"src","themes/ios7/designer/btn_fav.png"
);
widget0_listview0_childWgt0_image3.setup();
widget0_listview0_childWgt0_panel7.addView(widget0_listview0_childWgt0_image3);

return widget0_listview0_childWgt0_panel7;
}
public View getWidget0_listview0_childWgt0_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL10
,"height","18"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","12"
,"valign","center"
);
widget0_listview0_childWgt0_panel10.setup();
widget0_listview0_childWgt0_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL4
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
UMTextBinder widget0_listview0_childWgt0_label4_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_listview0_childWgt0_label4_binder.setBindInfo(new BindInfo("name"));
widget0_listview0_childWgt0_label4_binder.setControl(widget0_listview0_childWgt0_label4);
binderGroup.addBinderToGroup(ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL4, widget0_listview0_childWgt0_label4_binder);
widget0_listview0_childWgt0_label4.setup();
widget0_listview0_childWgt0_panel10.addView(widget0_listview0_childWgt0_label4);

return widget0_listview0_childWgt0_panel10;
}
public View getWidget0_listview0_childWgt0_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL11
,"height","15"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
widget0_listview0_childWgt0_panel11.setup();
widget0_listview0_childWgt0_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL5
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
UMTextBinder widget0_listview0_childWgt0_label5_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_listview0_childWgt0_label5_binder.setBindInfo(new BindInfo("note"));
widget0_listview0_childWgt0_label5_binder.setControl(widget0_listview0_childWgt0_label5);
binderGroup.addBinderToGroup(ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL5, widget0_listview0_childWgt0_label5_binder);
widget0_listview0_childWgt0_label5.setup();
widget0_listview0_childWgt0_panel11.addView(widget0_listview0_childWgt0_label5);
widget0_listview0_childWgt0_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL6
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
UMTextBinder widget0_listview0_childWgt0_label6_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_listview0_childWgt0_label6_binder.setBindInfo(new BindInfo("telephone"));
widget0_listview0_childWgt0_label6_binder.setControl(widget0_listview0_childWgt0_label6);
binderGroup.addBinderToGroup(ID_WIDGET0_LISTVIEW0_CHILDWGT0_LABEL6, widget0_listview0_childWgt0_label6_binder);
widget0_listview0_childWgt0_label6.setup();
widget0_listview0_childWgt0_panel11.addView(widget0_listview0_childWgt0_label6);

return widget0_listview0_childWgt0_panel11;
}
public View getWidget0_listview0_childWgt0_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL8
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
widget0_listview0_childWgt0_panel8.setup();
View widget0_listview0_childWgt0_panel10 = (View) getWidget0_listview0_childWgt0_panel10View((UMActivity)context,binderGroup,configure);
widget0_listview0_childWgt0_panel8.addView(widget0_listview0_childWgt0_panel10);
View widget0_listview0_childWgt0_panel11 = (View) getWidget0_listview0_childWgt0_panel11View((UMActivity)context,binderGroup,configure);
widget0_listview0_childWgt0_panel8.addView(widget0_listview0_childWgt0_panel11);

return widget0_listview0_childWgt0_panel8;
}
public View getWidget0_listview0_childWgt0_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL9
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
widget0_listview0_childWgt0_panel9.setup();
widget0_listview0_childWgt0_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","fill"
,"src","themes/ios7/designer/arrow.png"
);
widget0_listview0_childWgt0_image2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQFramePageActivity.this);
    actionOnClickTopics(widget0_listview0_childWgt0_image2,args);

}
});
widget0_listview0_childWgt0_image2.setup();
widget0_listview0_childWgt0_panel9.addView(widget0_listview0_childWgt0_image2);

return widget0_listview0_childWgt0_panel9;
}
public View getWidget0_listview0_childWgt0_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0_PANEL21
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","themes/ios7/designer/list_row_down3.png"
);
widget0_listview0_childWgt0_panel21.setup();
View widget0_listview0_childWgt0_panel8 = (View) getWidget0_listview0_childWgt0_panel8View((UMActivity)context,binderGroup,configure);
widget0_listview0_childWgt0_panel21.addView(widget0_listview0_childWgt0_panel8);
View widget0_listview0_childWgt0_panel9 = (View) getWidget0_listview0_childWgt0_panel9View((UMActivity)context,binderGroup,configure);
widget0_listview0_childWgt0_panel21.addView(widget0_listview0_childWgt0_panel9);

return widget0_listview0_childWgt0_panel21;
}
public View getWidget0_listview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LISTVIEW0_CHILDWGT0
,"height","70"
,"layout-type","list"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
widget0_listview0_childWgt0.setup();
View widget0_listview0_childWgt0_panel7 = (View) getWidget0_listview0_childWgt0_panel7View((UMActivity)context,binderGroup,configure);
widget0_listview0_childWgt0.addView(widget0_listview0_childWgt0_panel7);
View widget0_listview0_childWgt0_panel21 = (View) getWidget0_listview0_childWgt0_panel21View((UMActivity)context,binderGroup,configure);
widget0_listview0_childWgt0.addView(widget0_listview0_childWgt0_panel21);

return widget0_listview0_childWgt0;
}
public View getWidget0_listview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_WIDGET0_LISTVIEW0
,"height","0"
,"weight","1"
,"childindicator","BQAnalysisTopicRowsWidget"
,"layout-type","linear"
,"background","#FFFFCC"
,"width","fill"
,"synccontext","topics"
);
UMListBinder widget0_listview0_binder = new UMListBinder((IUMContextAccessor)context);
widget0_listview0_binder.setBindInfo(new BindInfo("topics"));
widget0_listview0_binder.setControl(widget0_listview0);
binderGroup.addBinderToGroup(ID_WIDGET0_LISTVIEW0, widget0_listview0_binder);
widget0_listview0.setup();
widget0_listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View widget0_listview0_childWgt0 = (View) getWidget0_listview0_childWgt0View((UMActivity)context,binderGroup,configure);
return widget0_listview0_childWgt0;
}});

return widget0_listview0;
}
public View getWidget0_widget0_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_widget0_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_WIDGET0_TOOLBAR0
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","toolbar.png"
);
widget0_widget0_toolbar0.setup();
widget0_widget0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_WIDGET0_LABEL0
,"halign","center"
,"height","fill"
,"weight","21"
,"widthwrap","63.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget0_widget0_label0.setup();
widget0_widget0_toolbar0.addView(widget0_widget0_label0);
widget0_widget0_imagebuttonSelf = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_WIDGET0_IMAGEBUTTONSELF
,"halign","center"
,"width","64"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"pressed-color","#f8f8f8"
,"icon-height","25"
,"height","40"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","themes/ios7/designer/tab_fav_touch.png"
,"value","我的工作表"
,"icon-pressed-image","themes/ios7/designer/tool_fav_touch.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
widget0_widget0_imagebuttonSelf.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQFramePageActivity.this);
    actionOnOpenMyWorksheet(widget0_widget0_imagebuttonSelf,args);

}
});
widget0_widget0_imagebuttonSelf.setup();
widget0_widget0_toolbar0.addView(widget0_widget0_imagebuttonSelf);
widget0_widget0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_WIDGET0_LABEL1
,"halign","center"
,"height","fill"
,"weight","22"
,"widthwrap","66.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget0_widget0_label1.setup();
widget0_widget0_toolbar0.addView(widget0_widget0_label1);
widget0_widget0_imagebuttonAll = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_WIDGET0_IMAGEBUTTONALL
,"halign","center"
,"width","64"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"pressed-color","#f8f8f8"
,"icon-height","25"
,"height","40"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","themes/ios7/designer/tool_edit.png"
,"value","所有工作表"
,"icon-pressed-image","themes/ios7/designer/tool_edit_disable.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
widget0_widget0_imagebuttonAll.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQFramePageActivity.this);
    actionOnOpenAllWorksheet(widget0_widget0_imagebuttonAll,args);

}
});
widget0_widget0_imagebuttonAll.setup();
widget0_widget0_toolbar0.addView(widget0_widget0_imagebuttonAll);
widget0_widget0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_WIDGET0_LABEL2
,"halign","center"
,"height","fill"
,"weight","21"
,"widthwrap","63.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget0_widget0_label2.setup();
widget0_widget0_toolbar0.addView(widget0_widget0_label2);

return widget0_widget0_toolbar0;
}
public View getWidget0_widget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_WIDGET0
,"halign","center"
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"background","#FFFFE0"
);
widget0_widget0.setup();
View widget0_widget0_toolbar0 = (View) getWidget0_widget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0_widget0.addView(widget0_widget0_toolbar0);

return widget0_widget0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#FFFFE0"
,"width","fill"
);
widget0.setup();
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);
View widget0_listview0 = (View) getWidget0_listview0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_listview0);
View widget0_widget0 = (View) getWidget0_widget0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_widget0);

return widget0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
panel0.setup();
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
panel0.addView(widget0);

return panel0;
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
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQFramePage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQFRAMEPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"context","AnalysisTopic"
,"controller","BQFramePageController"
,"namespace","com.yonyou.uap"
);
BQFramePage.setup();
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
BQFramePage.addView(viewPage0);

return (UMWindow)BQFramePage;
}

	
	public void actionJsCallbackLoadData(View control, UMEventArgs args) {
    String actionid = "jsCallbackLoadData";
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "jsCallbackLoadData",args);
}
public void actionOnLoadData(View control, UMEventArgs args) {
    String actionid = "onLoadData";
    args.put("viewid","com.yonyou.uap.AnalysisTopicExtendController");
    args.put("callback","jsCallbackLoadData");
    args.put("action","load");
    args.put("autodatabinding","true");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnOpenAllWorksheet(View control, UMEventArgs args) {
    String actionid = "onOpenAllWorksheet";
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onOpenAllWorksheet",args);
}
public void actionOnOpenMyWorksheet(View control, UMEventArgs args) {
    String actionid = "onOpenMyWorksheet";
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onOpenMyWorksheet",args);
}
public void actionOnClickTopics(View control, UMEventArgs args) {
    String actionid = "onClickTopics";
    args.put("viewid","com.yonyou.uap.BQDetailAnalysisContentPage");
    args.put("iskeep","false");
    args.put("animation-type","Fade");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
