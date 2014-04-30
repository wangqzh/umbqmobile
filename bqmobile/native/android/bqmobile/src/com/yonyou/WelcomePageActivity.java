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

public abstract class WelcomePageActivity extends UMWindowActivity {

	protected UMWindow WelcomePage = null;
protected XVerticalLayout welcomePageView = null;
protected UMImage BQBackgroundView = null;

	
	protected final static int ID_WELCOMEPAGE = 969762366;
protected final static int ID_WELCOMEPAGEVIEW = 454554896;
protected final static int ID_BQBACKGROUNDVIEW = 1608750339;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "WelcomePageController";
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
		  idmap.put("WelcomePage",ID_WELCOMEPAGE);
  idmap.put("welcomePageView",ID_WELCOMEPAGEVIEW);
  idmap.put("BQBackgroundView",ID_BQBACKGROUNDVIEW);

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
	
	
	
	public View getWelcomePageViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
welcomePageView = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WELCOMEPAGEVIEW
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#F5F5F5"
,"width","fill"
);
welcomePageView.setup();
BQBackgroundView = (UMImage)ThirdControl.createControl(new UMImage(context),ID_BQBACKGROUNDVIEW
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitxy"
,"src","themes/ios7/hdpi/loading.png"
);
BQBackgroundView.setup();
welcomePageView.addView(BQBackgroundView);

return welcomePageView;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
WelcomePage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_WELCOMEPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","WelcomePageController"
,"namespace","com.ufida.uap"
);
WelcomePage.setup();
View welcomePageView = (View) getWelcomePageViewView((UMActivity)context,binderGroup,configure);
WelcomePage.addView(welcomePageView);

return (UMWindow)WelcomePage;
}

	
	

}
