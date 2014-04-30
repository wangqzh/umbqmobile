Type.registerNamespace('com.yonyou.uap.BQWelcomePageControllerBase');
com.yonyou.uap.BQWelcomePageControllerBase = function() {
    //Step 1锛歩nherit the base class
    com.yonyou.uap.BQWelcomePageControllerBase.initializeBase(this);

    //Auto generate action map...
    this._actionMap = {
        onAfterDisplay : [this.onAfterDisplay]
    };

    //user controller instance
    this._userController = new com.yonyou.uap.BQWelcomePageController();

    //this._entity is the context define
    if(typeof com.yonyou.uap !='undefined' && typeof com.yonyou.uap.delaytimeEntity != 'undefined'){
        this._entity = new com.yonyou.uap.delaytimeEntity('context');
        $sys.version(2.0)
    }else{
        this._entity = null;
        $sys.version(1.0)
    }
    //this._context is the context data object
    if(typeof com.yonyou.uap !='undefined' && typeof com.yonyou.uap.delaytime != 'undefined'){
        this._context = new com.yonyou.uap.delaytime(this._entity.id(),this._entity,null);
        $sys.version(2.0);
    }else{
        this._context = null;
        $sys.version(1.0);
    }
}
function com$yonyou$uap$BQWelcomePageControllerBase$onAfterDisplay(json){
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
        this._userController.afterDesplay($context);
    	
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
com.yonyou.uap.BQWelcomePageControllerBase.prototype = {
    onAfterDisplay : com$yonyou$uap$BQWelcomePageControllerBase$onAfterDisplay
};
com.yonyou.uap.BQWelcomePageControllerBase.registerClass('com.yonyou.uap.BQWelcomePageControllerBase',UMP.UI.Mvc.Controller);
