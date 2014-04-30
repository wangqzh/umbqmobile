//=================================================== UMP.UI.Mvc.Router =========================================================
Type.registerNamespace('UMP.UI.Mvc');
UMP.UI.Mvc.Router = function UMP$UI$Mvc$Router(){
	//_actionMapping决定调用顺序
}
var __debugger = true;
function UMP$UI$Mvc$Router$route(controllerid,actionid,strJSON){
    $document.initialize();
	/******************************* console log begin******************************/
		try{
			$console.log("[info1] $route('"+controllerid+"','"+actionid+"',strJSON)--------------------beginning");
			var strlog="";
			if(typeof strJSON == "string"){
				strlog = "[info1] typeof strJSON == \"string\",此时strJson=" + strJSON;			
			}else if(typeof strJSON == "object"){
				strlog = "[info1] typeof strJSON == \"object\",此时strJson=" + $jsonToString(strJSON);
			}else{
				strlog = "[error1]:typeof strJSON 不是string也不是object,请检查";
			}
			$console.log(strlog);
		}catch(e){
			$console.alert("Log Exception:" + e.stack);
		}
    /******************************* console log end******************************/
    var returnContext = {};
	var json = null;
	if(typeof strJSON =="string"){
	    json = stringToJSON(strJSON);
	}else if(typeof strJSON =="object"){
	    json = strJSON;
	}else{
		return returnContext;
	}
	
	returnContext = json;//默认相等
	
    var controllerType = eval(controllerid);
	var controller = new controllerType();//demo:  var controller = new com.yonyou.um.view1ControllerBase();
	
	
	
	
	
	/*************************** $console.log begin *************************************/	
		try{
			var strlog = "[info5] " + controllerid + ".execute('"+actionid+"', "+$jsonToString(json)+")....开始";
			$console.log(strlog);
		}catch(e){
			$console.alert("Log Exception:" + e.stack);
		}
	/*************************** $console.log end ***************************************/
		
	returnContext = controller.execute(actionid, json);//execute method of the action
	
	
	/*************************** $console.log begin *************************************/	
		try{
			var strlog = "[info5] controller.execute('"+actionid+"', '"+$jsonToString(json)+"')....完毕，返回值returnContext=" + $jsonToString(returnContext);
			$console.log(strlog);
		}catch(e){
			$console.alert("Log Exception:" + e.stack);
		}
	/*************************** $console.log end ***************************************/
	
	
	
	
	if($sys.cancelPush() == true){
		$sys.cancelPush(false);
		/*************************** $console.log begin *************************************/	
			try{
				var strlog = "[info6] $sys.cancelPush() == true,不提交任何东西,直接return";
				$console.log(strlog);
			}catch(e){
				$console.alert("Log Exception:" + e.stack);
			}
		/*************************** $console.log end ***************************************/
		return;
	}
	
	var args = {};
	if($context.isDisposed && $context.isDisposed()){
		/*************************** $console.log begin *************************************/	
			try{
				var strlog = "[info7] $context.isDisposed() == true,将不提交Context到原生";
				$console.log(strlog);
			}catch(e){
				$console.alert("Log Exception:" + e.stack);
			}
		/*************************** $console.log end ***************************************/
	}else{		
		if(typeof returnContext !="string"){
			returnContext = jsonToString(returnContext);
		}
		args["context"] = returnContext;
		/*************************** $console.log begin *************************************/	
			try{
				var strlog = "[info7] push阶段的args准备完毕,此时args['context'] == '" + returnContext+"'";
				$console.log(strlog);
			}catch(e){
				$console.alert("Log Exception:" + e.stack);
			}
		/*************************** $console.log end ***************************************/
	}
	
	//because the native container check [document] and [context] forcibly, args must have the tow return object
	
	if(typeof $document !="undefined"){
		args["document"] = $document.dataToString();
		$document.clear();
	}else{
		args["document"] = {};
	}
	
	
	
	
	/******************************* console log ******************************/
	try{
    	var strlog = "[info9] 即将执行_$sys.push(args),此时arg=" + $jsonToString(args);
		$console.log(strlog);
    }catch(e){
		$console.alert("Log Exception:" + e.stack);
	}
	/******************************* console log end******************************/
	_$sys.push(args);
	
	//the code below can be remove, it has no usefull
    return returnContext;	
}
UMP.UI.Mvc.Router.prototype = {
    route: UMP$UI$Mvc$Router$route
};
UMP.UI.Mvc.Router.registerClass('UMP.UI.Mvc.Router');

if(typeof $router == "undefined")  {
	$router = new UMP.UI.Mvc.Router();
}


//================================== UMP.UI.Mvc.Controller ==========================================================================
Type.registerNamespace('UMP.UI.Mvc');
UMP.UI.Mvc.Controller = function UMP$UI$Mvc$Controller() {
	this._actionMap = {};//子类加载
	this._context = null;//子类加载
}

function UMP$UI$Mvc$Controller$execute_v1(actionid, json){
	var funArray = this._actionMap[actionid];
	for(var i=0,len=funArray.length;i<len;i++){
		var fun = funArray[i];
		//fun.apply(this,json[0]);		
		json = fun.call(this, json);		
	}
	return json;	
}
function UMP$UI$Mvc$Controller$execute(actionid, json){
	
	
	var fun = eval("this." + actionid);
	json = fun.call(this, json);
	
	return json;	
}
UMP.UI.Mvc.Controller.prototype = {
	execute: UMP$UI$Mvc$Controller$execute	
};
UMP.UI.Mvc.Controller.registerClass('UMP.UI.Mvc.Controller');







