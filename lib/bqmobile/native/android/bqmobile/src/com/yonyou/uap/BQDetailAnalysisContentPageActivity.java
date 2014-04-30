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
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected XHorizontalLayout toolbar1 = null;
protected UMImageButton imagebutton0 = null;
protected UMImageButton imagebutton2 = null;
protected UMImageButton imagebutton3 = null;
protected UMImageButton imagebutton5 = null;
protected UMImageButton imagebutton6 = null;

	
	protected final static int ID_BQDETAILANALYSISCONTENTPAGE = 192538594;
protected final static int ID_VIEWPAGE0 = 1787500768;
protected final static int ID_TOOLBAR0 = 185768498;
protected final static int ID_IMAGEBUTTONBACK = 1269932668;
protected final static int ID_IMAGEBUTTON1 = 2079902328;
protected final static int ID_LABEL0 = 1090675249;
protected final static int ID_IMAGEBUTTON4 = 1977785359;
protected final static int ID_LISTVIEW0 = 390789632;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1542529951;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 1864187880;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 1703734815;
protected final static int ID_TOOLBAR1 = 1657468034;
protected final static int ID_IMAGEBUTTON0 = 1327055411;
protected final static int ID_IMAGEBUTTON2 = 1337137134;
protected final static int ID_IMAGEBUTTON3 = 1897711905;
protected final static int ID_IMAGEBUTTON5 = 1979224986;
protected final static int ID_IMAGEBUTTON6 = 929287497;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQDetailAnalysisContentPageController";
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
		  idmap.put("BQDetailAnalysisContentPage",ID_BQDETAILANALYSISCONTENTPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("imagebuttonBack",ID_IMAGEBUTTONBACK);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton4",ID_IMAGEBUTTON4);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("toolbar1",ID_TOOLBAR1);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("imagebutton2",ID_IMAGEBUTTON2);
  idmap.put("imagebutton3",ID_IMAGEBUTTON3);
  idmap.put("imagebutton5",ID_IMAGEBUTTON5);
  idmap.put("imagebutton6",ID_IMAGEBUTTON6);

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
imagebuttonBack.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQDetailAnalysisContentPageActivity.this);
    actionOnBackForward(imagebuttonBack,args);

}
});
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
,"content","功能主题列表"
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
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"height","60"
,"layout-type","list"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
listview0_childWgt0.setup();
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"content","label"
,"halign","left"
,"height","20.0"
,"color","#000000"
,"layout-type","list"
,"font-size","14"
,"width","160.0"
,"margin-left","12"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_label0.setup();
listview0_childWgt0.addView(listview0_childWgt0_label0);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"halign","left"
,"widthwrap","130.0"
,"width","wrap"
,"content","label"
,"margin-right","12"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","list"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("note"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_label1.setup();
listview0_childWgt0.addView(listview0_childWgt0_label1);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"weight","1"
,"height","0"
,"childindicator","BQAnalysisTopicRowWidget"
,"layout-type","linear"
,"background","#FFFFCC"
,"width","fill"
);
listview0.setup();
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt0 = (View) getListview0_childWgt0View((UMActivity)context,binderGroup,configure);
return listview0_childWgt0;
}});

return listview0;
}
public View getToolbar1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR1
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","tabbar"
);
toolbar1.setup();
imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON0
,"halign","center"
,"weight","1"
,"width","0"
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
imagebutton0.setup();
toolbar1.addView(imagebutton0);
imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON2
,"halign","center"
,"weight","1"
,"width","0"
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
imagebutton2.setup();
toolbar1.addView(imagebutton2);
imagebutton3 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON3
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","tool_forward"
,"icon-pressed-image","tool_forward_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
imagebutton3.setup();
toolbar1.addView(imagebutton3);
imagebutton5 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON5
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","tool_camera"
,"icon-pressed-image","tool_camera_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
imagebutton5.setup();
toolbar1.addView(imagebutton5);
imagebutton6 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON6
,"halign","center"
,"weight","1"
,"width","0"
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
imagebutton6.setup();
toolbar1.addView(imagebutton6);

return toolbar1;
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
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listview0);
View toolbar1 = (View) getToolbar1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(toolbar1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQDetailAnalysisContentPage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQDETAILANALYSISCONTENTPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"context","AnalysisTopic"
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
