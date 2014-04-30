Type.registerNamespace('com.yonyou.uap.BQFramePageControllerBase');
com.yonyou.uap.BQFramePageControllerBase = function() {
    //Step 1锛歩nherit the base class
    com.yonyou.uap.BQFramePageControllerBase.initializeBase(this);

    //Auto generate action map...
    this._actionMap = {
        jsCallbackLoadData : [this.jsCallbackLoadData],
        onLoadData : [this.onLoadData],
        onOpenAllWorksheet : [this.onOpenAllWorksheet],
        onOpenMyWorksheet : [this.onOpenMyWorksheet],
        onClickTopics : [this.onClickTopics]
    };

    //user controller instance
    this._userController = new com.yonyou.uap.BQFramePageController();

    //this._entity is the context define
    if(typeof com.yonyou.uap !='undefined' && typeof com.yonyou.uap.AnalysisTopicEntity != 'undefined'){
        this._entity = new com.yonyou.uap.AnalysisTopicEntity('context');
        $sys.version(2.0)
    }else{
        this._entity = null;
        $sys.version(1.0)
    }
    //this._context is the context data object
    if(typeof com.yonyou.uap !='undefined' && typeof com.yonyou.uap.AnalysisTopic != 'undefined'){
        this._context = new com.yonyou.uap.AnalysisTopic(this._entity.id(),this._entity,null);
        $sys.version(2.0);
    }else{
        this._context = null;
        $sys.version(1.0);
    }
}
function com$yonyou$uap$BQFramePageControllerBase$jsCallbackLoadData(json){
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
        this._userController.jsCallbackLoadData($context);
    	
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
function com$yonyou$uap$BQFramePageControllerBase$onLoadData(json){
    try{
        _$sys.callAction('onLoadData');
    }catch(e){
        alert(e.stack);
    }
    return json;
}
function com$yonyou$uap$BQFramePageControllerBase$onOpenAllWorksheet(json){
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
        this._userController.onOpenAllWorksheet($context);
    	
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
function com$yonyou$uap$BQFramePageControllerBase$onOpenMyWorksheet(json){
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
        this._userController.onOpenMyWorksheet($context);
    	
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
function com$yonyou$uap$BQFramePageControllerBase$onClickTopics(json){
    try{
        _$sys.callAction('onClickTopics');
    }catch(e){
        alert(e.stack);
    }
    return json;
}
com.yonyou.uap.BQFramePageControllerBase.prototype = {
    jsCallbackLoadData : com$yonyou$uap$BQFramePageControllerBase$jsCallbackLoadData,
    onLoadData : com$yonyou$uap$BQFramePageControllerBase$onLoadData,
    onOpenAllWorksheet : com$yonyou$uap$BQFramePageControllerBase$onOpenAllWorksheet,
    onOpenMyWorksheet : com$yonyou$uap$BQFramePageControllerBase$onOpenMyWorksheet,
    onClickTopics : com$yonyou$uap$BQFramePageControllerBase$onClickTopics
};
com.yonyou.uap.BQFramePageControllerBase.registerClass('com.yonyou.uap.BQFramePageControllerBase',UMP.UI.Mvc.Controller);
