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

public abstract class BQLoginPageActivity extends UMWindowActivity {

	protected UMWindow BQLoginPage = null;
protected XVerticalLayout viewPageLogin = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel labelLoginTitle = null;
protected UMButton buttonConset = null;
protected UMTextbox textboxUserName = null;
protected UMPassword textboxPassword = null;
protected XHorizontalLayout panel0 = null;
protected UMLabel label2 = null;
protected UMLabel labelAutoLogin = null;
protected UMSwitch switchAutoLogin = null;
protected UMButton buttonLogin = null;

	
	protected final static int ID_BQLOGINPAGE = 1090256587;
protected final static int ID_VIEWPAGELOGIN = 1529053916;
protected final static int ID_NAVIGATORBAR0 = 1908268208;
protected final static int ID_BUTTON0 = 1657888153;
protected final static int ID_LABELLOGINTITLE = 776431612;
protected final static int ID_BUTTONCONSET = 2053384573;
protected final static int ID_TEXTBOXUSERNAME = 1123325149;
protected final static int ID_TEXTBOXPASSWORD = 2133847069;
protected final static int ID_PANEL0 = 1532568837;
protected final static int ID_LABEL2 = 1205778244;
protected final static int ID_LABELAUTOLOGIN = 583553611;
protected final static int ID_SWITCHAUTOLOGIN = 576042050;
protected final static int ID_BUTTONLOGIN = 1641982083;

	
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
		  idmap.put("BQLoginPage",ID_BQLOGINPAGE);
  idmap.put("viewPageLogin",ID_VIEWPAGELOGIN);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("labelLoginTitle",ID_LABELLOGINTITLE);
  idmap.put("buttonConset",ID_BUTTONCONSET);
  idmap.put("textboxUserName",ID_TEXTBOXUSERNAME);
  idmap.put("textboxPassword",ID_TEXTBOXPASSWORD);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("labelAutoLogin",ID_LABELAUTOLOGIN);
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
labelAutoLogin = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABELAUTOLOGIN
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
labelAutoLogin.setup();
panel0.addView(labelAutoLogin);
switchAutoLogin = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCHAUTOLOGIN
,"padding-left","2"
,"pressed-image","slideswitch"
,"width","51"
,"background-image-dis","slideswitch"
,"switch-trackoff-image","switch_off"
,"switch-trackon-image","slideswitch"
,"height","fill"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"value","off"
,"font-family","default"
,"background-image","slideswitch"
);
switchAutoLogin.setup();
panel0.addView(switchAutoLogin);

return panel0;
}
public View getViewPageLoginView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPageLogin = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGELOGIN
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#F5F5F5"
,"width","fill"
,"background-image","contest_bg"
);
viewPageLogin.setup();
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPageLogin.addView(navigatorbar0);
textboxUserName = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOXUSERNAME
,"padding-left","39"
,"padding-top","21"
,"halign","LEFT"
,"pressed-image","textbox"
,"width","fill"
,"background-image-dis","textbox"
,"padding-bottom","5"
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
viewPageLogin.addView(textboxUserName);
textboxPassword = (UMPassword)ThirdControl.createControl(new UMPassword(context),ID_TEXTBOXPASSWORD
,"padding-left","39"
,"padding-top","21"
,"halign","LEFT"
,"pressed-image","textbox"
,"width","fill"
,"background-image-dis","textbox"
,"padding-bottom","5"
,"margin-right","12"
,"maxlength","256"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"margin-left","12"
,"value","123456"
,"font-family","default"
,"margin-top","4"
,"background-image","textbox_passwd"
);
UMTextBinder textboxPassword_binder = new UMTextBinder((IUMContextAccessor)context);
textboxPassword_binder.setBindInfo(new BindInfo("passWord"));
textboxPassword_binder.setControl(textboxPassword);
binderGroup.addBinderToGroup(ID_TEXTBOXPASSWORD, textboxPassword_binder);
textboxPassword.setup();
viewPageLogin.addView(textboxPassword);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPageLogin.addView(panel0);
buttonLogin = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTONLOGIN
,"halign","center"
,"pressed-image","themes/ios7/hdpi/login_touch.png"
,"width","fill"
,"font-pressed-color","#ffffff"
,"pressed-color","#e50011"
,"margin-right","12"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","17"
,"margin-left","12"
,"font-family","default"
,"margin-top","12"
,"valign","center"
);
buttonLogin.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BQLoginPageActivity.this);
    actionLoadconfig(buttonLogin,args);

}
});
buttonLogin.setup();
viewPageLogin.addView(buttonLogin);

return viewPageLogin;
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
,"namespace","com.ufida.uap"
);
BQLoginPage.setup();
View viewPageLogin = (View) getViewPageLoginView((UMActivity)context,binderGroup,configure);
BQLoginPage.addView(viewPageLogin);

return (UMWindow)BQLoginPage;
}

	
	public void actionConnectSetting(View control, UMEventArgs args) {
    String actionid = "connectSetting";
    args.put("viewid","com.yonyou.BQLoginPageconset");
    args.put("iskeep","false");
    args.put("animation-type","Fade");
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionLoginAction(View control, UMEventArgs args) {
    String actionid = "loginAction";
  this.dataCollect();
    args.put("callback","openHTTPS");
    args.put("type","nc");
    args.put("user","#{userName}");
    args.put("containername","");
    args.put("pass","#{passWord}");
  ActionProcessor.exec(this, actionid, args);
UMService.login(args);
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
    args.put("viewid","com.yonyou.Personlist");
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
