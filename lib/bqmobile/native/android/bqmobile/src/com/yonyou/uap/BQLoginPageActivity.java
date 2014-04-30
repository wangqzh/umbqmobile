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

public abstract class BQLoginPageActivity extends UMWindowActivity {

	protected UMWindow BQLoginPage = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel labelLoginTitle = null;
protected UMButton buttonConset = null;
protected UMTextbox textboxUserName = null;
protected UMPassword textboxPassword = null;
protected XHorizontalLayout panel0 = null;
protected UMLabel label2 = null;
protected UMLabel label1 = null;
protected UMSwitch switchAutoLogin = null;
protected UMButton buttonLogin = null;

	
	protected final static int ID_BQLOGINPAGE = 427203579;
protected final static int ID_VIEWPAGE0 = 1586497146;
protected final static int ID_NAVIGATORBAR0 = 1049101557;
protected final static int ID_BUTTON0 = 1669573462;
protected final static int ID_LABELLOGINTITLE = 1968194703;
protected final static int ID_BUTTONCONSET = 1794304567;
protected final static int ID_TEXTBOXUSERNAME = 104348800;
protected final static int ID_TEXTBOXPASSWORD = 571315498;
protected final static int ID_PANEL0 = 24695405;
protected final static int ID_LABEL2 = 367571295;
protected final static int ID_LABEL1 = 1006829904;
protected final static int ID_SWITCHAUTOLOGIN = 921518890;
protected final static int ID_BUTTONLOGIN = 458030299;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQLoginPageController";
	}
	
	@Override
	public String getContextName() {
		return "USERS";
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
		  idmap.put("BQLoginPage",ID_BQLOGINPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("labelLoginTitle",ID_LABELLOGINTITLE);
  idmap.put("buttonConset",ID_BUTTONCONSET);
  idmap.put("textboxUserName",ID_TEXTBOXUSERNAME);
  idmap.put("textboxPassword",ID_TEXTBOXPASSWORD);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label1",ID_LABEL1);
  idmap.put("switchAutoLogin",ID_SWITCHAUTOLOGIN);
  idmap.put("buttonLogin",ID_BUTTONLOGIN);

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
,"height","44.0"
,"color","#e50011"
,"pressed-image","nav"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"background-image-dis","navbar_login"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login"
);
navigatorbar0.setup();
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"width","84"
,"font-family","default"
,"valign","center"
);
button0.setup();
navigatorbar0.addView(button0);
labelLoginTitle = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABELLOGINTITLE
,"content","用户登录"
,"halign","center"
,"height","25.0"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
labelLoginTitle.setup();
navigatorbar0.addView(labelLoginTitle);
buttonConset = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTONCONSET
,"margin-right","12"
,"halign","center"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","72"
,"value","设置链接"
,"font-family","default"
,"valign","center"
);
buttonConset.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQLoginPageActivity.this);
    actionConnectSetting(buttonConset,args);

}
});
buttonConset.setup();
navigatorbar0.addView(buttonConset);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"margin-right","12"
,"height","32"
,"layout-type","linear"
,"width","fill"
,"margin-left","12"
,"margin-top","12"
,"valign","center"
);
panel0.setup();
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","center"
,"height","14.0"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","0"
,"font-family","default"
,"valign","center"
);
label2.setup();
panel0.addView(label2);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content","自动登录"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90.0"
,"font-family","default"
,"valign","center"
);
label1.setup();
panel0.addView(label1);
switchAutoLogin = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCHAUTOLOGIN
,"padding-left","2"
,"width","51"
,"background-image-dis","slideswitch"
,"switch-trackoff-image","switch_off"
,"switch-trackon-image","slideswitch"
,"height","fill"
,"color","#e50011"
,"font-size","18"
,"background","#167ef8"
,"layout-type","linear"
,"value","off"
,"font-family","default"
);
switchAutoLogin.setup();
panel0.addView(switchAutoLogin);

return panel0;
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
textboxUserName = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOXUSERNAME
,"padding-left","39"
,"padding-top","0"
,"halign","LEFT"
,"pressed-image","textbox"
,"width","fill"
,"background-image-dis","textbox"
,"padding-bottom","0"
,"margin-right","12"
,"maxlength","256"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"margin-left","12"
,"value","admin"
,"font-family","default"
,"margin-top","2"
,"background-image","textbox_user"
);
UMTextBinder textboxUserName_binder = new UMTextBinder((IUMContextAccessor)context);
textboxUserName_binder.setBindInfo(new BindInfo("userName"));
textboxUserName_binder.setControl(textboxUserName);
binderGroup.addBinderToGroup(ID_TEXTBOXUSERNAME, textboxUserName_binder);
textboxUserName.setup();
viewPage0.addView(textboxUserName);
textboxPassword = (UMPassword)ThirdControl.createControl(new UMPassword(context),ID_TEXTBOXPASSWORD
,"padding-left","39"
,"padding-top","0"
,"halign","LEFT"
,"pressed-image","textbox"
,"width","fill"
,"background-image-dis","textbox"
,"padding-bottom","0"
,"margin-right","12"
,"maxlength","256"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"margin-left","12"
,"value","1234"
,"font-family","default"
,"margin-top","4"
,"background-image","textbox_passwd"
);
UMTextBinder textboxPassword_binder = new UMTextBinder((IUMContextAccessor)context);
textboxPassword_binder.setBindInfo(new BindInfo("passWord"));
textboxPassword_binder.setControl(textboxPassword);
binderGroup.addBinderToGroup(ID_TEXTBOXPASSWORD, textboxPassword_binder);
textboxPassword.setup();
viewPage0.addView(textboxPassword);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
buttonLogin = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTONLOGIN
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
,"value","登录"
,"margin-left","12"
,"font-family","default"
,"margin-top","12"
,"valign","center"
);
buttonLogin.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQLoginPageActivity.this);
    actionLoginAction(buttonLogin,args);

}
});
buttonLogin.setup();
viewPage0.addView(buttonLogin);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQLoginPage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQLOGINPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"context","USERS"
,"controller","BQLoginPageController"
,"namespace","com.yonyou.uap"
);
BQLoginPage.setup();
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
BQLoginPage.addView(viewPage0);

return (UMWindow)BQLoginPage;
}

	
	public void actionConnectSetting(View control, UMEventArgs args) {
    String actionid = "connectSetting";
    args.put("viewid","com.yonyou.uap.BQLoginConsetPage");
    args.put("iskeep","false");
    args.put("animation-type","Fade");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionLoginAction(View control, UMEventArgs args) {
    String actionid = "loginAction";
  this.dataCollect();
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "login",args);
}
public void actionOpenHTTPS(View control, UMEventArgs args) {
    String actionid = "openHTTPS";
    args.put("ishttps","#{ishttps}");
    args.put("callback","openMainview");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMService.openHTTPS(args);
}
public void actionOpenMainview(View control, UMEventArgs args) {
    String actionid = "openMainview";
    args.put("viewid","com.yonyou.uap.BQFramePage");
    args.put("iskeep","false");
    args.put("animation-type","Fade");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionLoadconfig(View control, UMEventArgs args) {
    String actionid = "loadconfig";
    args.put("ishttps","ishttps");
    args.put("callback","openHTTPS");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMService.loadConfigure(args);
}


}
