Type.registerNamespace('com.yonyou.uap.BQLoginPageControllerBase');
com.yonyou.uap.BQLoginPageControllerBase = function() {
    //Step 1锛歩nherit the base class
    com.yonyou.uap.BQLoginPageControllerBase.initializeBase(this);

    //Auto generate action map...
    this._actionMap = {
        connectSetting : [this.connectSetting],
        loginAction : [this.loginAction],
        openHTTPS : [this.openHTTPS],
        openMainview : [this.openMainview],
        loadconfig : [this.loadconfig]
    };

    //user controller instance
    this._userController = new com.yonyou.uap.BQLoginPageController();

    //this._entity is the context define
    if(typeof com.yonyou.uap !='undefined' && typeof com.yonyou.uap.USERSEntity != 'undefined'){
        this._entity = new com.yonyou.uap.USERSEntity('context');
        $sys.version(2.0)
    }else{
        this._entity = null;
        $sys.version(1.0)
    }
    //this._context is the context data object
    if(typeof com.yonyou.uap !='undefined' && typeof com.yonyou.uap.USERS != 'undefined'){
        this._context = new com.yonyou.uap.USERS(this._entity.id(),this._entity,null);
        $sys.version(2.0);
    }else{
        this._context = null;
        $sys.version(1.0);
    }
}
function com$yonyou$uap$BQLoginPageControllerBase$connectSetting(json){
    try{
        _$sys.callAction('connectSetting');
    }catch(e){
        alert(e.stack);
    }
    return json;
}
function com$yonyou$uap$BQLoginPageControllerBase$loginAction(json){
    try{
    	//when every action begin,  json-->$context
    	this._context = _$um$CRUD$load(this._context, json, this._entity);
    	if(this._context){
    	    $context = this._context;//
    	}else{
    	    $context = json;//compatible with the old code
    	}
    	    
        if(this._userController.initialize)
            this._userController.initialize();
        this._userController.login($context);
    	
    	//when every action end,  $context-->json
    	if(this._context == null){//compatible with the old code
    	    return $context;
    	}
    	var newjson = _$um$CRUD$Context2JSON($context);
    	return newjson;
    }catch(e){
        alert(e.stack);
    }
    return json;
}
function com$yonyou$uap$BQLoginPageControllerBase$openHTTPS(json){
    try{
        _$sys.callAction('openHTTPS');
    }catch(e){
        alert(e.stack);
    }
    return json;
}
function com$yonyou$uap$BQLoginPageControllerBase$openMainview(json){
    try{
        _$sys.callAction('openMainview');
    }catch(e){
        alert(e.stack);
    }
    return json;
}
function com$yonyou$uap$BQLoginPageControllerBase$loadconfig(json){
    try{
        _$sys.callAction('loadconfig');
    }catch(e){
        alert(e.stack);
    }
    return json;
}
com.yonyou.uap.BQLoginPageControllerBase.prototype = {
    connectSetting : com$yonyou$uap$BQLoginPageControllerBase$connectSetting,
    loginAction : com$yonyou$uap$BQLoginPageControllerBase$loginAction,
    openHTTPS : com$yonyou$uap$BQLoginPageControllerBase$openHTTPS,
    openMainview : com$yonyou$uap$BQLoginPageControllerBase$openMainview,
    loadconfig : com$yonyou$uap$BQLoginPageControllerBase$loadconfig
};
com.yonyou.uap.BQLoginPageControllerBase.registerClass('com.yonyou.uap.BQLoginPageControllerBase',UMP.UI.Mvc.Controller);
