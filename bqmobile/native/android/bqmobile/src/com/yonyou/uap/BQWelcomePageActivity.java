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

public abstract class BQWelcomePageActivity extends UMWindowActivity {

	protected UMWindow BQWelcomePage = null;
protected XVerticalLayout viewPage0 = null;
protected UMImage imageLogo = null;

	
	protected final static int ID_BQWELCOMEPAGE = 1202974227;
protected final static int ID_VIEWPAGE0 = 1251518643;
protected final static int ID_IMAGELOGO = 1288793596;

	
	protected UMWindow currentPage = null;
	
	@Override
	public String getControllerName() {
		return "BQWelcomePageController";
	}
	
	@Override
	public String getContextName() {
		return "delaytime";
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
		  idmap.put("BQWelcomePage",ID_BQWELCOMEPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("imageLogo",ID_IMAGELOGO);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - onAfterDisplay
    UMEventArgs args = new UMEventArgs(BQWelcomePageActivity.this);
    actionOnAfterDisplay(viewPage0,args);

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
	
	
	
	public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#F5F5F5"
,"width","fill"
);
viewPage0.setup();
imageLogo = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGELOGO
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitcenter"
,"src","themes/ios7/hdpi/loading.png"
);
imageLogo.setup();
viewPage0.addView(imageLogo);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BQWelcomePage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BQWELCOMEPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"context","delaytime"
,"controller","BQWelcomePageController"
,"namespace","com.yonyou.uap"
);
BQWelcomePage.setup();
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
BQWelcomePage.addView(viewPage0);

return (UMWindow)BQWelcomePage;
}

	
	public void actionOnAfterDisplay(View control, UMEventArgs args) {
    String actionid = "onAfterDisplay";
    args.put("containername","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterDesplay",args);
}


}
