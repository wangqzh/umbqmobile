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

public abstract class BQLoginConsetPageActivity extends UMWindowActivity {

	protected UMWindow BQLoginConsetPage = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMLabel label0 = null;
protected UMLabel label2 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel0 = null;
protected UMTextbox textbox0 = null;
protected UMLabel label3 = null;
protected UMTextbox textbox1 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label4 = null;
protected UMLabel label5 = null;
protected UMSwitch switch0 = null;
protected UMButton button0 = null;

	
	protected final static int ID_BQLOGINCONSETPAGE = 557828689;
protected final static int ID_VIEWPAGE0 = 623928407;
protected final static int ID_NAVIGATORBAR0 = 987291977;
protected final static int ID_LABEL0 = 1614069513;
protected final static int ID_LABEL2 = 414737730;
protected final static int ID_LABEL1 = 902405868;
protected final static int ID_PANEL0 = 1235298598;
protected final static int ID_TEXTBOX0 = 1030962962;
protected final static int ID_LABEL3 = 387354348;
protected final static int ID_TEXTBOX1 = 220300091;
protected final static int ID_PANEL1 = 840085316;
protected final static int ID_LABEL4 = 16023828;
protected final static int ID_LABEL5 = 1881579150;
protected final static int ID_SWITCH0 = 656536366;
protected final static int ID_BUTTON0 = 1820082975;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQLoginConsetController";
	}
	
	@Override
	public String getContextName() {
		return "ConectionInfo";
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
		  idmap.put("BQLoginConsetPage",ID_BQLOGINCONSETPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("label3",ID_LABEL3);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("switch0",ID_SWITCH0);
  idmap.put("button0",ID_BUTTON0);

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
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-right","8"
,"padding-left","8"
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","navbar_login"
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login"
);
navigatorbar0.setup();
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","14.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","32.0"
,"font-family","default"
,"valign","center"
);
label0.setup();
navigatorbar0.addView(label0);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","设置链接"
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
label2.setup();
navigatorbar0.addView(label2);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","14.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","32.0"
,"font-family","default"
,"valign","center"
);
label1.setup();
navigatorbar0.addView(label1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"margin-right","12"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-left","12"
,"margin-top","2"
,"valign","center"
);
panel0.setup();
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","2"
,"padding-top","0"
,"halign","LEFT"
,"weight","2"
,"width","0"
,"padding-bottom","0"
,"maxlength","256"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"value","10.2.112.98"
,"font-family","default"
,"background-image","setting_ip"
);
UMTextBinder textbox0_binder = new UMTextBinder((IUMContextAccessor)context);
textbox0_binder.setBindInfo(new BindInfo("ip"));
textbox0_binder.setControl(textbox0);
binderGroup.addBinderToGroup(ID_TEXTBOX0, textbox0_binder);
textbox0.setup();
panel0.addView(textbox0);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","center"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","26"
,"font-family","default"
,"valign","center"
);
label3.setup();
panel0.addView(label3);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"padding-left","2"
,"padding-top","0"
,"halign","LEFT"
,"weight","1"
,"width","0"
,"padding-bottom","0"
,"maxlength","256"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"value","8080"
,"font-family","default"
,"background-image","setting_port"
);
UMTextBinder textbox1_binder = new UMTextBinder((IUMContextAccessor)context);
textbox1_binder.setBindInfo(new BindInfo("port"));
textbox1_binder.setControl(textbox1);
binderGroup.addBinderToGroup(ID_TEXTBOX1, textbox1_binder);
textbox1.setup();
panel0.addView(textbox1);

return panel0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"margin-right","12"
,"height","32"
,"layout-type","linear"
,"width","fill"
,"margin-left","12"
,"margin-bottom","12"
,"margin-top","12"
,"valign","center"
);
panel1.setup();
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","center"
,"height","14.0"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
label4.setup();
panel1.addView(label4);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"content","是否HTTPS"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
label5.setup();
panel1.addView(label5);
switch0 = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCH0
,"padding-left","2"
,"width","51"
,"background-image-dis","slideswitch"
,"switch-trackoff-image","switch_off"
,"height","fill"
,"switch-trackon-image","slideswitch"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"background","#167ef8"
,"value","off"
,"font-family","default"
);
UMSwitchBinder switch0_binder = new UMSwitchBinder((IUMContextAccessor)context);
switch0_binder.setBindInfo(new BindInfo("ishttps"));
switch0_binder.setControl(switch0);
binderGroup.addBinderToGroup(ID_SWITCH0, switch0_binder);
switch0.setup();
panel1.addView(switch0);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#F5F5F5"
,"width","fill"
,"background-image","contest_bg"
);
viewPage0.setup();
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"width","fill"
,"font-pressed-color","#ffffff"
,"pressed-color","#f6a6ac"
,"margin-right","12"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","17"
,"value","保 存"
,"margin-left","12"
,"font-family","default"
,"valign","center"
);
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQLoginConsetPageActivity.this);
    actionSettingSave(button0,args);

}
});
button0.setup();
viewPage0.addView(button0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQLoginConsetPage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQLOGINCONSETPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"context","ConectionInfo"
,"controller","BQLoginConsetController"
,"namespace","com.yonyou.uap"
);
BQLoginConsetPage.setup();
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
BQLoginConsetPage.addView(viewPage0);

return (UMWindow)BQLoginConsetPage;
}

	
	public void actionSettingSave(View control, UMEventArgs args) {
    String actionid = "settingSave";
    args.put("port","#{port}");
    args.put("host","#{ip}");
    args.put("ishttps","#{ishttps}");
  this.dataCollect();
    args.put("callback","closeWindow");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMService.writeConfigure(args);
}
public void actionCloseWindow(View control, UMEventArgs args) {
    String actionid = "closeWindow";
    args.put("viewid","com.yonyou.uap.BQLoginPage");
    args.put("iskeep","false");
    args.put("animation-type","Fade");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
